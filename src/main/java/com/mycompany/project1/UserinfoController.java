/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author soblab
 */
public class UserinfoController implements Initializable {


    @FXML
    private TextField textFieldFirst;
    @FXML
    private TextField textFieldLast;
    @FXML
    private Button buttonShowFullName;
    @FXML
    private Button switchToPrimary;
    /**
     * Initializes the controller class.
     */
   
    
    @FXML
    private void showFullName(ActionEvent event) {
        String fName = textFieldFirst.getText();//gets first name from text field
        String lName = textFieldLast.getText();//gets last name from text field
        
        Alert a = new Alert(AlertType.INFORMATION); //this is an alert, learned about this, it creates a dialog box and shows the message in this case the full name 
        
        a.setTitle("First and Last name");//sets the title of the alert
        a.setHeaderText("Lab One: ");//sets the header text
        a.setContentText(fName + lName);//sets the message
        
        
        a.showAndWait();//this will cause the alert to show, then keep it up until the user closes the window?
    }

    @FXML
    private void switchToPrimaryView(ActionEvent event) throws IOException {//something I added, it will put you back to the primary window 
        App.setRoot("primary");
    }

    
    
    
    
    
    
    
    
    //this is added after I created the controller class, it says i must implement all abstract methods 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
