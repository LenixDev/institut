import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int i, n, som;
        som = 0;
        i = 0;
        while (i < 4) {
            System.out.println("donnez un entier ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            som += n;
            i++;
        }
        System.out.println("Somme: " + som);
    }
}