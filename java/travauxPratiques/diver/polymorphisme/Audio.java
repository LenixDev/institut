package diver.polymorphisme;

public class Audio extends Media {
  private int debit;
  private Audio(int debit) {
    this.debit = debit;
  }
  void lire() {
    System.out.println("Lecture de l'audio en " + this.debit + "kbps");
  }
}