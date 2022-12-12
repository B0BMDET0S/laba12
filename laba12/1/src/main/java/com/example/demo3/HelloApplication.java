package com.example.demo3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {{

            Group groupChart = new Group();
            String austria = "Austria", brazil = "Brazil", france = "France",
                    italy = "Italy", usa = "USA";
            final CategoryAxis xAxis = new CategoryAxis();
            final NumberAxis yAxis = new NumberAxis();
            final BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
            bc.setTitle("Country weather");
            xAxis.setLabel("Country");
            yAxis.setLabel("Temperature");

            XYChart.Series series1 = new XYChart.Series<>();
            series1.setName("June");
            series1.getData().add(new XYChart.Data(austria, 16.4));
            series1.getData().add(new XYChart.Data(brazil, 22.6));
            series1.getData().add(new XYChart.Data(france, 19.2));
            series1.getData().add(new XYChart.Data(italy, 20.5));
            series1.getData().add(new XYChart.Data(usa, 22.1));

            XYChart.Series series2 = new XYChart.Series();
            series2.setName("July");
            series2.getData().add(new XYChart.Data(austria, 17.6));
            series2.getData().add(new XYChart.Data(brazil, 21.8));
            series2.getData().add(new XYChart.Data(france, 21.1));
            series2.getData().add(new XYChart.Data(italy, 22.5));
            series2.getData().add(new XYChart.Data(usa, 24.6));

            XYChart.Series series3 = new XYChart.Series();
            series3.setName("August");
            series3.getData().add(new XYChart.Data(austria, 17.2));
            series3.getData().add(new XYChart.Data(brazil, 22.1));
            series3.getData().add(new XYChart.Data(france, 20.4));
            series3.getData().add(new XYChart.Data(italy, 22.3));
            series3.getData().add(new XYChart.Data(usa, 23.8));

            bc.getData().addAll(series1, series2, series3);
            groupChart.getChildren().add(bc);

            StackPane root = new StackPane();
            root.getChildren().add(groupChart);

            Scene scene = new Scene(root, 500, 500);

            primaryStage.setTitle("GroupChart");
            primaryStage.setScene(scene);
            primaryStage.show();

    }}

    public static void main(String[] args) {
        launch();
    }
}