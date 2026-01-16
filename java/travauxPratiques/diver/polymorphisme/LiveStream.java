package diver.polymorphisme;

public class LiveStream extends Media {
  private String urlServeur;
  private LiveStream(String urlServeur) {
    this.urlServeur = urlServeur;
  }
  void lire() {
    System.out.println("Lecture en direct via " + this.urlServeur);
  }
}