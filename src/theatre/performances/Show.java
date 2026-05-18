package theatre.performances;
import theatre.actors.Actor;
import theatre.directors.Director;
import java.util.ArrayList;
import java.util.List;

public class Show {
    private final String title;
    private final Director director;
    private final List<Actor> cast;

    public Show(String title, Director director) {
        this.title = title;
        this.director = director;
        this.cast = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    // Метод для получения информации о режиссере
    public Director getDirector() {
        return director;
    }
    // Методы для работы с актёрским составом
    public void addActor(Actor actor) {
        if (cast.contains(actor)) {
            System.out.println("Предупреждение: Актёр '" + actor + "' уже есть в списке актёров спектакля.");
            return;
        }
        cast.add(actor);
        System.out.println("Актёр '" + actor + "' успешно добавлен в спектакль.");
    }

    public void replaceActor(Actor newActor, String surname) {
        Actor actorToReplace = null;

        // Ищем актёра с указанной фамилией
        for (Actor actor : cast) {
            if (actor.getSurname().equals(surname)) {
                actorToReplace = actor;
                break;
            }
        }

        if (actorToReplace == null) {
            System.out.println("Предупреждение: Актёр с фамилией '" + surname + "' не найден в списке актёров спектакля.");
            return;
        }
        // Удаляем найденного актёра из списка
        cast.remove(actorToReplace);
        // Добавляем нового актёра в конец списка
        cast.add(newActor);

        System.out.println("Актёр с фамилией '" + surname + "' успешно заменён на '" + newActor + "'.");
    }

    public void printCast() {
        System.out.println("Актёрский состав спектакля '" + title + "':");

        if (cast.isEmpty()) {
            System.out.println("  Актёры не назначены.");
            return;
        }

        for (Actor actor : cast) {
            System.out.println("  " + actor.toString());
        }
    }

    @Override
    public String toString() {
        return "Спектакль: " + title + ", " + director.toString();
    }
}