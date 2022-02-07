package com.mycompany.project1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button primaryButton;
    @FXML
    private Label messageLabel;//this will be updated with a message the user inputs
    @FXML
    private TextField textFieldMessage;//this is where the user types the message
    @FXML
    private Button buttonShowMessage;//this is where the eventhandler that will update messageLabel with a user input message

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void showMessage(ActionEvent event) {//this method is called when the button is pressed
        
        String str = textFieldMessage.getText();//gets text from the textfield
        
        messageLabel.setText(str);//sets the text of messageLabel
    }
    @FXML
    private void switchToUserInfo() throws IOException{//this will switch the window to the userinfo class
        App.setRoot("userinfo");
    }
}
