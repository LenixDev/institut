class Access {
  private double solde;

  public void deposer(double montant) {
    if (montant > 0) {
      solde += montant;
    }
  }

  public double getSolde() {
    return solde;
  }
}