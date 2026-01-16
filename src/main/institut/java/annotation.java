// ===== ANNOTATIONS =====

class Parent {
  void display() {
      System.out.println("Parent");
  }
}

class Child extends Parent {
  @Override // tells compiler this overrides parent method
  void display() {
      System.out.println("Child");
  }
}