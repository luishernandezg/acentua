package rules;

import home.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RuleEsdrujulasView extends AnchorPane implements Initializable{
    @FXML
    private Label lblTitle;
    @FXML private  Label lblText1;
    @FXML private  Label lblText2;
    @FXML private  Label lblHeroe;
    @FXML private  Label lblNumero;
    @FXML private  Label lblOceano;
    @FXML private  Label lblRobots;
    private Main application;
    private ResourceBundle stringBundle;
    public void gotoMenu(ActionEvent actionEvent) {
        application.gotoMenu();
    }

    public void gotoGrabes(ActionEvent actionEvent) {
        application.gotoRuleGrabes();
    }

    public void setApp(Main application){
        this.application = application;
        lblTitle.setText(stringBundle.getString("rule_esdrujula_title"));
        lblText1.setText(stringBundle.getString("rule_esdrujula_text_1"));
        //lblText2.setText(stringBundle.getString("rule_grabes_text_2"));
        lblHeroe.setText(stringBundle.getString("rule_esdrujula_heroe"));
        lblNumero.setText(stringBundle.getString("rule_esdrujula_numero"));
        lblOceano.setText(stringBundle.getString("rule_esdrujula_oceano"));

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.stringBundle = resources;
    }
}
