/**
 * 10/27/2018
 * Author: T. Martin
 * Description: Outputs audio specifications and media type with a toString and uses the
 * MultimediaControl template to control audio.
 */

package ooprelease;


public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  // Constructor for Audio Player object
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

  //Creates a string representation of the Audio product object.
  public String toString() {
    String printString = super.toString();
    printString += "\n" + "Audio Spec : " + audioSpecification
                + "\n" + "Type : " + mediaType;
    return printString;
  }

}