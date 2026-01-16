package compte;

public class Main {
  public static void main(String[] args) {
    // Client
    Client c1 = new Client("Hachichi", "Assia", 1);
    Client c2 = new Client("Boussaid", "Ilhem", 2);
    c1.afficher();
    c2.afficher();
    Client c3 = new Client();
    c3.setNom("Benzaid");
    c3.setPrenom("Chafika");
    c3.setNumero(3);
    c2.setPrenom("Wissam");
    c1.afficher();
    c2.afficher();
    c3.afficher();

    // Compte
    Client c11 = new Client("Hachichi", "Assia", 1);
    Client c12 = new Client("Boussaid", "Ilhem", 2);
    Compte C1 = new Compte();
    C1.setClient(c11);
    C1.setNumero(1);
    C1.setSolde(1000);
    C1.afficher();

    Compte C2 = new Compte();
    C2.setClient(c12);
    C2.setNumero(2);
    C2.setSolde(1800);
    C2.afficher();
    C2.depot(50);
    C2.afficher();
    C2.retrait(30);
    C2.afficher();
    C2.retrait(3000);
    C2.afficher();
    C1.setNomClient("Benzaid");
    C1.setPrenomClient("Chafika");
    C1.afficher();
  }
}
