package home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import menu.MenuView;
import rules.RuleAgudasView;
import rules.RuleEsdrujulasView;
import rules.RuleGrabesView;

import java.io.InputStream;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    private Group root = new Group();

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    public Parent createContent() {
        gotoHome();
        return root;
    }

     void gotoHome() {
        try {
            HomeView home =
                    (HomeView) replaceSceneContent("home.fxml");
            home.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }

     public void gotoMenu() {
        try {
            MenuView menu =
                    (MenuView) replaceSceneContent("/menu/menu.fxml");
            menu.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoRuleAguda() {
        try {
            RuleAgudasView ruleAgudasView =
                    (RuleAgudasView) replaceSceneContent("/rules/rule_agudas.fxml");
            ruleAgudasView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoRuleGrabes() {
        try {
            RuleGrabesView ruleGrabesView =
                    (RuleGrabesView) replaceSceneContent("/rules/rule_grabes.fxml");
            ruleGrabesView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoRuleEsdrujulas() {
        try {
            RuleEsdrujulasView ruleEsdrujulasView =
                    (RuleEsdrujulasView) replaceSceneContent("/rules/rule_esdrujulas.fxml");
            ruleEsdrujulasView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }



    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setResources(ResourceBundle.getBundle("resources.strings", new Locale("es","")));
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;

        try {
            page = loader.load(in);
        } finally {
            in.close();
        }
        root.getChildren().clear();
        root.getChildren().addAll(page);
        System.out.println("PASO");
        return (Initializable)loader.getController();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
