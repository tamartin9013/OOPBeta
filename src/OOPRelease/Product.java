/**
 * 10/27/2018
 * Author: T. Martin
 * Description: Implements Item, adds on serial number manufacturer, manufacture date, 
 * and product name.
 */
package OOPRelease;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  // Initialize attributes for product class
  private int serialNumber;
  private String manufacturer = Item.MANUFACTURER;
  private Date manufacturedOn;
  private String name;
  private static int currentProductionNumber = 1;

  /* Constructor that populates the product name, maufacturer, manufacturer date,
  * and serial number, which it increments.
  */
  public Product(String productName) {
    name = productName;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  // Sets currentProduction number to productionNumber.
  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
  }

  // Sets the current string in  "name" to new string "currentName"
  public void setName(String currentName) {
    name = currentName;
  }

  // Returns name
  public String getName() {
    return name;
  }

  public int compareTo(Product comp) {
    return name.compareTo(comp.getName());
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  // Combines the data above, mentioned in the constructor, into a single string.
  public String toString() {
    return  "Manufacturer : " + manufacturer + "\n"
            + "Serial Number : " + serialNumber + "\n"
            + "Date : " + manufacturedOn + "\n"
            + "Name : " + name;
  }

}