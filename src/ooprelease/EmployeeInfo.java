package ooprelease;

import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Used to get employee and department data from the user to generate a userId and perform operations
 * on the department Id.
 *
 * @author Tyler Martin
 */
public class EmployeeInfo {

  //Fields:
  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern pattern = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
  private Scanner in;

  //Default Constructor
  public EmployeeInfo() {
    in = new Scanner(System.in); //FindBugs error reliance on default encoding
    setName();
    setDeptId();
  }

  /**
   * @return String name: employee name
   */
  public StringBuilder getName() {
    return name;
  }
  
  /**
   * Returns employee code
   *
   * @return String generated employee code: first initial, last name
   */
  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) { //if name has space:
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else { // If name does not have space
      code = "Invalid name, enter first and last name, separated by a space";
    }
  }

  /**
   * Promts the user for an input of their first and last name.
   * @return String fullname as entered by the user
   */
  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    String nameString = in.nextLine();
    return nameString;
  }
  
  /**
   * Check Name for requested format: first and last seperated by a space.
   *
   * @param name   the name from user input
   *
   * @return boolean value of whether the name is formatted as specified with the space between strings.
   */
  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * Display prompt and get user input for deptId field
   *
   * @return String user-entered department Id
   */  
  public String getDeptId() {
    System.out.println("Please enter the department ID: ");
    String id = in.nextLine();
    return id;
  }

  // Mutator for deptId, calls get
  private void setDeptId() {
    String id = getDeptId();
    if (validId(id)) {
      this.deptId = reverseString(id);
    } else {
      this.deptId = "None01";
    }
  }
  
  /**
   * Accessor method for deptId
   *
   * @return String depttId
   */
  private String getId() {
    return deptId;
  }
  
  /**
   * Validate employee user input values
   *
   * @param id   the id value inputed by the user
   *
   * @return boolean whether the id is valid
   */
  private boolean validId(String id) {
    Matcher matcher = pattern.matcher(id);
    return matcher.matches();
  }

  @Override
  public String toString() {
    String output  = "";
    output += "Employee Code : " + this.code + "\n"
        + "Department Number : " + this.deptId;
    return output;
  }

  public String reverseString(String id) {
    byte[] strAsByteArray = id.getBytes(); //FindBugs error reliance on default encoding
    byte[] result = new byte[strAsByteArray.length];

    for (int i = 0; i < strAsByteArray.length; i++) {
      result[i] = strAsByteArray[strAsByteArray.length - i - 1];
    }
    return new String(result); //FindBugs error reliance on default encoding
  }
}
