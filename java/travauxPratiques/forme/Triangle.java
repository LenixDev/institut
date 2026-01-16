package forme;
class Triangle extends Forme {
  private double base, hauteur, cote1, cote2, cote3;

  Triangle(String couleur, double x, double y, double base, double hauteur, double cote1, double cote2, double cote3) {
    super(couleur, x, y);
    this.base = base;
    this.hauteur = hauteur;
    this.cote1 = cote1;
    this.cote2 = cote2;
    this.cote3 = cote3;
  }

  public double calculerAire() {
    return (this.base * this.hauteur) / 2;
  }
  public double calculerPerimetre() {
    return this.cote1 + this.cote2 + this.cote3;
  }

}