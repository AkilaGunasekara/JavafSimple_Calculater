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
            num1.setText(num1.getText());
            num2.setText(num1.getText());
            lab.setText(" ");
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
            num1.setText(num1.getText());
            num2.setText(num1.getText());
            lab.setText(" ");
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
            num1.setText(num1.getText());
            num2.setText(num1.getText());
            lab.setText(" ");
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
            num1.setText(num1.getText());
            num2.setText(num1.getText());
            lab.setText(" ");
        }
    }
    @FXML
    void calsin(ActionEvent event){
        double number = Integer.parseInt(num1.getText());
        number = Math.toRadians(number);
        double sinvalue = Math.sin(number);

        lab.setText(String.valueOf(sinvalue));

    }
    @FXML
    void calexp(ActionEvent event){
        double number = Integer.parseInt(num1.getText());
        number = Math.toRadians(number);
        double expvalue = Math.exp(number);

        lab.setText(String.valueOf(expvalue));

    }
    @FXML
    void calcos(ActionEvent event){
        double number = Integer.parseInt(num1.getText());
        number = Math.toRadians(number);
        double cosvalue = Math.cos(number);

        lab.setText(String.valueOf(cosvalue));

    }
    @FXML
    void caltan(ActionEvent event){
        double number = Integer.parseInt(num1.getText());
        number = Math.toRadians(number);
        double tanvalue = Math.tan(number);
        lab.setText(String.valueOf(tanvalue));
    }
    @FXML
    void clear(ActionEvent event){
        num1.setText(" ");
        num2.setText(" ");
        lab.setText(" ");
    }

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
