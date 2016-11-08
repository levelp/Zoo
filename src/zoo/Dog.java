package zoo;


import java.util.Arrays;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("Гав..");
    }

    public void hunt(Animal... animals) {
        System.out.println(name + " go hunting:");
        // new Comparator<Animal>() { compare(...) }
        Arrays.sort(animals, (a, b) -> { // Лямбда-выражение
            if (a.speed < b.speed) return -1;
            if (a.speed > b.speed) return +1;
            return 0; // Не менять местами (не переставлять)
        });
        for (Animal a : animals) {
            System.out.println(" * " + a.name + " " + a.speed);
        }
    }
}
