package zoo;

public class Cat extends Animal implements Hunter {
    public Cat(String name) {
        super(name);
        speed = 4; // Стандартная скорость для кошки
    }

    // Кошка с нестандартной скоростью
    public Cat(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    void say() {
        System.out.println("Мяяуу...");
    }

    public void eat(Mouse mouse) {
        System.out.println("Cat " + name + " eat mouse " + mouse.name);
    }

    @Override
    public boolean canHunt(Animal other) {
        if (other instanceof Mouse)
            return true;
        return false;
    }
}
