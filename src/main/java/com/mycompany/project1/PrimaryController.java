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
    private Label messageLabel;
    @FXML
    private TextField textFieldMessage;
    @FXML
    private Button buttonShowMessage;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void showMessage(ActionEvent event) {
        
        String str = textFieldMessage.getText();
        
        messageLabel.setText(str);
    }
    @FXML
    private void switchToUserInfo() throws IOException{
        App.setRoot("userinfo");
    }
}
