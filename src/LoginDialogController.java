import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginDialogController implements Initializable {

    @FXML
    private Label main;

    @FXML
    private Label usernameLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;

    @FXML
    public void loginButtonAction(ActionEvent event) throws IOException {
        Parent homePageParent = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene homePageScene = new Scene(homePageParent);
//        Stage appStage = (Stage) ((Node) event.getSource().getScene().getWindow());

//        if(isValidUser()){
//            appStage.hide();
//            appStage.setScene(homePageScene);
//            appStage.show();
//        }
    }

    @FXML
    public void cancelButtonAction(ActionEvent event){

    }

//    private boolean isValidUser(){
//
//    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
