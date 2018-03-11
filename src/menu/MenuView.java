package menu;

import home.Main;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuView extends AnchorPane implements Initializable {
    private Main application;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setApp(Main application){
        this.application = application;
    }
}
