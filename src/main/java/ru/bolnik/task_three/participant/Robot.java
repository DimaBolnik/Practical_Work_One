package ru.bolnik.task_three.participant;

public class Robot implements Action{

    private final int maxRun;

    private final int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Робот пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println("Робот не смог пробежать " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Робот перепрыгнул " + height + " м.");
            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть " + height + " м.");
            return false;
        }
    }
}
