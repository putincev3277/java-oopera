package theatre.actors;
import theatre.enums.Gender;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "theatre.actors.Person{" +
                "name='" + name + "', " +
                "surname='" + surname + "', " +
                "gender=" + gender +
                "}";
    }
}


