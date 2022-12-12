package com.example.demo6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        ObservableList<PieChart.Data> valueList = FXCollections.observableArrayList(

                new PieChart.Data("March1", -2),
                new PieChart.Data("March2", -5),
                new PieChart.Data("March3", -2),
                new PieChart.Data("March4", -4),
                new PieChart.Data("March5", 3),
                new PieChart.Data("March6", -6),
                new PieChart.Data("March7", -2),
                new PieChart.Data("March8", -1),
                new PieChart.Data("March9", 5),
                new PieChart.Data("March10", 1),
                new PieChart.Data("March11", 1),
                new PieChart.Data("March12", 0),
                new PieChart.Data("March13", -1),
                new PieChart.Data("March14", 0),
                new PieChart.Data("March15", 3),
                new PieChart.Data("March16", -1),
                new PieChart.Data("March17", 2),
                new PieChart.Data("March18", 5),
                new PieChart.Data("March19", 2),
                new PieChart.Data("March20", 4),
                new PieChart.Data("March21", 4),
                new PieChart.Data("March22", 0),
                new PieChart.Data("March23", 6),
                new PieChart.Data("March24", 1),
                new PieChart.Data("March25", 4),
                new PieChart.Data("March26", 6),
                new PieChart.Data("March27", -1),
                new PieChart.Data("March28", 2),
                new PieChart.Data("March29", 4),
                new PieChart.Data("March30", 7),
                new PieChart.Data("March31", 11));

        PieChart pieChart = new PieChart(valueList);
        pieChart.setTitle("Month Temperature");
        root.getChildren().addAll(pieChart);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Pie Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}