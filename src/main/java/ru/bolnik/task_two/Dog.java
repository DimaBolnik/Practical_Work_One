package ru.bolnik.task_two;

public class Dog extends Animal{

    private static int dogCount = 0;
    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 10;

    public Dog() {
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не смогла пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не смогла проплыть " + distance + " м.");
        }
    }

    public static void showDogCount() {
        System.out.printf("Создано собак %d %n", dogCount);
    }
}
