import java.util.Scanner;

public class Programme {
  public static int calcEntier() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez un entier: ");
    int entier1 = sc.nextInt();
    System.out.print("Entrez un autre entier: ");
    int entier2 = sc.nextInt();
    System.out.println("Choisissez une expression pour " + entier1 + " ? " + entier2 + ":");
    System.out.println("0. +");
    System.out.println("1. -");
    System.out.println("2. *");
    System.out.println("3. /");
    int expression = sc.nextInt();
    sc.close();
    switch (expression) {
      case 1:
        return entier1 + entier2;
      case 2:
        return entier1 - entier2;
      case 3:
        return entier1 * entier2;
      case 4:
        return entier1 / entier2;
      default:
        return 0;
    }
  }

  static double absolue(double a) {
    if (a >= 0) return a;
    else return -a;
  }

  static int minimum(int a, int b) {
    if (a < b) return a;
    else return b;
  }

  static int factoriel(int a) {
    if (a > 0) {
      for (int i = a; i > 0; i--) {
        System.out.println(a * i);
      }
    } else if (a < 0) {
      System.out.println(false);
      return -1;
    }
    return a;
  }

  public static int[] remplissage(int n, int N) {
    int[] tab = new int[n];
    for (int i = 0; i < n; i++) {
      tab[i] = (i + 1) * N;
    }
    return tab;
  }

  public static void main(String[] args) {
    /* int result = calcEntier();
    System.out.println("Le resultat est : " + result); */
    /* Scanner sc = new Scanner(System.in);
    System.out.println("Introduire A: ");
    int a = sc.nextInt();
    System.out.println("Introduire B: ");
    int b = sc.nextInt();
    System.out.println("Le minimum de " + a + " et " + b + " est : " + minimum(a, b)); */
    /* Scanner sc = new Scanner(System.in);
    System.out.println("Introduire A: ");
    int a = sc.nextInt();
    factoriel(a); */
    int[] test = remplissage(10, 6);
    for (int i = 0; i < test.length; i++) {
      System.out.println(test[i]);
    }
  }
} 
