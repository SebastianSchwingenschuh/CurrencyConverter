package org.example.currencyconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CurrencyConverterController {
    @FXML
    private TextField amountToConvert;
    
    @FXML
    private TextField convertedAmount;
    
    @FXML
    private ComboBox<String> desiredConversion;
    
    @FXML
    private Canvas canvas;

    public void handleConversionChange() {
        
    }


    public void handleReset() {
        
    }

    public void handleConvert() {
    }
    
    @FXML
    private void initialize(){
        handleReset();
        desired
        
    }
}
