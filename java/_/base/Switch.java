import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
   System.out.println("1- Addition"); 
   System.out.println("2- Multiplication"); 
   System.out.println("3- Quitter"); 
   System.out.println("Veuillez choisir une option"); 
   Scanner scanner = new Scanner(System.in);
   int option = scanner.nextInt();
   switch (option) {
    case 1:
     System.out.println("Donner deux nombres");
     int add1 = scanner.nextInt();
     int add2 = scanner.nextInt();
     System.out.println("Addition = " + (add1 + add2));
     break;
    case 2:
     System.out.println("Donner deux nombres");
     int mul1 = scanner.nextInt();
     int mul2 = scanner.nextInt();
     System.out.println("Multiplication = " + (mul1 * mul2));
     break;
    case 3:
     System.out.println("Au revoir");
     break;
    default:
     System.out.println("Option invalide");
     break;
   }
  }
}
