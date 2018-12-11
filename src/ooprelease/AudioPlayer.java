package ooprelease;

/**
* Outputs audio specifications and media type with a toString and uses the
* MultimediaControl template to control audio.
*
* @author Tyler Martin
*/
public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  /**
  * Contructor that instantiates a new Audio player.
  * 
  * @param name                 product name
  * @param audioSpecification   product sudio spec
  */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
  }
  
  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  /**
  *
  * @return String representation of super class and product infromation to console. 
  */
  public String toString() {
    String printString = super.toString();
    printString += "\n" + "Audio Spec : " + audioSpecification
                + "\n" + "Type : " + mediaType;
    return printString;
  }

}
