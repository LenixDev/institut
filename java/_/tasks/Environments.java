public class Environments {
  static int object = 0;

  private static void compteur() {
    object++;
  }

  private static void afficher() {
    System.out.println("le nombre d'objets est : " + object);
  }

  public static void main(String[] args) {
    compteur();
    afficher();
  }
}