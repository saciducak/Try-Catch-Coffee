package com.example.hadibismillah;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController2 implements Initializable {
    @FXML
    private Text Table;

    @FXML
    private Button Back;

    @FXML
    private Button approval;

    @FXML
    private Button lineChart;

    @FXML
    private ChoiceBox<String> TableAreas;

    @FXML
    private ChoiceBox<Integer> howMany2;

    @FXML
    private ChoiceBox<String> Menu;

    @FXML
    private ChoiceBox<String> Drink;

    @FXML
    private ChoiceBox<Integer> howMany;

    @FXML
    private TextArea drinkTextarea;

    @FXML
    private TextArea dessertTextarea;

    @FXML
    private TextArea tableTextarea;

    @FXML
    private Label drinklabel;

    @FXML
    private Label tablenolabel;

    @FXML
    private Label dessertlabel;

    @FXML
    void onApproval(MouseEvent event) {
        tableTextarea.appendText(TableAreas.getSelectionModel().getSelectedItem() + "\n");

        if (Menu.getSelectionModel().getSelectedItem() == null ){
            dessertTextarea.appendText("Nothing Ordered" + "\n");
        }
        else {
            dessertTextarea.appendText(Menu.getSelectionModel().getSelectedItem() + " " + howMany.getSelectionModel().getSelectedItem() +  "\n");
        }


        if (Drink.getSelectionModel().getSelectedItem() == null ){
            drinkTextarea.appendText("Nothing Ordered" + "\n");
        }
        else {
            drinkTextarea.appendText(Drink.getSelectionModel().getSelectedItem() +  " " + howMany2.getSelectionModel().getSelectedItem() + "\n");
        }

        if ( Integer.valueOf(howMany.getSelectionModel().getSelectedItem()).equals(0)){
        }
        else{
            drinkTextarea.appendText("Wait The Dessert!" + "\n" );
        }
        TableAreas.getSelectionModel().clearSelection();
        Drink.getSelectionModel().clearSelection();
        Menu.getSelectionModel().clearSelection();
        howMany.getSelectionModel().clearSelection();
        howMany2.getSelectionModel().clearSelection();



    }
    @FXML
    void GoBack(MouseEvent event) throws IOException {
        Stage stage = (Stage) Back.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello Again Stage 1 !");
        stage.setScene(scene);
    }
    @FXML
    void onLineChart(MouseEvent event) throws IOException {
        Stage stage = (Stage) lineChart.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lineChart.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(" LİNE CHART SCREEN !");
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Menu.getItems().addAll("Lluvia" , "Sebastian" , "Brownie" , "Lady Praline" , "Chocolate Special");
        howMany.getItems().addAll( 1 , 2 , 3 , 4 , 5);
        TableAreas.getItems().addAll("D1","D2","D3","D4","S1","S2","S3");
        Drink.getItems().addAll("Espresso","Cappucino","Latte","Lemonade");
        howMany2.getItems().addAll( 1 , 2 , 3 , 4 , 5);

    }
}