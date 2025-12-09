package ru.bolnik;

import ru.bolnik.task_one.Person;
import ru.bolnik.task_three.barrier.Obstacle;
import ru.bolnik.task_three.barrier.Track;
import ru.bolnik.task_three.barrier.Wall;
import ru.bolnik.task_three.participant.Action;
import ru.bolnik.task_three.participant.Kitty;
import ru.bolnik.task_three.participant.Man;
import ru.bolnik.task_three.participant.Robot;
import ru.bolnik.task_two.Animal;
import ru.bolnik.task_two.Cat;
import ru.bolnik.task_two.Dog;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        runTaskOne();
        System.out.println("=========================");
        runTaskTwo();
        System.out.println("=========================");
        runTaskThree();
    }


    private static void runTaskOne() {
        System.out.println("Заданий 1");
        Person[] persons = new Person[5];

        persons[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mail.com", "89001112233", 30000, 30);
        persons[1] = new Person("Petrov Petr", "Manager", "petrov@mail.com", "89002223344", 45000, 45);
        persons[2] = new Person("Sidorov Sidr", "Developer", "sidorov@mail.com", "89003334455", 60000, 42);
        persons[3] = new Person("Kuznetsova Anna", "Designer", "anna@mail.com", "89004445566", 50000, 28);
        persons[4] = new Person("Smirnov Alex", "Director", "alex@mail.com", "89005556677", 120000, 50);

        for (Person p : persons) {
            if (p.getAge() > 40) {
                p.infoConsole();
            }
        }
        System.out.println("===================================");
        // через стрим
        Arrays.stream(persons)
                .filter(person -> person.getAge() > 40)
                .forEach(Person::infoConsole);
    }

    private static void runTaskTwo() {
        System.out.println("Заданий 2");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cat1.run(150);
        cat1.swim(5);

        dog1.run(600);
        dog1.swim(10);


        Animal.showCount();
        Cat.showCatCount();
        Dog.showDogCount();
    }

    private static void runTaskThree() {
        System.out.println("Заданий 3");

        Action[] actions = {
                new Man(500, 2),
                new Kitty(700, 3),
                new Robot(1000, 5)};

        Obstacle[] obstacles = {
                new Track(600),
                new Wall(2),
                new Track(500),
                new Wall(3)
        };

        for (Action action : actions) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(action)) {
                    break;
                }
            }
        }
    }
}