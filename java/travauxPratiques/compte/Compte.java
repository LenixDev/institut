package compte;

public class Compte {
  private int numero;
  private double solde;
  private Client client;
  protected Compte() {
    this.client = new Client();
    this.numero = 0;
    this.solde = 0;
  }
  protected Compte(Client client, int numero, double solde) {
    this.client = client;
    this.numero = numero;
    this.solde = solde;
  }
  protected Client getClient() {
    return this.client;
  }
  protected int getNumero() {
    return this.numero;
  }
  protected double getSolde() {
    return this.solde;
  }
  protected void setClient(Client client) {
    this.client = client;
  }
  protected void setNumero(int numero) {
    this.numero = numero;
  }
  protected void setSolde(double solde) {
    this.solde = solde;
  }
  protected void depot(double montant) {
    this.solde += montant;
  }
  protected void retrait(double montant) {
    if (this.solde >= montant) {
      this.solde -= montant;
    } else {
      System.out.println("Solde insuffisant");
    }
  }
  protected void afficher() {
    System.out.println("[Le compte N° " + this.numero + " à " + this.solde + " da, son propriétaire est : [Le client N° " + this.client.getNumero() + " est : " + this.client.getNom() + " " + this.client.getPrenom() + "]]");
  }
  protected String getNomClient() {
    return this.client.getNom();
  }
  protected String getPrenomClient() {
    return this.client.getPrenom();
  }
  protected void setNomClient(String nom) {
    this.client.setNom(nom);
  }
  protected void setPrenomClient(String prenom) {
    this.client.setPrenom(prenom);
  }
  public String toString() {
    return "[Le compte N° " + this.numero + " à " + this.solde + " da, son propriétaire est : [Le client N° " + this.client.getNumero() + " est : " + this.client.getNom() + " " + this.client.getPrenom() + "]]";
  }
}
