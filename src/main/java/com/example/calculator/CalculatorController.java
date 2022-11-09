package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class CalculatorController {

    @FXML
    private Button EqualstoButton;


    char Sign = '`';


    static double StoringNum= 0.0;
    static int Counter=0;
    @FXML
    void clearfield(MouseEvent event) {
            ResultField.setText("");
        ResultField.clear();
        ResultPrompt.setText("");
        Counter=0;
        StoringNum=0;

    }

//    @FXML
//    private Text Result;

    @FXML
    private TextField ResultField;

    @FXML
    private Text ResultPrompt;


    @FXML
    void divfunc(MouseEvent event) {
        Sign='/';
        if(Counter==0) {
            StoringNum = 1;
            Counter=1;
        }
       StoringNum=(Double.parseDouble(ResultField.getText())/StoringNum);
        ResultField.clear();
        ResultField.setText(String.valueOf(StoringNum));
        ResultPrompt.setText(ResultField.getText());
        ResultField.setText("");

    }

    @FXML
    void fieldhv0(MouseEvent event) {
        ResultField.setText(ResultField.getText()+"0");


    }

    @FXML
    void fieldhv1(MouseEvent event) {

            ResultField.setText(ResultField.getText()+"1");

    }


    @FXML
    void fieldhv2(MouseEvent event) {
        ResultField.setText(ResultField.getText()+"2");

    }

    @FXML
    void fieldhv3(MouseEvent event) {

        ResultField.setText(ResultField.getText()+"3");

    }

    @FXML
    void fieldhv4(MouseEvent event) {

        ResultField.setText(ResultField.getText()+"4");

    }

    @FXML
    void fieldhv5(MouseEvent event) {
        ResultField.setText(ResultField.getText()+"5");

    }

    @FXML
    void fieldhv6(MouseEvent event) {
        ResultField.setText(ResultField.getText()+"6");

    }

    @FXML
    void fieldhv7(MouseEvent event) {
        ResultField.setText(ResultField.getText()+"7");

    }

    @FXML
    void fieldhv8(MouseEvent event) {
        ResultField.setText(ResultField.getText()+"8");

    }

    @FXML
    void fieldhv9(MouseEvent event) {
        ResultField.setText(ResultField.getText()+"9");

    }

    @FXML
    void minusfunc(MouseEvent event) {
        Sign= '-';
        if(Counter==0) {
            Counter=1;}
        StoringNum-=Double.parseDouble(ResultField.getText());
        ResultField.clear();
        ResultField.setText(String.valueOf(StoringNum));
        ResultPrompt.setText(ResultField.getText());
        ResultField.setText("");
    }

    @FXML
    void mulfunc(MouseEvent event) {
        Sign= '*';
        if(Counter==0) {
            StoringNum = 1;
            Counter=1;
        }
        StoringNum*=Double.parseDouble(ResultField.getText());
        ResultField.clear();
        ResultField.setText(String.valueOf(StoringNum));
        ResultPrompt.setText(ResultField.getText());
        ResultField.setText("");
    }




    @FXML
    void plusfunc(MouseEvent event) {
        if(Counter==0) {
            Counter = 1;
        }
        Sign = '+';
        StoringNum+=Double.parseDouble(ResultField.getText());
        ResultField.clear();
        ResultField.setText(String.valueOf(StoringNum));
        ResultPrompt.setText(ResultField.getText());
        ResultField.setText("");
    }

    @FXML
    void showResultonField(MouseEvent event) {

            if(Sign == '+')
            {
            plusfunc(event);
            }
        if(Sign == '/')
        {
            divfunc(event);
        }
        if(Sign=='*')
        {
            mulfunc(event);
        }
        if(Sign=='-')
        {
            minusfunc(event);
        }
        else
        {
            //do nothing
        }

    }

}
