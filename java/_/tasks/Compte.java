public class Compte {
  private double solde;
  private String titulaire;

  

  public Compte(String titulaire) {
    this.solde = solde;
    this.titulaire = titulaire;
  }

  private void Afficher(double solde, String titulaire) {
    System.out.println("Compte de " + titulaire + ": " + solde + " da");
  }

  private double Deposer(double solde, double montant) {
    return solde + montant;
  }

  private double Retirer(double solde, double montant) {
    return solde - montant;
  }

  private void VirerVers(double montant, Compte destinataire) {
    this.solde = Retirer(this.solde, montant);
    destinataire.solde = Deposer(destinataire.solde, montant);
  }

  public void AfficherCompte(double solde, String titulaire) {
    Afficher(solde, titulaire);
  }

  public static void main(String[] args) {
    Compte compte1 = new Compte("Titulaire 1");
    Compte compte2 = new Compte("Titulaire 2");

    compte1.solde = compte1.Deposer(compte1.solde, 30000);
    compte2.solde = compte2.Deposer(compte2.solde, 60000);
    compte1.solde = compte1.Retirer(compte1.solde, 10000);
    compte2.VirerVers(25000, compte1);

    compte1.AfficherCompte(compte1.solde, compte1.titulaire);
    compte2.AfficherCompte(compte2.solde, compte2.titulaire);
  }
}