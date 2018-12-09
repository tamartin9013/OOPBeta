/**
 * 10/27/2018
 * Author: T. Martin
 * Description: Extends product, implements controls for movie player and adds screen and
 * monitor type.
 */

package ooprelease;

public class MoviePlayer extends Product implements MultimediaControl {

  // Initialises two Movie Player Attributes
  private Screen screen;
  private MonitorType montiorType;

  // Constructor for Movie Player object
  public MoviePlayer(String name, Screen screen, MonitorType type) {
    super(name);
    this.screen = screen;
    this.montiorType = type;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopped");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  // Creates string output of movie player object
  public String toString() {
    return super.toString()
            + "\n" + screen.toString()
            + "\n" + "Monitor Type: " + montiorType;
  }

}