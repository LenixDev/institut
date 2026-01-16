import java.util.Scanner;

public class Pair {
  static void paireEntreDeux(int m, int n) {
    int biggerValue = m > n ? m : n;
    int smallerValue = m < n ? m : n;
    for (int i = smallerValue; i <= biggerValue; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
  public static void main(String[] args) {
    System.out.print("Introduire A = ");
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    System.out.print("Introduire B = ");
    int B = sc.nextInt();
    paireEntreDeux(A, B);
    sc.close();
  }
}
