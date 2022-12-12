package com.example.demo5;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {{

            Group groupChart = new Group();
            ObservableList<PieChart.Data> pieChartData
                    = FXCollections.observableArrayList(
                    new PieChart.Data("Apple", 73.8),
                    new PieChart.Data("Samsung", 69.4),
                    new PieChart.Data("Huawei", 56.2),
                    new PieChart.Data("Xiaomi", 32.8),
                    new PieChart.Data("OPPO", 30.6),
                    new PieChart.Data("Others", 106));
            PieChart chart = new PieChart(pieChartData);
            chart.setTitle("Smartphone sales");
            chart.setLegendSide(Side.LEFT);
            Label caption = new Label("");
            caption.setTextFill(Color.DARKBLUE);
            caption.setStyle("-fx-font: 16 arial;");
            groupChart.getChildren().add(caption);
            for (PieChart.Data data : chart.getData()) {
                data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED, (MouseEvent e) -> {
                    caption.setTranslateX(e.getSceneX()-caption.getWidth()/2);
                    caption.setTranslateY(e.getSceneY()-caption.getHeight());
                    caption.setText(data.getPieValue()+"");
                    caption.toFront(); }); }
            groupChart.getChildren().add(chart);

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