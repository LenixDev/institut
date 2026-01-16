// ===== STATIC & FINAL =====

class Config {
    static int count = 0; // shared by all objects
    final String APP_NAME = "MyApp"; // can't be changed

    static void increment() { // belongs to class, not object
        count++;
    }
}