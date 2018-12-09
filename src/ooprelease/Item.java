/**
 * 10/25/2018
 * Author: T. Martin
 * Description: Item interface to store the maufacturer constant and various
 * accessor and mutator methods.
 */

package ooprelease;

import java.util.Date;

//Interface to create product.
public interface Item {
        
  //constants
  String MANUFACTURER = "Oracle Production";
      
  //methods
  public void setProductionNumber(int productionNumber);

  public void setName(String name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();
}