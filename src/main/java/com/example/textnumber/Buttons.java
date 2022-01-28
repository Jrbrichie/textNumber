package com.example.textnumber;

public class Buttons {
    static int countVowels(String textNum){
        int vowels = 0;
        for(int i = 0; i < textNum.length(); i++){
            if(textNum.charAt(i) == 'a' || textNum.charAt(i) == 'e' || textNum.charAt(i) == 'i'
                    || textNum.charAt(i) == 'o' || textNum.charAt(i) == 'u'){
                vowels++;
            }
        } return vowels;
    }

    static int DigitSum(String textNum){
        int sum = 0;
        for(int i = 0; i < textNum.length(); i++){
            if(textNum.charAt(i) >= 49 && textNum.charAt(i) <= 57){
                sum += Integer.parseInt(textNum.substring(i, i + 1));
            }
        } return sum;
    }

    static String reverseText(String textNum){
        String reversed = "";
        for(int i = textNum.length() - 1; i >= 0; i--){
            reversed += textNum.substring(i, i + 1);
        } return reversed;
    }
}
