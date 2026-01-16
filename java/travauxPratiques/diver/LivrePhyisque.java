package diver;

public class LivrePhyisque extends Produit {
  private double poids;
  private double fraisLivraison;
  private LivrePhyisque(int id, String designation, double prixHT, double poids) {
    super(id, designation, prixHT);
    this.poids = poids;
    this.fraisLivraison = poids * 0.01;
  }
  @Override // not necessary, but better for bug reveals, tells java that this is not a method :)
  void afficherDetails() {
    System.out.println("Poids : " + this.poids + " kg");
    System.out.println("Frais de livraison : " + this.fraisLivraison + " €");
  }
  @Override
  double calculerPrixTTC() {
    return this.prixHT * 1.2 + this.fraisLivraison;
  }
}