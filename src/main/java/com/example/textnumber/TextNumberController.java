package com.example.textnumber;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TextNumberController {

    @FXML
    private Button buttonCountVowels;

    @FXML
    private Button buttonDigitSum;

    @FXML
    private Button buttonReset;

    @FXML
    private Button buttonReverseText;

    @FXML
    private TextField txtArea;

    @FXML
    private TextField txtField;

    @FXML
    void onButtonCountVowelsClick(ActionEvent event) {
        txtArea.setText(String.valueOf(Buttons.countVowels(txtField.getText())));
    }

    public Button getButtonCountVowels() {
        return buttonCountVowels;
    }

    public Button getButtonDigitSum() {
        return buttonDigitSum;
    }

    public Button getButtonReset() {
        return buttonReset;
    }

    public Button getButtonReverseText() {
        return buttonReverseText;
    }

    @FXML
    void onButtonDigitSumClick(ActionEvent event) {
        txtArea.setText(String.valueOf(Buttons.DigitSum(txtField.getText())));
    }

    @FXML
    void onButtonResetClick(ActionEvent event) {
        txtArea.setText("");
        txtField.setText("");
    }

    @FXML
    void onButtonReverseTextClick(ActionEvent event) {
        txtArea.setText(String.valueOf(Buttons.reverseText(txtField.getText())));
    }

}
