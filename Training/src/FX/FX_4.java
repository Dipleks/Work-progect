package FX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FX_4 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
//        Line line = new Line(0,0,100,100);
//        line.setStroke(Color.GREEN);
//        line.setStrokeWidth(10);

        /*Нарисуем линию с помощю конваса:*/
        Canvas canvas = new Canvas(400, 500); //зададим размеры
        GraphicsContext context = canvas.getGraphicsContext2D();
        drawShapes(context); //добавим наши фигуры из метода drawShapes


        Group group = new Group();
        Scene scene = new Scene(group, 400, 500);
        group.getChildren().add(canvas);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //Создадим метод с нашими фигурами и добавим в метод start:
    private void drawShapes(GraphicsContext gc){
        gc.setFill(Color.BLUE); //заполненые фигуры
        gc.setStroke(Color.GREEN); //пустотелые фигуры
        gc.setLineWidth(5); //толщина линий
        gc.strokeLine(40,10,10,40); //линия
        gc.fillOval(10,60,30,30);
        gc.strokeOval(60,60,30,30);
        gc.fillRoundRect(110,60,30,30,10,10);
        gc.fillArc(10,110,30,30,45,240, ArcType.OPEN);
        gc.fillArc(60,110,30,30,45,240, ArcType.CHORD);
        gc.fillArc(110,110,30,30,45,240, ArcType.ROUND);
        gc.strokeArc(10,160,30,30,45,240, ArcType.OPEN);
        gc.strokeArc(60,160,30,30,45,240, ArcType.CHORD);
        gc.strokeArc(110,160,30,30,45,240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10,40,10,40}, new double[]{210,210,240,240}, 4);
        gc.strokePolygon(new double[]{60,90,60,90}, new double[]{210,210,240,240}, 4);
        gc.strokePolyline(new double[]{110,140,110,140}, new double[]{210,210,240,240}, 4);
    }
}
