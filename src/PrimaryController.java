package com.mycompany.calculator;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField display;
    @FXML
    private Button b0;
    @FXML
    private Button bpoint;
    @FXML
    private Button bequal;
    @FXML
    private Button badd;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button bsub;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button bmultiply;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button bdiv;

    String oldtext = "";
    String displaytext = "";
    String newtext = "";
    String operation = "";
    @FXML
    private void showDisplay(ActionEvent event) 
    {
        displaytext += ((Button)event.getSource()).getText();
        display.setText(displaytext);
    }

    @FXML
    private void doOperation(ActionEvent event) 
    {
        operation = ((Button)event.getSource()).getText();
        oldtext = displaytext;
        displaytext = "";
        display.setText(displaytext);
    }

    @FXML
    private void showResult(ActionEvent event) 
    {
        newtext = display.getText();
        
        int first_op = Integer.parseInt(oldtext);
        int second_op = Integer.parseInt(newtext);
        int result = 0;
        
        switch(operation)
        {
            case "+":
                result  = first_op + second_op;
                break;
            case "-":
                result  = first_op - second_op;
                break;
            case "*":
                result  = first_op * second_op;
                break;
            case "/":
                result  = first_op / second_op;
                break;
        }
        
        displaytext = "" + result;
        display.setText(displaytext);      
    }
}
