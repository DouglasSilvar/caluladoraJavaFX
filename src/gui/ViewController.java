package gui;


import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    private Double valorOne;
    private Double valorTwo;
    private Boolean operationFunction = false;
    private Boolean sumFunction = false;
    private Boolean subFunction = false;
    private Boolean divFunction = false;
    private Boolean multFunction = false;




    @FXML
    private Label labelResult;


    @FXML
    private Button btZero;
    @FXML
    private Button btOne;
    @FXML
    private Button btTwo;
    @FXML
    private Button btThree;
    @FXML
    private Button btFour;
    @FXML
    private Button btFive;
    @FXML
    private Button btSix;
    @FXML
    private Button btSeven;
    @FXML
    private Button btEight;
    @FXML
    private Button btNine;
    @FXML
    private Button btEquals;
    @FXML
    private Button btSum;
    @FXML
    private Button btSub;
    @FXML
    private Button btMult;
    @FXML
    private Button btDiv;
    @FXML
    private Button btPoint;
    @FXML
    private Button btMinus;
    @FXML
    private Button btC;
    @FXML
    private Button btPercent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void onBtPointAction(){
        if(!labelResult.getText().contains("."))
            labelResult.setText(labelResult.getText().concat("."));
    }

    @FXML
    public void onBtCAction(){
        setBooleanFunctions(false,false,false,false,false);
        labelResult.setText("0");
    }

    @FXML
    public void onBtZeroAction() {
        validate();
        numberReceive("0");
    }

    @FXML
    public void onBtOneAction(){
        validate();
        numberReceive("1");
    }
    @FXML
    public void onBtTwoAction(){
        validate();
        numberReceive("2");
    }
    @FXML
    public void onBtThreeAction(){
        validate();
        numberReceive("3");
    }
    @FXML
    public void onBtFourAction(){
        validate();
        numberReceive("4");
    }
    @FXML
    public void onBtFiveAction(){
        validate();
        numberReceive("5");
    }
    @FXML
    public void onBtSixAction(){
        validate();
        numberReceive("6");
    }
    @FXML
    public void onBtSevenAction(){
        validate();
        numberReceive("7");
    }
    @FXML
    public void onBtEightAction(){
        validate();
        numberReceive("8");
    }
    @FXML
    public void onBtNineAction(){
        validate();
        numberReceive("9");
    }

    @FXML
    public void onBtMinusAction(){

        String minusValor = labelResult.getText();
        if (minusValor.contains("-")){
            labelResult.setText(minusValor.replace("-",""));
        }else{
            labelResult.setText("-".concat(minusValor));
        }
    }

    @FXML
    public void onBtSumAction(){
        if(sumFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne + valorTwo;
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            sumFunction = false;
        }
        valorOne = Double.parseDouble(labelResult.getText());
        setBooleanFunctions(true,true,false,false,false);
    }

    @FXML
    public void onBtSubAction(){
        if(subFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne - valorTwo;
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            subFunction = false;
        }
        valorOne = Double.parseDouble(labelResult.getText());
        setBooleanFunctions(true,false,true,false,false);
    }

    @FXML
    public void onBtMultAction(){
        if(multFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne * valorTwo;
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            subFunction = false;
        }
        valorOne = Double.parseDouble(labelResult.getText());
        setBooleanFunctions(true,false,false,false,true);
    }

    @FXML
    public void onBtDivtAction(){
        if(divFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne / valorTwo;
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            subFunction = false;
        }
        valorOne = Double.parseDouble(labelResult.getText());
        setBooleanFunctions(true,false,false,true,false);
    }



    @FXML
    public void onBtEqualsAction(){
        if(sumFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne + valorTwo;
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            sumFunction = false;
        }
        if(subFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne - valorTwo;
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            subFunction = false;
        }
        if(multFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne * valorTwo;
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            multFunction = false;
        }
        if(divFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne / valorTwo;
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            divFunction = false;
        }
    }
    @FXML
    public void onBtPercentAction(){
        if(sumFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne + (valorOne / (100/valorTwo));
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            sumFunction = false;
        }
        if(subFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne - (valorOne / (100/valorTwo));
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            subFunction = false;
        }
        if(multFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne * (valorTwo/100);
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            multFunction = false;
        }
        if(divFunction){
            valorTwo = Double.parseDouble(labelResult.getText());
            Double results = valorOne / (valorTwo/100);
            labelResult.setText(results.toString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
            divFunction = false;
        }
    }

    public void validate(){
        if(labelResult.getText().equals("0")){labelResult.setText("");}
        if(operationFunction){
            labelResult.setText("");
            operationFunction = false;
        }
    }

    public void numberReceive(String number){
        labelResult.setText(labelResult.getText().concat(number));
    }

    public void setBooleanFunctions(Boolean operationFunction, Boolean sumFunction, Boolean subFunction, Boolean divFunction, Boolean multFunction) {
        this.operationFunction = operationFunction;
        this.sumFunction = sumFunction;
        this.subFunction = subFunction;
        this.divFunction = divFunction;
        this.multFunction = multFunction;
    }


}
