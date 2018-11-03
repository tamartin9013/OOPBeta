/**
 * 10/27/2018
 * Author: T. Martin
 * Description: Screen implements the data in ScreenSpec and combines the populated fields
 *  into a single string with a toString.
 */
 
public class Screen implements ScreenSpec {

  protected String resolution;
  protected int refreshrate;
  protected int responsetime;

  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshrate;
  }

  public int getResponseTime() {
    return responsetime;
  }

  // Combines the Screen specification fields into a single string.
  public String toString() {
    return "Resolution: " + resolution + "\n"
            + "Refresh Rate: " + refreshrate + "\n"
            + "Response Time: " + responsetime;
  }

}