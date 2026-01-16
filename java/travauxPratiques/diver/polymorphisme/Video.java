package diver.polymorphisme;

public class Video extends Media {
  private int resolution;
  private Video(int resolution) {
    this.resolution = resolution;
  }
  void lire() {
    System.out.println("Lecture de la vidéo en " + this.resolution + "p");
  }
}