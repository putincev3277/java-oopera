package theatre.directors;
import theatre.enums.Gender;
import theatre.actors.Person;

public class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }


    @Override
    public String toString() {
        return "режиссёр: "
                + super.toString().replace("theatre.actors.Person{", "")
                .replace("}", "")
                + ", количество постановок: "
                + numberOfShows;
    }
}