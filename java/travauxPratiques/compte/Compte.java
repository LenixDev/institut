package compte;

public class Compte {
  private int numero;
  private double solde;
  private Client client;
  Compte() {
    this.client = new Client();
    this.numero = 0;
    this.solde = 0;
  }
  Compte(Client client, int numero, double solde) {
    this.client = client;
    this.numero = numero;
    this.solde = solde;
  }
  public Client getClient() {
    return this.client;
  }
  public int getNumero() {
    return this.numero;
  }
  public double getSolde() {
    return this.solde;
  }
  public void setClient(Client client) {
    this.client = client;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public void setSolde(double solde) {
    this.solde = solde;
  }
  public void depot(double montant) {
    this.solde += montant;
  }
  public void retrait(double montant) {
    if (this.solde >= montant) {
      this.solde -= montant;
    } else {
      System.out.println("Solde insuffisant");
    }
  }
  public String toString() {
    return "[Le compte N° " + this.numero + " à " + this.solde + " da, son propriétaire est : [Le client N° " + this.client.getNumero() + " est : " + this.client.getNom() + " " + this.client.getPrenom() + "]]";
  }
  public void afficher() {
    System.out.println("[Le compte N° " + this.numero + " à " + this.solde + " da, son propriétaire est : [Le client N° " + this.client.getNumero() + " est : " + this.client.getNom() + " " + this.client.getPrenom() + "]]");
  }
  public String getNomClient() {
    return this.client.getNom();
  }
  public String getPrenomClient() {
    return this.client.getPrenom();
  }
  public void setNomClient(String nom) {
    this.client.setNom(nom);
  }
  public void setPrenomClient(String prenom) {
    this.client.setPrenom(prenom);
  }
}
