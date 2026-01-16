public class Rectangle {
  double longeur;
  double largeur;

  public Rectangle(double longeur, double largeur) {
    this.longeur = longeur;
    this.largeur = largeur;
  }

  private double Perimetre(double longeur, double largeur) {
    return (longeur + largeur) * 2;
  }

  private double Aire(double longeur, double largeur) {
    return longeur * largeur;
  }

  private boolean EstCarre(double longeur, double largeur) {
    return longeur == largeur ? true : false;
  }

  public void  AfficherRectangle(double longeur, double largeur) {
    double perimetre = Perimetre(longeur, largeur);
    double aire = Aire(longeur, largeur);
    boolean carre = EstCarre(longeur, largeur);
    System.out.println("Perimetre: " + perimetre + ", Aire: " + aire + ", Carre: " + carre);
  }

  public static void main(String[] arg) {
    Rectangle nonCarre = new Rectangle(6, 5);
    Rectangle carre = new Rectangle(6, 6);
    nonCarre.AfficherRectangle(6, 5);
    carre.AfficherRectangle(6, 6);
  }
}