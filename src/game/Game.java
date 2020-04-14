package game;

public class Game {
    String name;
    String appId;
    boolean finished;

    public String getName() {
        return name;
    }

    public String getAppId() {
        return appId;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Game(String name, String appId) {
        this.name = name;
        this.appId = appId;
    }
}
