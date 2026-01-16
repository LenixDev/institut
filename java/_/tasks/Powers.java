import java.util.Scanner;

public class Powers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, power, result;
    System.out.println("Enter a number: ");
    number = sc.nextInt();

    System.out.println("Enter a power: ");
    power = sc.nextInt();

    result = (number * number) * power;
    System.out.println("The result is: " + result);
  }
}