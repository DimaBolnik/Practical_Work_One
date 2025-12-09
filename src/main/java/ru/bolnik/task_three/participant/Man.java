package ru.bolnik.task_three.participant;

public class Man implements Action {

    private final int maxRun;

    private final int maxJump;

    public Man(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Человек пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println("Человек не смог пробежать " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Человек перепрыгнул " + height + " м.");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть " + height + " м.");
            return false;
        }
    }
}
