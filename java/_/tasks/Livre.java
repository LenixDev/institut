public class Livre {
  String titre;
  String auteur;

  public static void main(String[] args) {
    Livre livre = new Livre();
    livre.titre = "Class";
    livre.auteur = "Marouane";
    System.out.println("Le titre est: " + livre.titre + " et l'auteur est: " + livre.auteur);
  }
}