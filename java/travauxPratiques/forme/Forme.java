package forme;
abstract class Forme {
  protected String couleur;
  protected double x, y;
  
  Forme(String couleur, double x, double y) {
    this.couleur = couleur;
    this.x = x;
    this.y = y;
  }

  public abstract double calculerAire();
  public abstract double calculerPerimetre();

  public void afficherInfo() {
    System.out.println("la couleur: " + this.couleur);
    System.out.println("le x: " + this.x);
    System.out.println("le y: " + this.y);
    System.out.println("l'aire: " + this.calculerAire());
    System.out.println("le perimetre: " + this.calculerPerimetre());
  }
  
  public void deplacer(double newX, double newY) {
    this.x = newX;
    this.y = newY;
    System.out.println("Déplacé vers (" + newX + ", " + newY + ")");
  }
  
  public String getCouleur() { return this.couleur; }

}