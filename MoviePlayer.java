/**
 * 10/27/2018
 * Author: T. Martin
 * Description: Extends product, implements controls for movie player and adds screen and monitor type.
 */
 
public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType montiorType;

  public MoviePlayer(String name) {

    super(name);
    screen = new Screen("1024x768", 60, 10);
    montiorType = MonitorType.LCD;
    
  }


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


  // Combines Screen types
  public String toString() {

    return super.toString() +
           "\n" + screen.toString() + 
           "\n" + "Monitor Type: "+ montiorType;
           
  }

}