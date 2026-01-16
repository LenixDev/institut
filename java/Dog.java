// ===== ABSTRACTION =====

abstract class Animal {
  abstract void sound(); // must be implemented by child

  void sleep() {
      System.out.println("Sleeping...");
  }
}

class Dog extends Animal {
  void sound() {
      System.out.println("Bark!");
  }
}