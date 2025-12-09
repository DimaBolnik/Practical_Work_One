package ru.bolnik.task_three.barrier;

import ru.bolnik.task_three.participant.Action;

public class Track implements Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Action action) {
        return action.run(length);
    }
}
