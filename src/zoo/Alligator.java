package zoo;

public class Alligator extends Animal implements Hunter {
    public Alligator(String name) {
        super(name);
    }

    @Override
    void say() {
        System.out.println("Aggrrrr... Silence..");
    }

    @Override
    public boolean canHunt(Animal other) {
        return true;
    }
}
