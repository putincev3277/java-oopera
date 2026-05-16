package theatre.performances;
import theatre.directors.Director;

public class MusicalShow extends Show {

    private final String musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, Director director, String musicAuthor, String librettoText) {
        super(title, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Текст либретто:");
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return super.toString() + ", автор музыки: " + musicAuthor;
    }
}
