package main.java.Task2.Obstacles;

public enum Obstacles {
    OBSTACLES_1("Track", 3000),OBSTACLES_2("Wall", 1),OBSTACLES_3("Track",10000),OBSTACLES_4("Wall",4);

    private String Obstacles;
    private int Distance;

    Obstacles(String Obstacles, int Distance){
        this.Obstacles = Obstacles;
        this.Distance = Distance;
    }

    public int getDistance() {
        return Distance;
    }

    public String getObstacles() {
        return Obstacles;
    }
}
