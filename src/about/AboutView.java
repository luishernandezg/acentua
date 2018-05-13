package about;

import home.Main;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AboutView extends AnchorPane implements Initializable {
    private Main application;
    private ResourceBundle stringBundle;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.stringBundle = resources;
    }

    public void setApp(Main application){
        this.application = application;
    }
}
