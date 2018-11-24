package test_fx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import k_test3.Person;

 public class contoller {
    Person pers;

    @FXML
    private Button button2;
    private TextField textField2;
    private TextField textField1;
    private TextField textField3;
    private Button button1;
    private Label label1;
    private Label label2;
    private Label label3;

    @FXML
    private void initialize() {
        textField1.setText("запг");
        textField2.setText("хаез");
        textField3.setText("32");

        action();
    }
    //первый вариант действия с кнопкой
    private void  action(){
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String login=textField1.getText();
                String password=textField2.getText();
                int age=Integer.parseInt(textField3.getText());

                pers=new Person(login,password,age);

                Alert msg=new Alert(Alert.AlertType.CONFIRMATION,"всё работает");
                msg.showAndWait();
            }
        });
    }
    //второй вариант
    @FXML private void close(){
        System.exit(0);
    }


}


