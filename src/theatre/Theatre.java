package theatre;

import theatre.actors.Actor;
import theatre.directors.Director;
import theatre.enums.Gender;
import theatre.performances.Ballet;
import theatre.performances.Opera;
import theatre.performances.Show;

public class Theatre {
    public static void main(String[] args) {
        // Создаём трёх актёров
        Actor actor1 = new Actor("Сергей", "Безруков", Gender.MALE, 1.72);
        Actor actor2 = new Actor("Любовь", "Казарновская", Gender.FEMALE, 1.68);
        Actor actor3 = new Actor("Николай", "Цискаридзе", Gender.MALE, 1.84);


        // Создаём двух режиссёров
        Director director1 = new Director("Лев", "Иванов", Gender.MALE, 5);
        Director director2 = new Director("Никита", "Михалков", Gender.MALE, 10);

        // Создаём автора музыки и хореографа

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Юрий Григорович";


        // Создаём обычный спектакль
        Show regularShow = new Show("Гамлет", director1);
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        // Создаём оперный спектакль (theatre.performances.Opera)
        Opera operaShow = new Opera(
                "Травиата", director2, musicAuthor,
                "Первый акт. Знакомство с главной героиней и её окружением," +
                        " зарождение любовной интриги. Второй акт. Сцена в загородном доме," +
                        " где Виолетта и Альфред наслаждаются недолгим счастьем," +
                        " сменяется напряжённым диалогом Виолетты с Жоржем Жермоном." +
                        " Третий акт. Бал у Флоры, где происходит публичное оскорбление Виолетты Альфредом." +
                        " Четвёртый акт. Действие переносится в скромную квартиру умирающей Виолетты." +
                        " Атмосфера скорби и безысходности подчёркивается музыкой вступления." +
                        " Кратковременная надежда, связанная с приездом Альфреда," +
                        " сменяется трагической гибелью героини.", 30
        );
        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        // Создаём балетный спектакль (theatre.performances.Ballet)
        Ballet balletShow = new Ballet(
                "Лебединое озеро", director1, musicAuthor,
                "Принц Зигфрид на пороге совершеннолетия" +
                        " встречает у озера заколдованную принцессу Одетту и" +
                        " клянётся ей в вечной любви. На балу злой волшебник Ротбарт" +
                        " подсовывает принцу свою дочь Одиллию под видом Одетты — Зигфрид" +
                        " публично клянётся ей в любви, нарушая первую клятву. " +
                        "Осознав обман, принц возвращается к озеру, умоляет о прощении;" +
                        " в финале Ротбарт уничтожен, заклятье разрушено, влюблённые воссоединяются.", choreographer
        );
        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        // Выводим списки режиссёров
        System.out.println("\n=== Список режиссёров для каждого спектакля ===");
        System.out.println("\nспектакль " + regularShow.getDirector());
        System.out.println("опера " + operaShow.getDirector());
        System.out.println("балет " + balletShow.getDirector());

        // Выводим списки актёров для каждого спектакля
        System.out.println("\n=== АФИША ===");
        System.out.println("\n1. Спектакль '" + regularShow.getTitle() + "':");
        regularShow.printCast();
        System.out.println(regularShow);

        System.out.println("\n2. Опера '" + operaShow.getTitle() + "':");
        operaShow.printCast();
        System.out.println(operaShow);

        System.out.println("\n3. Балет '" + balletShow.getTitle() + "':");
        balletShow.printCast();
        System.out.println(balletShow);

        // Заменяем актёра в одном из спектаклей
        System.out.println("\n=== ЗАМЕНА АКТЁРА ===");
        System.out.println("Заменяем в балете 'Безрукова' на 'Казарновскую':");
        Actor newActor = new Actor("Любовь", "Казарновская", Gender.FEMALE, 1.68);
        balletShow.replaceActor(newActor, "Безруков");

        // Ещё раз выводим список актёров для балета
        System.out.println("\nСписок актёров балета после замены:");
        balletShow.printCast();

        // Попытка заменить несуществующего актёра
        System.out.println("\n=== ПОПЫТКА ЗАМЕНЫ НЕСУЩЕСТВУЮЩЕГО АКТЁРА ===");
        operaShow.replaceActor(actor2, "Тупиков");

        // Выводим текст либретто для оперного и балетного спектаклей
        System.out.println("\n=== ТЕКСТЫ ЛИБРЕТТО ===");
        System.out.println("\nЛибретто опера '" + operaShow.getTitle() + "':");
        operaShow.printLibretto();

        System.out.println("\nЛибретто балет '" + balletShow.getTitle() + "':");
        balletShow.printLibretto();
    }
}

