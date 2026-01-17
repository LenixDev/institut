package compte;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Client
    System.out.println("Entrez un nom, e.g. Hachichi :");
    String nomC1 = scanner.nextLine();

    System.out.println("Entrez un prenom, e.g. Assia :");
    String prenomC1 = scanner.nextLine();

    System.out.println("Entrez un numero, e.g. 1 :");
    int numeroC1 = scanner.nextInt();
    scanner.nextLine();// ← consomme le \n restant

    Client c1 = new Client(nomC1, prenomC1, numeroC1);

    System.out.println("Entrez un nom, e.g. Boussaid :");
    String nomC2 = scanner.nextLine();

    System.out.println("Entrez un prenom, e.g. Ilhem :");
    String prenomC2 = scanner.nextLine();

    System.out.println("Entrez un numero, e.g. 2 :");
    int numeroC2 = scanner.nextInt();
    scanner.nextLine();

    Client c2 = new Client(nomC2, prenomC2, numeroC2);

    c1.afficher();
    c2.afficher();
    Client c3 = new Client();

    System.out.println("Entrez un nouveau nom, e.g. Benzaid :");
    String nomC3 = scanner.nextLine();

    c3.setNom(nomC3);

    System.out.println("Entrez un nouveau prenom, e.g. Chafika :");
    String prenomC3 = scanner.nextLine();

    c3.setPrenom(prenomC3);

    System.out.println("Entrez un nouveau numero, e.g. 3 :");
    int numeroC3 = scanner.nextInt();
    scanner.nextLine();

    c3.setNumero(numeroC3);
    
    System.out.println("Entrez un autre nouveau prenom, e.g. Wissam :");
    String autreprenomC2 = scanner.nextLine();
    c2.setPrenom(autreprenomC2);

    c1.afficher();
    c2.afficher();
    c3.afficher();

    // Compte
    System.out.println("Entrez un nom, e.g. Hachichi :");
    String nomC11 = scanner.nextLine();

    System.out.println("Entrez un prenom, e.g. Assia :");
    String prenomC11 = scanner.nextLine();

    System.out.println("Entrez un numero, e.g. 1 :");
    int numeroC11 = scanner.nextInt();
    scanner.nextLine();

    Client c11 = new Client(nomC11, prenomC11, numeroC11);

    System.out.println("Entrez un nom, e.g. Boussaid :");
    String nomC12 = scanner.nextLine();

    System.out.println("Entrez un prenom, e.g. Ilhem :");
    String prenomC12 = scanner.nextLine();

    System.out.println("Entrez un numero, e.g. 2 :");
    int numeroC12 = scanner.nextInt();
    scanner.nextLine();

    Client c12 = new Client(nomC12, prenomC12, numeroC12);
    Compte C1 = new Compte();
    C1.setClient(c11);

    System.out.println("Entrez un nouveau numero, e.g. 1 :");
    int nouveaunumeroC1 = scanner.nextInt();
    scanner.nextLine();

    C1.setNumero(nouveaunumeroC1);

    System.out.println("Entrez un solde, e.g. 1000 :");
    int soldeC1 = scanner.nextInt();
    scanner.nextLine();

    C1.setSolde(soldeC1);
    C1.afficher();

    Compte C2 = new Compte();
    C2.setClient(c2);
    System.out.println("Entrez un nouveau numero, e.g. 2 :");
    int nouveaunumeroC2 = scanner.nextInt();
    scanner.nextLine();

    C2.setNumero(nouveaunumeroC2);

    System.out.println("Entrez un solde, e.g. 1800 :");
    int soldeC2 = scanner.nextInt();
    scanner.nextLine();

    C2.setSolde(soldeC2);
    C2.afficher();

    System.out.println("Entrez un montant pour le deposer, e.g. 50 :");
    int depotC2 = scanner.nextInt();
    scanner.nextLine();

    C2.depot(depotC2);
    C2.afficher();

    System.out.println("Entrez un montant pour le retrait, e.g. 30 :");
    int retraitC2 = scanner.nextInt();
    scanner.nextLine();

    C2.retrait(retraitC2);
    C2.afficher();

    System.out.println("Entrez un montant pour le retrait encore une autre fois, e.g. 3000 :");
    int nouveauretraitC2 = scanner.nextInt();
    scanner.nextLine();

    C2.retrait(nouveauretraitC2);
    C2.afficher();

    System.out.println("Entrez un nouveau nom, e.g. Benzaid :");
    String nouveaunomC1 = scanner.nextLine();

    C1.setNomClient(nouveaunomC1);

    System.out.println("Entrez un nouveau prenom, e.g. Chafika :");
    String nouveauprenomC1 = scanner.nextLine();

    C1.setPrenomClient(nouveauprenomC1);
    C1.afficher();
    scanner.close();
  }
}
