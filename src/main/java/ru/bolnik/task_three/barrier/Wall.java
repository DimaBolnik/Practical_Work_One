package ru.bolnik.task_three.barrier;

import ru.bolnik.task_three.participant.Action;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Action action) {
        return action.jump(height);
    }
}
