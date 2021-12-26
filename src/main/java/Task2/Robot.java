package main.java.Task2;

import main.java.Task2.Obstacles.Obstacles;

public class Robot implements Action{

    private String name;
    private int MaxTrackLength;
    private int MaxWallLength;

    public Robot(String name, int MaxTrackLength, int MaxWallLength){
        this.name = name;
        this.MaxTrackLength = MaxTrackLength;
        this.MaxWallLength = MaxWallLength;
    }

    public void obstacle(Obstacles action) {
        if (action.getObstacles() == "Track"){
            this.run(action);
        }else if (action.getObstacles() == "Wall"){
            this.jump(action);
        }
    }

    @Override
    public void run(Obstacles action) {
        if (action.getDistance()<=MaxTrackLength){
            System.out.println(this.name+" успешно пробежал");
        }else {
            System.out.println(this.name+" не смог пробежал");
        }
    }

    @Override
    public void jump(Obstacles action) {
        if (action.getDistance()<=MaxWallLength){
            System.out.println(this.name+" успешно проплыл");
        }else {
            System.out.println(this.name+" не смог проплыть");
        }
    }
}
