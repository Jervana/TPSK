package com.example.lab31testprogramr;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class HelloController {
    @FXML
    private Label label;
    @FXML
    private Label label2;
    @FXML
    private TextField textField;
    @FXML
    private TextField textField2;
    @FXML
    private TextField textField3;
    @FXML
    protected void Button () {
        Number n = new Number();
        int number;
        try {
            number = Integer.parseInt( textField.getText() );
            if (number > 999 || number < 100) {
                label.setText( "Потрібно ввести 3-х значне число" );
            } else {
                label.setText( "Перше число -" + n.q( number ) + "    ,Останье число -" + n.w( number ) );
            }
        } catch (NumberFormatException e) {
            label.setText( "Не вірний формат !" );
        }
    }
    public void Button2 () {
        int n = 0;
        try {
            n = Integer.parseInt( textField2.getText() );
        } catch (NumberFormatException e) {
            label2.setText( "Не вірний формат!" );
        }
        String q = String.valueOf( n );
        if (n <= 12 && n > 0) {
            label2.setText( "Введіть число від 1 до 12 " );
            switch (q) {
                case "1":
                    textField3.setText( "Січень" );
                    break;
                case "2":
                    textField3.setText( "Лютий" );
                    break;
                case "3":
                    textField3.setText( "Березень" );
                    break;
                case "4":
                    textField3.setText( "Квітень" );
                    break;
                case "5":
                    textField3.setText( "Травень" );
                    break;
                case "6":
                    textField3.setText( "Червень" );
                    break;
                case "7":
                    textField3.setText( "Липень" );
                    break;
                case "8":
                    textField3.setText( "Серпень" );
                    break;
                case "9":
                    textField3.setText( "Вересень" );
                    break;
                case "10":
                    textField3.setText( "Жовтень" );
                    break;
                case "11":
                    textField3.setText( "Листопад" );
                    break;
                case "12":
                    textField3.setText( "Грудень" );
                    break;
            }
        }
        else{
            label2.setText( "Не вірне число!" );
        }
        try {
            n = Integer.parseInt( textField2.getText() );
        } catch (NumberFormatException e) {
            label2.setText( "Не вірний формат!" );
        }
    }
}

