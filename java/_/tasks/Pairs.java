import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        int entered, count;
        System.out.println("entre un entier: ");
        Scanner sc = new Scanner(System.in);
        entered = sc.nextInt();
        if (entered % 2 == 0) {
            entered = entered - 2;
            count = 0;
            while (entered >= 2 && entered > 0) {
                System.out.println(entered);
                entered = entered - 2;
                count++;
            }
            System.out.println("le nombre de termes est: " + count);
        } else {
            System.out.println("le nombre est impair");
        }
    }
}
