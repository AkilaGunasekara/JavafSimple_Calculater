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

//...............................................................................................................
    // For Addition

    @FXML
    public void caladdition(ActionEvent event){
        num2.setDisable(false);

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
//...............................................................................................................
    // For Subtraction

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

//...............................................................................................................
    // For Multiplication

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

    //...............................................................................................................
    // For Division
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

    //...............................................................................................................
    // For Sin
    @FXML
    void calsin(ActionEvent event){
        try {
            double number = Integer.parseInt(num1.getText());
            number = Math.toRadians(number);
            double sinvalue = Math.sin(number);
            num2.setDisable(true);
            lab.setText(String.valueOf(sinvalue));
        }
        catch (Exception e){
            num1.setText(num1.getText());
            num2.setText("▲");
            num2.setDisable(true);
            lab.setText("");

        }
//...............................................................................................................
        // For Exp

        }
    @FXML
    void calexp(ActionEvent event) {
        try {
            double number = Integer.parseInt(num1.getText());
            number = Math.toRadians(number);
            num2.setDisable(true);
            double expvalue = Math.exp(number);

            lab.setText(String.valueOf(expvalue));

        } catch (Exception e) {
            num1.setText(num1.getText());
            num2.setText("▲");
            num2.setDisable(true);
            lab.setText("");

        }
    }
    //...............................................................................................................
    // For Cos
        @FXML
    void calcos(ActionEvent event){
            try {
        double number = Integer.parseInt(num1.getText());
        number = Math.toRadians(number);
        double cosvalue = Math.cos(number);
        num2.setDisable(true);
        lab.setText(String.valueOf(cosvalue));

    }

        catch (Exception e) {
        num1.setText(num1.getText());
        num2.setText("▲");
        num2.setDisable(true);
        lab.setText("");

    }
    }
    //...............................................................................................................
    // For Tan
    @FXML
    void caltan(ActionEvent event){
        try {
        double number = Integer.parseInt(num1.getText());
        number = Math.toRadians(number);
        double tanvalue = Math.tan(number);
        num2.setDisable(true);
        lab.setText(String.valueOf(tanvalue));
    }
        catch (Exception e) {
            num1.setText(num1.getText());
            num2.setText("▲");
            num2.setDisable(true);
            lab.setText("");

        }
    }
    //...............................................................................................................
    // For Clear
    public void clearb(ActionEvent event){
    try{

        num1.setText(" ");
        num2.setText(" ");
        lab.setText(" ");
    }
    catch (Exception e){
        num1.setText(num1.getText());
        num2.setText(num1.getText());
        lab.setText(" ");
    }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
