package zoo;

public abstract class Animal {
    String name;
    int speed;

    Animal(String name) {
        this.name = name;
    }

    public void hidesFrom(Animal another) {
        System.out.println(name + " hides from " + another.name);
    }

    abstract void say();
}
