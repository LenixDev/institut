class Personne {
  String nom;
  int age;

  public Personne() {
    this.nom = "inconnu";
    this.age = 0;
  }

  public static void main(String[] args) {
    Personne personne1 = new Personne();
    System.out.println("Le nom de la personne est: " + personne1.nom + " et l'age est: " + personne1.age);
  }
}