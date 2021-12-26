package main.java.Task2;

import main.java.Task2.Obstacles.Obstacles;

public interface Action {
    void obstacle(Obstacles action);
    void run(Obstacles action);
    void jump(Obstacles action);
}
