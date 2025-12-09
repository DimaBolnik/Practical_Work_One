package ru.bolnik.task_two;

public class Animal {

    protected static int count = 0;

    public Animal() {
        count++;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }

    public static void showCount() {
        System.out.printf("Создано животных %d %n", count);
    }
}
