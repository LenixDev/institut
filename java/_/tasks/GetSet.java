class GetSet {
  private String nom;
  private String prenom;
  private int age;
  private double salaire;

  private GetSet(String nom, String prenom, int age, double salaire) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.salaire = salaire;
  }

  private String getName() {
    return nom + " " + prenom;
  }

  private int getAge() {
    return age;
  }

  private double getSalary() {
    return salaire;
  }

  private void setName(String name, String prenom) {
    this.nom = name;
    this.prenom = prenom;
  }

  private void setAge(int age) {
    this.age = age;
  }
  
  private void setSalary(double salary) {
   this.salaire = salary; 
  }

  public static void main(String[] arg) {
    GetSet personne = new GetSet("Lenix", "Dev", 20, 100);
    System.out.println(personne.getName());
    System.out.println(personne.getAge());
    System.out.println(personne.getSalary());
    personne.setName("Marouane", "Younes");
    personne.setAge(21);
    personne.setSalary(150);
    System.out.println(personne.getName());
    System.out.println(personne.getAge());
    System.out.println(personne.getSalary());
  }
}