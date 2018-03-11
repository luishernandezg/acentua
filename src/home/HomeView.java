package home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


import java.net.URL;
import java.util.ResourceBundle;

public class HomeView extends AnchorPane implements Initializable{

    @FXML private Label titleLabel;
    @FXML private Label descriptionLabel;
    private Main application;
    private ResourceBundle stringBundle;

    public void setApp(Main application){
        this.application = application;
        titleLabel.setText(stringBundle.getString("game_title"));
        descriptionLabel.setText(stringBundle.getString("game_description"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stringBundle = resources;

    }


    public void gotoMenu(ActionEvent actionEvent) {
        this.application.gotoMenu();
    }
}
