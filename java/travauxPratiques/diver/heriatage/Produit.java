package diver.heriatage;

public abstract class Produit {
  private int id;
  private String designation;
  double prixHT;
  Produit(int id, String designation, double prixHT) {
    this.id = id;
    this.designation = designation;
    this.prixHT = prixHT;
  }

  abstract void afficherDetails();
  double calculerPrixTTC() {
    return prixHT * 1.2;
  }
}
