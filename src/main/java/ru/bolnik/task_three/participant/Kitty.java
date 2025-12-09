package ru.bolnik.task_three.participant;

public class Kitty implements Action {

    private final int maxRun;

    private final int maxJump;

    public Kitty(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Кошка пробежала " + distance + " м.");
            return true;
        } else {
            System.out.println("Кошка не смогла пробежать " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Кошка перепрыгнула " + height + " м.");
            return true;
        } else {
            System.out.println("Кошка не смогла перепрыгнуть " + height + " м.");
            return false;
        }
    }
}
