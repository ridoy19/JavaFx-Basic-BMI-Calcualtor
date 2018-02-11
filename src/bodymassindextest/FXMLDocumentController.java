/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindextest;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author RIRO
 */
public class FXMLDocumentController implements Initializable {
    
    private double Height;
    private double Weight;
    
    @FXML
    private Label label;
    @FXML
    private TextField displayField;
    @FXML
    private TextField displayField1;
    @FXML
    private TextField displayField2;
    @FXML
    private TextField displayField3;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }    

    @FXML
    private void handleClearAction(ActionEvent event) {
        displayField.setText("");
        displayField1.setText("");
        displayField2.setText("");
        displayField3.setText("");
        displayField3.setStyle("");
        
    }

    @FXML
    private void handleCalculateAction(ActionEvent event) {
        String height = displayField.getText();
        Height = Double.parseDouble(height);
        String weight = displayField1.getText();
        Weight = Double.parseDouble(weight);
        if(Height > 10){
            Height = Height / 100;
        }
        
        double BMI = (Weight/(Height * Height));
        String Calc_BMI = String.format("%.3f",BMI);
        
        displayField2.setText(""+Calc_BMI);
        
        //displayField2.setText(""+Math.round (BMI * 1000000.0) / 100.0);
        
        if(BMI <= 18.5){
            displayField3.setText("Under Weight");
            displayField3.setStyle("-fx-control-inner-background: #EFF603;");
            label.setText("You Need To Gain Weight!");
        }
        else if(BMI >= 18.6 && BMI <= 24.9){
            displayField3.setText("Normal Weight");
            displayField3.setStyle("-fx-control-inner-background: #019916;");
            label.setText("You are averge!");
        }
        else if(BMI >= 25 && BMI <= 29.9){
            displayField3.setText("Over Weight");
            displayField3.setStyle("-fx-control-inner-background: #EE3803;");
            label.setText("You are near to Obese!!");
        }
        else if(BMI >= 30 && BMI <= 34.9){
            displayField3.setText("Class I Obese");
            displayField3.setStyle("-fx-control-inner-background: #FD001B;");
            label.setText("You are in Class I Over Weight!");
        }
        else if(BMI >= 35 && BMI <= 39.9){
            displayField3.setText("Class II Obese");
            displayField3.setStyle("-fx-control-inner-background: #FD001B;");
            label.setText("You are in Class II Over Weight!!");
        }
        else if(BMI >= 40){
            displayField3.setText("Class III Obese");
            displayField3.setStyle("-fx-control-inner-background: #FD001B;");
            label.setText("You are in Class III Over Weight!!");
        }
    }
    
}
