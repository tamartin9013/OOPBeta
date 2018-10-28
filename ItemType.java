/**
 * 10/27/2018
 * Author: T. Martin
 * Description: Enum to store the type of item. 
 */

enum ItemType{
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");
  
 public String code;
  
  ItemType(String code) {
    this.code = code;
  }
  
}