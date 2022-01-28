package com.example.textnumber;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.Mnemonic;
import javafx.stage.Stage;

import java.io.IOException;

public class TextNumberApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("");
        FXMLLoader fxmlLoader = new FXMLLoader(TextNumberApplication.class.getResource("text-number.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);

        KeyCombination countVowels = new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_ANY);
        KeyCombination digitSum = new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_ANY);
        KeyCombination reset = new KeyCodeCombination(KeyCode.R, KeyCombination.CONTROL_ANY);
        KeyCombination reverseText = new KeyCodeCombination(KeyCode.R, KeyCombination.ALT_ANY);

        TextNumberController controller = new TextNumberController();
        scene.addMnemonic(new Mnemonic(controller.getButtonCountVowels(), countVowels));
        scene.addMnemonic(new Mnemonic(controller.getButtonDigitSum(), digitSum));
        scene.addMnemonic(new Mnemonic(controller.getButtonReset(), reset));
        scene.addMnemonic(new Mnemonic(controller.getButtonReverseText(), reverseText));

        stage.setTitle("Text | Num");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}