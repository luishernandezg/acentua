package rules;

import home.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RuleAgudasView extends AnchorPane implements Initializable {
    @FXML private Label lblTitle;
    @FXML private  Label lblText1;
    private Main application;
    private ResourceBundle stringBundle;

    public void setApp(Main application){
        this.application = application;
        lblTitle.setText(stringBundle.getString("rule_agudas_title"));
        lblText1.setText(stringBundle.getString("rule_agudas_text_1"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stringBundle = resources;

    }
}
