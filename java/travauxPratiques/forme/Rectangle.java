package forme;
class Rectangle extends Forme {
  private double longueur, largeur;
  Rectangle(double longueur, double largeur, String couleur, double x, double y) {
    super(couleur, x, y);
    this.longueur = longueur;
    this.largeur = largeur;
  }

  public double calculerAire() { return longueur * largeur; }
  public double calculerPerimetre() { return 2 * (longueur + largeur); }

  public boolean estCarre() { return longueur == largeur; }
}