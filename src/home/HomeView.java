package home;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;


import java.net.URL;
import java.util.ResourceBundle;

public class HomeView extends AnchorPane implements Initializable{

    private Main application;


    public void setApp(Main application){
        this.application = application;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void gotoMenu(ActionEvent actionEvent) {
        this.application.gotoMenu();
    }
}
