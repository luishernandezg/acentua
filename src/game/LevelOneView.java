package game;

import home.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import model.Word;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LevelOneView extends AnchorPane implements Initializable,LevelOneContract.View {

    LevelOnePresenter mPresenter;
    List<Button> buttonList = new ArrayList<>();
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;
    @FXML private Button btn7;
    @FXML private Button btn8;
    @FXML private Button btn9;
    @FXML private Button btn10;
    @FXML private Button btn11;
    @FXML private Button btn12;

    @FXML private Label pointText;
    @FXML private Label pointNumber;
    @FXML private Label negativePointText;
    @FXML private Label negativePointNumber;
    @FXML private Label messageText;
    @FXML private Label victoryNumber;
    @FXML private Label gameNumber;



    private Main application;
    private ResourceBundle stringBundle;

    public void setApp(Main application){
        this.application = application;
        victoryNumber.setText(String.valueOf(application.victory_number));
        gameNumber.setText(String.valueOf(application.game_number));
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonList.add(btn1);
        buttonList.add(btn2);
        buttonList.add(btn3);
        buttonList.add(btn4);
        buttonList.add(btn5);
        buttonList.add(btn6);
        buttonList.add(btn7);
        buttonList.add(btn8);
        buttonList.add(btn9);
        buttonList.add(btn10);
        buttonList.add(btn11);
        buttonList.add(btn12);
        mPresenter = new LevelOnePresenter(this);
        this.stringBundle = resources;

    }

    private void gotoMenu(){
        application.gotoMenu();
    }
    private void gotoGame(){
        application.gotoLevelOne();
    }

    public void clickAction(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        if(mPresenter.move(button.getText())){
            button.setStyle("-fx-background-color: royalblue; -fx-text-fill: white");
        }else{
            button.setStyle("-fx-background-color: darkred; -fx-text-fill: white");
        }
        button.setDisable(true);


    }

    @Override
    public void updatePoints(int points, int negativePoints) {
        pointNumber.setText(String.valueOf(points)+"/5");
        negativePointNumber.setText(String.valueOf(negativePoints)+"/2");
}

    @Override
    public void updateWords(List<Word> wordList) {
        for(int i = 0; i < buttonList.size(); i++){
            buttonList.get(i).setText(wordList.get(i).getWord());
        }
    }

    @Override
    public void showVictoryAlert() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Ganaste, ¿ Quieres iniciar un nuevo juego ?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();
        application.game_number++;
        application.victory_number++;
        if (alert.getResult() == ButtonType.YES) {
            //do stuff

            gotoGame();
        }

        if (alert.getResult() == ButtonType.NO) {
            //do stuff
            gotoMenu();
        }
    }

    @Override
    public void showDefeatAlert() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Perdiste, ¿ Quieres iniciar un nuevo juego ?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();
        application.game_number++;
        if (alert.getResult() == ButtonType.YES) {
            //do stuff
            gotoGame();
        }

        if (alert.getResult() == ButtonType.NO) {
            //do stuff
            gotoMenu();
        }
    }
}
