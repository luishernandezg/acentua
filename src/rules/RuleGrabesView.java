package rules;

import home.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RuleGrabesView extends AnchorPane implements Initializable {

    @FXML
    private Label lblTitle;
    @FXML private  Label lblText1;
    @FXML private  Label lblText2;
    @FXML private Label lblAzucar;
    @FXML private  Label lblDocil;
    @FXML private Label lblFutbol;
    @FXML private Label lblPoney;
    private Main application;
    private ResourceBundle stringBundle;

    public void setApp(Main application){
        this.application = application;
        lblTitle.setText(stringBundle.getString("rule_grabes_title"));
        lblText1.setText(stringBundle.getString("rule_grabes_text_1"));
        lblText2.setText(stringBundle.getString("rule_grabes_text_2"));
        lblAzucar.setText(stringBundle.getString("rule_grabes_azucar"));
        lblDocil.setText(stringBundle.getString("rule_grabes_docil"));
        lblFutbol.setText(stringBundle.getString("rule_grabes_futbol"));
        lblPoney.setText(stringBundle.getString("rule_grabes_poney"));
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.stringBundle = resources;
    }


    public void gotoMenu(ActionEvent actionEvent) {
        application.gotoMenu();
    }

    public void gotoEsdrujulas(ActionEvent actionEvent) {
        application.gotoRuleEsdrujulas();

    }

    public void gotoAgudas(ActionEvent actionEvent) {
        application.gotoRuleAguda();
    }
}
