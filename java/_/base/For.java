import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int i, n, som;
        som = 0;
        for (i = 0; i < 4; i++) {
            System.out.println("donnez un entier ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            som += n;
        }
        System.out.println("Somme: " + som);
    }
}