package zoo;

public class Main {
    public static void main(String[] args) {
        // Первое животное - кошка
        Cat cat = new Cat("Tom");
        // Второе животное - мышь
        Mouse mouse = new Mouse("Jerry");
        cat.eat(mouse);
        // Мышь прячется от..
        mouse.hidesFrom(cat);
        // Полиморфизм
        Animal[] animals = {cat, mouse};
        for (Animal a : animals) {
            a.say();
        }
        Dog rob = new Dog("Rob");
        rob.hunt(mouse, cat);
        Alligator edik = new Alligator("Edik");
        // Вторая медленная кошка
        Cat veryFatCat = new Cat("King", 2);
        Cat cat3 = new Cat("Boris");
        Cat cat4 = new Cat("Champion", 6);
        rob.hunt(cat, veryFatCat, cat4, cat3);
    }
}
