package com.example.hadibismillah;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController  {

    // Defining our buttons,texts,areas etc. for FXML document...
    @FXML
    private Button Help;

    @FXML
    private Button Entry;

    @FXML
    private Button Exit;

    @FXML
    private Button openButton;

    @FXML
    private Button secretRegisterButton;

    @FXML
    private PasswordField SecretPasswordField;

    @FXML
    private CheckBox showPassword;

    @FXML
    private RadioButton radiobutton;

    @FXML
    private TextField EntryId;

    @FXML
    private Text SecretId;

    @FXML
    private Text SecretPassword;

    @FXML
    private Text Password;

    @FXML
    private Text IncorrectText;

    @FXML
    private Text textRegister;

    @FXML
    private Text ID;

    @FXML
    private Text call;

    @FXML
    private Label help;

    @FXML
    private Text or;

    @FXML
    private Text mail;

    @FXML
    private Text bobMarley;

    @FXML
    private TextField passwordText;

    @FXML
    private TextField SecretTextField;

    @FXML
    private ImageView welcome;

    @FXML
    private PasswordField EntryPassword;

    @FXML
    void GoNext(MouseEvent event) throws IOException {
        Stage stage;
        String password = "java";                                               // Default Password. The System will check it out.
        String passwordUser = EntryPassword.getText();
        System.out.println(passwordUser);                                       // For the Showpassord! Let the User know what he write on passwordField.
        //System.out.println(password);
        if (password.equals(passwordUser)) {
            stage = (Stage) Entry.getScene().getWindow();                       // Opening Stage2 if our password is equals to the default password.
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("helloview1.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Stage 2 !");
            stage.setScene(scene);
        }
        else {
            System.out.println("Not Correct!");
            IncorrectText.setVisible(true);
        }
    }
    @FXML
    void onShowPassword(MouseEvent event) {
        if(showPassword.isSelected()){
            passwordText.setText(EntryPassword.getText());
            passwordText.setVisible(true);
            EntryPassword.setVisible(false);
            return;
        }
        EntryPassword.setText(passwordText.getText());
        EntryPassword.setVisible(true);
        passwordText.setVisible(false);
    }

    @FXML
    void onHelpButtonClicked(MouseEvent event) throws IOException {
        Stage stage = (Stage) Exit.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("helloview3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(" HELP SCREEN !");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void onExitButtonClicked(MouseEvent event) {
        Stage stage=(Stage)Exit.getScene().getWindow();
        stage.close();
    }

    @FXML
    void getField(MouseEvent event) {
        SecretId.setVisible(true);
        SecretTextField.setVisible(true);
        SecretPasswordField.setVisible(true);
        SecretPassword.setVisible(true);
        secretRegisterButton.setVisible(true);
    }
    @FXML
    void onRegisterButton(MouseEvent event) {
        SecretId.setVisible(false);
        SecretTextField.setVisible(false);
        SecretPasswordField.setVisible(false);
        SecretPassword.setVisible(false);
        secretRegisterButton.setVisible(false);
        textRegister.setVisible(true);
    }

    //@Override
    //public void initialize(URL url, ResourceBundle resourceBundle) {
      //  Image image = new Image(getClass().getResourceAsStream("/com.example.hadibismillah/photo/welcome.jpg"));
        //welcome.setImage(image);
    //}

}