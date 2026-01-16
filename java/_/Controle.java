import java.util.Scanner;
public class Controle {
  private static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entre votre premier moyenne: ");
    int m1 = scanner.nextInt();
    System.out.print("Entre votre deuxieme moyenne: ");
    int m2 = scanner.nextInt();
    System.out.print("Entre votre troisieme moyenne: ");
    int m3 = scanner.nextInt();
    int moyenne = (m1 + m2 + m3) / 3;
    
    System.out.println("Votre moyenne est: " + moyenne);
    scanner.close();
  }
}