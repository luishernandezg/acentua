package menu;

import home.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuView extends AnchorPane implements Initializable {
    private Main application;
    @FXML private Button menuBtnGotoRules;
    private ResourceBundle stringBundle;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.stringBundle = resources;
    }

    public void setApp(Main application){
        this.application = application;
    }


    public void gotoRules(ActionEvent actionEvent) {
        this.application.gotoRuleAguda();
    }

    public void gotoLevelOne(ActionEvent actionEvent){
        this.application.gotoLevelOne();
    }


    public void gotoAbout(ActionEvent actionEvent) {
        application.gotoAbout();
    }
}
