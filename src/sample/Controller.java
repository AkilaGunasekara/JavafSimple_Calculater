package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label lab;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    public void caladdition(ActionEvent event){

        try {
            float number1 = Float.parseFloat(num1.getText());
            float number2 = Float.parseFloat(num2.getText());
            lab.setText(String.valueOf(number1 + number2));
        }
        catch (Exception e){
            num1.setText("Enter a Value");
            num2.setText("Enter a Value");
        }

    }
    @FXML
    void calculatereduce(ActionEvent event){

        try {
            float number1 = Float.parseFloat(num1.getText());
            float number2 = Float.parseFloat(num2.getText());
            lab.setText(String.valueOf(number1 - number2));
        }
        catch (Exception e){
            num1.setText("Enter a Value");
            num2.setText("Enter a Value");
        }
    }


    @FXML
    void calculatemultification(ActionEvent event){

        try {
            float number1 = Float.parseFloat(num1.getText());
            float number2 = Float.parseFloat(num2.getText());
            lab.setText(String.valueOf(number1 * number2));
        }
        catch (Exception e){
            num1.setText("Enter a Value");
            num2.setText("Enter a Value");
        }
    }
    @FXML
    void calculatedivision(ActionEvent event){

        try {
            float number1 = Float.parseFloat(num1.getText());
            float number2 = Float.parseFloat(num2.getText());
            lab.setText(String.valueOf(number1 / number2));
        }
        catch (Exception e){
            num1.setText("Enter a Value");
            num2.setText("Enter a Value");
        }
    }
    @FXML
    void calsin(ActionEvent event){
        int number = Integer.parseInt(num1.getText());
        double sinvalue = Math.sin(number);

        lab.setText(String.valueOf(sinvalue));

    }
    @FXML
    void calexp(ActionEvent event){
        int number = Integer.parseInt(num1.getText());
        double sinvalue = Math.exp(number);

        lab.setText(String.valueOf(sinvalue));

    }
    @FXML
    void calcos(ActionEvent event){
        int number = Integer.parseInt(num1.getText());
        double sinvalue = Math.cos(number);

        lab.setText(String.valueOf(sinvalue));

    }
    @FXML
    void caltan(ActionEvent event){
        int number = Integer.parseInt(num1.getText());

        double sinvalue = Math.tan(number);

        lab.setText(String.valueOf(sinvalue));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
