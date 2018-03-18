package rules;

import home.Main;
import javafx.event.ActionEvent;
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
    @FXML private  Label lblText2;
    @FXML private Label lblCafe;
    @FXML private  Label lblColibri;
    @FXML private Label lblCompas;
    @FXML private Label lblRobots;
    private Main application;
    private ResourceBundle stringBundle;

    public void setApp(Main application){
        this.application = application;
        lblTitle.setText(stringBundle.getString("rule_agudas_title"));
        lblText1.setText(stringBundle.getString("rule_agudas_text_1"));
        lblText2.setText(stringBundle.getString("rule_agudas_text_2"));
        lblCafe.setText(stringBundle.getString("rule_agudas_cafe"));
        lblColibri.setText(stringBundle.getString("rule_agudas_colibri"));
        lblCompas.setText(stringBundle.getString("rule_agudas_compas"));
        lblRobots.setText(stringBundle.getString("rule_agudas_robots"));
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stringBundle = resources;

    }

    public void gotoMenu(ActionEvent actionEvent) {
        application.gotoMenu();
    }

    public void gotoGraves(ActionEvent actionEvent) {
        application.gotoRuleGrabes();
    }
}
