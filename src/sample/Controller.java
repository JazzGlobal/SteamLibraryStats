package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public void homeButtonOnClick(ActionEvent event){
        System.out.println("Home Button Pressed");
        Main.SetScene("home");
    }
    public void gamesButtonOnClick(){
        System.out.println("Games Button Pressed");
        Main.SetScene("game");
    }
    public void profileButtonOnClick(){
        System.out.println("Profile Button Pressed");
        Main.SetScene("profile");
    }
    public void settingsButtonOnClick(){
        System.out.println("Settings Button Pressed");
        Main.SetScene("settings");
    }
}
