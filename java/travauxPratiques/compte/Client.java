package compte;

public class Client {
  private String nom;
  private String prenom;
  private int numero;
  protected Client() {
    this.nom = "";
    this.prenom = "";
    this.numero = 0;
  }
  protected Client(String nom, String prenom, int numero) {
    this.nom = nom;
    this.prenom = prenom;
    this.numero = numero;
  }
  protected String getNom() {
    return this.nom;
  }
  protected String getPrenom() {
    return this.prenom;
  }
  protected int getNumero() {
    return this.numero;
  }
  protected void setNom(String nom) {
    this.nom = nom;
  }
  protected void setPrenom(String prenom) {
    this.prenom = prenom;
  }
  protected void setNumero(int numero) {
    this.numero = numero;
  }
  protected void afficher() {
    System.out.println("[Le client N° " + this.numero + " est : " + this.nom + " " + this.prenom + "]");
  }
  public String toString() {
    return "[Le client N° " + this.numero + " est : " + this.nom + " " + this.prenom + "]";
  }
}
