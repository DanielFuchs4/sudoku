package com.example.demo;

import javafx.css.Size;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class HelloController {
    int SIZE = 9;

    @FXML
    private GridPane hraciPole;

    @FXML
    public void initialize() {
        pridejText();
    }

    protected void pridejText() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                TextField textField = new TextField(""+i);
                hraciPole.add(textField, i, j);
                hraciPole.prefHeight(10);
                hraciPole.prefWidth(10);
            }
        }
    }

    private boolean hasDuplicates(String[] values, boolean chackAll){

        boolean[] seen = new boolean[SIZE + 1];
        for (String value : values) {
            if (value.isEmpty()){
                return true;
            }
        }
        int num;
        try{
            num = Integer.parseInt(values[0]);
        } catch(Exception e){
            re
        }


        return false;
    };



}
