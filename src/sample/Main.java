package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;

public class Main extends Application {

    static public Stage PrimaryStage;
    static HashMap<String, Scene> sceneList;
    @Override
    public void start(Stage primaryStage) throws Exception{

        // TODO: On application start, find Steam Profile information.
        sceneList = new HashMap<>();
        PrimaryStage = primaryStage;
        PrimaryStage.setResizable(false);
        PrimaryStage.setTitle("Steam Game Library");

        Parent homeLoader = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene homeScene = new Scene(homeLoader, 801, 400);
        homeScene.getStylesheets().add("styles/navigationButtons.css");

        Parent gameLoader = FXMLLoader.load(getClass().getResource(("game.fxml")));
        Scene gameScene = new Scene(gameLoader, 801, 400);
        gameScene.getStylesheets().add("styles/navigationButtons.css");

        Parent profileLoader = FXMLLoader.load(getClass().getResource(("profile.fxml")));
        Scene profileScene = new Scene(profileLoader, 801, 400);
        profileScene.getStylesheets().add("styles/navigationButtons.css");

        Parent settingsLoader = FXMLLoader.load(getClass().getResource(("settings.fxml")));
        Scene settingsScene = new Scene(settingsLoader, 801, 400);
        settingsScene.getStylesheets().add("styles/navigationButtons.css");

        sceneList.put("home", homeScene);
        sceneList.put("game", gameScene);
        sceneList.put("profile", profileScene);
        sceneList.put("settings", settingsScene);

        PrimaryStage.setScene(homeScene);
        PrimaryStage.show();
    }

    public static void SetScene(String sceneName) {
        PrimaryStage.setScene(sceneList.get(sceneName));
    }
    public static Scene GetScene(String sceneName){
        return sceneList.get(sceneName);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
