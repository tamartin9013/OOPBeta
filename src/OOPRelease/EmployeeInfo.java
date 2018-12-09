package OOPRelease;

import java.util.Scanner;
import java.util.regex.*;


public class EmployeeInfo {

    //Fields:
    private StringBuilder name;
    private String code;
    private String deptId;
    private Pattern pattern = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
    private Scanner in;

    //Default Constructor
    public EmployeeInfo() {
        in = new Scanner(System.in);
        setName();
        setDeptId();
    }

    //Methods:
    public StringBuilder getName() {
        return name;
    }

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

    private String inputName() {
        System.out.println("Please enter your first and last name: ");
        String nameString = in.nextLine();
        return nameString;
    }

    private boolean checkName(StringBuilder name) {
        if (name.indexOf(" ") > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getDeptId() {
        System.out.println("Please enter the department ID: ");
        String id = in.nextLine();
        return id;
    }

    private void setDeptId() {
        String id = getDeptId();
        if (validId(id)) {
            this.deptId = reverseString(id);
        } else {
            this.deptId = "None01";
        }
    }

    private String getId() {
        return deptId;
    }

    private boolean validId(String id) {
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    @Override
    public String toString() {
        String output  = "";
        output += "Employee Code : " + this.code + "\n" +
                "Department Number : " + this.deptId;
        return output;
    }

    public String reverseString(String id) {
        byte[] strAsByteArray = id.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        return new String(result);
    }
}
