package test_fx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import k_test3.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class contoller {
    private Person pers;
    //*
    private List<Person> list=new ArrayList<>();

    @FXML
    private Button button2;
    @FXML
    private TextField textField2;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField3;
    @FXML
    private Button button1;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Button button3;

    @FXML
    private void testOpen() {
        //*
       // try {
        //    ser();
       // } catch (Exception e) {
        //    e.printStackTrace();
       // }
        //посмотреть что за фигню я сделал
        FileChooser opFr=new FileChooser();
        File testFile=opFr.showOpenDialog(null);
        if (testFile!=null)

        try{
            deser(testFile);
            //* (только для нижней строки)
            testReadFile(testFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


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

                //*
                list.add(pers);

                //вывод сообщения
                Alert msg=new Alert(Alert.AlertType.CONFIRMATION,"всё работает");
                msg.showAndWait();
            }
        });
    }

    //тест создания и записи файла и в файл
    private void testReadFile(File testFile) throws IOException {
        //временно закоменчено
        //перед раскоментом убрать File testFile и пререместить содержимое
        //этого метода в testOpen
        //File testFile = new File("testFile.txt");
        if (testFile!=null)
        if (testFile.exists()) {
            System.out.println("фаил " + testFile.getName() + " существует");
            FileReader fr = new FileReader(testFile);
            BufferedReader buf = new BufferedReader(fr);
            //создаём переменную testLine и при помощи неё
            //построчно выводим записанную в testFile.txt информацию
            String testLine;
            //если строка равна null то это последняя строка в файле
            while ((testLine = buf.readLine()) != null) {
                System.out.println(testLine);
            }
            buf.close();
            fr.close();
        } else {
            testFile.createNewFile();
            System.out.println("файл создан");
            FileWriter fw = new FileWriter(testFile, true);
            BufferedWriter wri = new BufferedWriter(fw);
            wri.write("абырвалг");
            wri.newLine();
            //flush это отправка записанных в буфер данных в файл
            wri.flush();
            //закрытие процессов записи (чтоб словив ошибку не испортить файл
            wri.close();
            fw.close();

        }
    }

    //второй вариант
    @FXML private void close(){
        System.exit(0);
    }
    //*
    private void ser() throws Exception{
        FileOutputStream fos=new FileOutputStream("lol.ret");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.flush();
        oos.close();
        fos.close();
    }
    //**
    private void deser(File testFile) throws Exception{
        FileInputStream fis=new FileInputStream(testFile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        List<Person> personList=(List<Person>) ois.readObject();
        ois.close();
        fis.close();
        for (Person person:personList){
            System.out.println(person);
        }
    }



}


