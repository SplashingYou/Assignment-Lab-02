package com.example.csc311_fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    int numOfYears = 0;
    int loanAmount = 0;

    double interestRate = 0.0;

    double monthlyPayment = 0.0;

    double totalPayment = 0.0;

    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText2;

    @FXML
    private TextField AIR;


    @FXML
    private TextField NOY;

    @FXML
    private TextField LA;

    @FXML
    private TextField MP;

    @FXML
    private TextField TP;









    @FXML
    protected void CalculatorButton() {
        numOfYears = Integer.parseInt(NOY.getText()) * 12;
        loanAmount = Integer.parseInt(LA.getText());
        interestRate = Double.parseDouble(AIR.getText())/100;
        totalPayment = loanAmount*(1+interestRate*2);
        monthlyPayment = (double) loanAmount/numOfYears;

        TP.setText("$" + Double.toString(totalPayment));
        MP.setText("$" + Double.toString(monthlyPayment));

    }

    @FXML
    protected void onButton2Click() {
        welcomeText2.setText("Welcome to JavaFX Application!");
    }


}