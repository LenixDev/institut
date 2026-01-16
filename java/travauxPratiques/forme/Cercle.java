package forme;
class Cercle extends Forme {
  private double rayon;
  private static final double PI = 3.14159;

  Cercle(double rayon, String couleur, double x, double y) {
    super(couleur, x, y);
    this.rayon = rayon;
  }

  public double calculerAire() { return PI * (rayon * rayon);}

  public double calculerPerimetre() { return 2 * PI * rayon; }

  public double getDiametre() { return 2 * rayon; }
}