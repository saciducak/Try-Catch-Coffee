package com.example.hadibismillah;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController3 implements Initializable {

    @FXML
    private LineChart<?, ?> Chart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series series = new XYChart.Series();

        series.getData().add(new XYChart.Data( "3" , "2" ));
        series.getData().add(new XYChart.Data( "1" , "7" ));
        series.getData().add(new XYChart.Data( "1" , "5" ));


    }
}

