public class Constructors {
  String titulaire;
  double solde;

  public Constructors() {
    this("titulaire", 0.0);
  }

  public Constructors(String titulaire, double solde) {
    this.titulaire = titulaire;
    this.solde = solde;
  }

  public Constructors(double solde) {
    this("titulaire", solde);
  }

  public Constructors(String titulaire) {
    this(titulaire, 0.0);
  }

  public void init() {
    System.out.println("le titulaire est: " + this.titulaire + " et le solde est: " + this.solde);
  }
  
  public static void main(String[] args) {
    Constructors obj1 = new Constructors();
    obj1.init();
  }
}