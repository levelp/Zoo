package zoo;

public class Mouse extends Animal { // Мышь
    public Mouse(String name) {
        super(name);
        speed = 5;
    }

    @Override
    void say() {
        System.out.println("Пи-пи-пи...");
    }
}
