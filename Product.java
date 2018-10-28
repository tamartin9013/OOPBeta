/**
 * 10/27/2018
 * Author: T. Martin
 * Description: Implements Item, adds on serial number manufacturer, manufacture date, 
 * and product name.
 */
import java.util.Date;


public abstract class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private String manufacturer = Item.MANUFACTURER;
  private Date manufacturedOn;
  private String name;

  private static int currentProductionNumber = 1;


  /* Constructor that populates the product name, maufacturer, manufacturer date, and serial number, which it increments. */
  public Product(String productName) {
    name = productName;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }


  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
  }

  
  public void setName(String currentName) {
    name = currentName;
  }


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