class PersonneTask {
  private String nom;
  private int age;

  public PersonneTask(String nom, int age) {
    this.nom = nom;
    this.age = age;
  }

  public String getNom() {
    return nom;
  }

  public int getAge() {
    return age;
  }

  public void afficher() {
    System.out.println("Le nom est: " + getNom() + " et l'age est: " + getAge());
  }
}