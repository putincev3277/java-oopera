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
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;

        return Double.compare(actor.height, height) == 0
                && getName().equals(actor.getName())
                && getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + Double.hashCode(height);
        return result;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + " м)";
    }
}