package compte;

public class Client {
  private String nom;
  private String prenom;
  private int numero;
  Client() {
    this.nom = "";
    this.prenom = "";
    this.numero = 0;
  }
  Client(String nom, String prenom, int numero) {
    this.nom = nom;
    this.prenom = prenom;
    this.numero = numero;
  }
  public String getNom() {
    return this.nom;
  }
  public String getPrenom() {
    return this.prenom;
  }
  public int getNumero() {
    return this.numero;
  }
  public void setNom(String nom) {
    this.nom = nom;
  }
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public String toString() {
    return "[Le client N° " + this.numero + " est : " + this.nom + " " + this.prenom + "]";
  }
  public void afficher() {
    System.out.println("[Le client N° " + this.numero + " est : " + this.nom + " " + this.prenom + "]");
  }
}
