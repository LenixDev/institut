// ===== INTERFACE (another abstraction) =====

interface Flyable {
  void fly();
}

class Bird implements Flyable {
  public void fly() {
      System.out.println("Flying...");
  }
}