package sample;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

public class SceneController {
    HashMap<String, Pane> scenes;
    private Scene main;
    public SceneController(Scene main){
        this.main = main;
        scenes = new HashMap<>();
    }
    public void AddScene(String name, Pane pane) {
        scenes.put(name, pane);
    }
    public void RemoveScene(String name){
        scenes.remove(name);
    }
    public void ChangeScene(String name) {
        main.setRoot(scenes.get(name));
    }
}
