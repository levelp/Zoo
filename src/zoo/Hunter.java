package zoo;

// Если класс реализует интерфейс охотник, то животное может охотиться за кем-то
public interface Hunter {
    boolean canHunt(Animal other);
}
