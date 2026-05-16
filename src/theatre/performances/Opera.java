package theatre.performances;
import theatre.directors.Director;

public class Opera extends MusicalShow {
    private final int choirSize; // Количество человек в хоре

    public Opera(String title, Director director, String musicAuthor, String librettoText, int choirSize) {
        super(title, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", хор " + choirSize + " чел. " + '}';
    }
}