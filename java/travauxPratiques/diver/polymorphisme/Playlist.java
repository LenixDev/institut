package diver.polymorphisme;
import java.util.ArrayList;

public class Playlist extends Media {
  private Playlist() {
    super();
  }
  @Override
  void lire() {}
  private ArrayList<Media> medias = new ArrayList<Media>();
  private void lireTout() {
    for (Media media : medias) {
      media.lire();
    }
  }
}
