package FX;/*Графики - Charts*/
/*В JavaFX есть 6 типов графиков!*/
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class FX_17 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Круглый график:
//        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
//               new PieChart.Data("Grapefruit", 13),
//               new PieChart.Data("Orengest", 25),
//               new PieChart.Data("Plums", 10),
//               new PieChart.Data("Pears",22),
//               new PieChart.Data("Apples", 30));
//        //Строим графики:
//        PieChart chart = new PieChart(data);
//        chart.setTitle("Product");

        //Сделаем линейный график:
        primaryStage.setTitle("Line Char Semple");
        //создадим числовую ось:
        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();
        x.setLabel("Number of Month"); //название оси х.
        //вводим линейный график:
        LineChart<Number, Number> lineChart = new LineChart<>(x, y);
        lineChart.setTitle("Stock Monitoring, 2017"); //название графика
        //создадим ряд:
        XYChart.Series series = new XYChart.Series();
        series.setName("My Portfolio"); //название значения на графике
        //напишем значения координат My Portfolio:
        series.getData().add(new XYChart.Data<>(1, 23));
        series.getData().add(new XYChart.Data<>(2, 14));
        series.getData().add(new XYChart.Data<>(3, 15));
        series.getData().add(new XYChart.Data<>(4, 24));
        series.getData().add(new XYChart.Data<>(5, 34));
        series.getData().add(new XYChart.Data<>(6, 36));
        series.getData().add(new XYChart.Data<>(7, 22));
        series.getData().add(new XYChart.Data<>(8, 45));
        series.getData().add(new XYChart.Data<>(9, 43));
        series.getData().add(new XYChart.Data<>(10, 17));
        series.getData().add(new XYChart.Data<>(11, 29));
        series.getData().add(new XYChart.Data<>(12, 25));
        //передадим значения на график:
        lineChart.getData().add(series); //передадим координаты

        Group root = new Group();
        root.getChildren().add(lineChart);
        Scene scene = new Scene(root, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
