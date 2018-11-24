package test_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent par= FXMLLoader.load(getClass().getResource("testFX.fxml"));
        primaryStage.setTitle("Тест FX в 3");
        primaryStage.setScene(new Scene(par));
        primaryStage.show();
    }
}
