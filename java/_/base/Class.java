public class Class {
  int x;

  public Main(int y) {
    x = y;
  }  

  public static void main(String[] arg) {
    Main object = new Main(5);
    System.out.println(object.x);
  }
}