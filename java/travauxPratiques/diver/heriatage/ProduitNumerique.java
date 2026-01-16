package diver.heriatage;

public class ProduitNumerique extends Produit {
  private String lienTelechargement;
  private double tailleFichier;
  private ProduitNumerique(int id, String designation, double prixHT, String lienTelechargement, double tailleFichier) {
    super(id, designation, prixHT);
    this.lienTelechargement = lienTelechargement;
    this.tailleFichier = tailleFichier;
  }
  @Override // not necessary, but better for bug reveals, tells java that this is not a method :)
  void afficherDetails() {
    System.out.println("Lien de telechargement : " + this.lienTelechargement);
    System.out.println("Taille du fichier : " + this.tailleFichier + " Mo");
  }
}
