// ===== GENERICS =====

class Box<T> {
    T item;

    void set(T item) {
        this.item = item;
    }

    T get() {
        return item;
    }
}