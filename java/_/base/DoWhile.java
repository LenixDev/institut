import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int i, n, som;
        som = 0;
        i = 0;
        do {
            System.out.println("donnez un entier ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            som += n;
            i++;
        } while (i < 4);
        System.out.println("Somme: " + som);
    }
}