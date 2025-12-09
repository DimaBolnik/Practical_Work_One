package ru.bolnik.task_two;

public class Cat extends Animal {

    private static int catCount = 0;
    private static final int RUN_LIMIT = 200;

    public Cat() {
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");;
    }

    public static void showCatCount() {
        System.out.printf("Создано котов %d %n", catCount);
    }
}
