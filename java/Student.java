// ===== INHERITANCE & SUPER =====

class Student extends Person {
    String school;

    Student(String name, int age, String school) {
        super(name, age); // calls parent constructor
        this.school = school;
    }
}