package com.example.demo6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        class Func {
            private double xmin, xmax;
            private int step;

            public Func(double min, double max, int numStep) {
                xmin = min;
                xmax = max;
                step = numStep;
            }

            private double f(double x) {
                return (3 - 4 * x) / (x * x + 1);
            }

            public String getName() {
                return "(3 - 4*x)/(x*x+1)";
            }

            public XYChart.Series getSeries() {
                ObservableList<XYChart.Data> datas = FXCollections.observableArrayList();
                double x0 = xmin;
                double h = (xmax - x0) / step;
                for (int i = 0; i < step; i++) {
                    datas.add(new XYChart.Data(x0 + h * i, f(x0 + h * i)));
                }
                XYChart.Series series = new XYChart.Series();
                series.setName(getName());
                series.setData(datas);
                return series;
            }
        }

            Group groupChart;
        {
            groupChart = new Group();
            Func f = new Func(-5, 5, 600);
            NumberAxis x = new NumberAxis();
            NumberAxis y = new NumberAxis();
            LineChart<Number, Number> numberLineChart = new LineChart<>(x, y);
            numberLineChart.setCreateSymbols(false);
            numberLineChart.setLayoutX(400);
            numberLineChart.setLayoutY(60);
            numberLineChart.setMinHeight(600);
            numberLineChart.setMinWidth(600);
            numberLineChart.getData().add(f.getSeries());
            groupChart.getChildren().add(numberLineChart);
        }

        StackPane root = new StackPane();
        root.getChildren().add(groupChart);

        Scene scene = new Scene(root,1000,1000);

        primaryStage.setTitle("Linechart");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}