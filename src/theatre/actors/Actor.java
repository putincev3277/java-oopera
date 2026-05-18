package theatre.actors;
import theatre.enums.Gender;

public class Actor extends Person {
    private final double height;

     public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false; // сначала проверяем базовые поля Person
        Actor actor = (Actor) obj;
        return Double.compare(actor.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode(); // берём базовый хэш от Person
        result = 31 * result + Double.hashCode(height);
        return result;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + " м)";
    }
}