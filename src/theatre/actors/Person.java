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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        theatre.actors.Person person = (theatre.actors.Person) obj;
        return getName().equals(person.getName())
                && getSurname().equals(person.getSurname())
                && gender == person.gender;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return  " " + name + " " + surname;
    }
}


