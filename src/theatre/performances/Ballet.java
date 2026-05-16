package theatre.performances;

import theatre.directors.Director;

public class Ballet extends MusicalShow {
    private final String choreographer; // Хореограф

    public Ballet(String title, Director director, String musicAuthor, String librettoText, String choreographer) {
        super(title, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return super.toString() + ", хореограф: " + choreographer + '}';
    }
}
