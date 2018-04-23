package FX;/*Работа с 3D*/

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class FX_18 extends Application {

    private PerspectiveCamera camera;
    private final double cameraModifier = 50.0;
    private final double sceneWidth = 600.0;
    private final double sceneHeight = 600.0;
    private final double cameraQuantity = 10.0;
    private double mouseXold = 0;
    private double mouseYold = 0;
    private final double cameraYlimit = 15;
    private final double rotateModifier = 25;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*Создадим объект камера, позволяющий нам видеть наши объекты
        * под разными углами:*/
        Camera camera = new PerspectiveCamera();
        camera.setFarClip(50000.0);
        camera.setTranslateZ(-1000);

        //Создадим цилиндр:
        Cylinder cylinder = new Cylinder(50, 100);
        PhongMaterial blueMaterial = new PhongMaterial();
        blueMaterial.setDiffuseColor(Color.DARKBLUE); //цвет к которому он будет приблежаться
        blueMaterial.setSpecularColor(Color.BLUE); //основной цвет
        cylinder.setMaterial(blueMaterial);
        /*повернем наш объект по оси Х:*/
        cylinder.setRotationAxis(Rotate.X_AXIS);
        cylinder.setRotate(45);

        Group root = new Group();
        root.getChildren().add(cylinder);
        Scene scene = new Scene(root, 700, 500);
        //scene.setFill(Color.BLACK); //сделаем сцену черной
        scene.setCamera(camera);
        primaryStage.setScene(scene);

        /*добовим на сцену обработчик кликов мыши*/
        scene.setOnMouseClicked(event -> {
            //получим объект, если он не равен 0, то увеличим его в 2 раза, если он
            //уже увеличен в 2 раза, то будем уменьшать его до 1
            Node picked = event.getPickResult().getIntersectedNode();
            if (null != picked) {
                double scalar = 2;
                if (picked.getScaleX() > 1)
                    scalar = 1;
                picked.setScaleX(scalar);
                picked.setScaleY(scalar);
                picked.setScaleZ(scalar);
            }
        });

        /*создадим обработчик событий который будет пердвигать объект
        * по нажатию клавиш(по оси Z - приближение, отдаление, по Х - влево, вправо):*/
        scene.setOnKeyPressed(event -> {
            double change = cameraQuantity;
            if (event.isShiftDown()){
                change = cameraModifier;
            }
            KeyCode keyCode = event.getCode();
            if (keyCode == KeyCode.W){
                camera.setTranslateZ(camera.getTranslateZ() + change);
            }
            if (keyCode == KeyCode.S){
                camera.setTranslateZ(camera.getTranslateZ() - change);
            }
            if (keyCode == KeyCode.A){
                camera.setTranslateX(camera.getTranslateX() + change);
            }
            if (keyCode == KeyCode.D){
                camera.setTranslateX(camera.getTranslateX() - change);
            }
        });

        /*Создадим обработчик событий; по движенюь мышки будет перемещаться наш элемент:*/
        Rotate xRotate = new Rotate(0,0,0,0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate(0,0,0,0, Rotate.Y_AXIS);
        camera.getTransforms().addAll(xRotate, yRotate);
        scene.addEventHandler(MouseEvent.ANY, event -> {
            if (event.getEventType() == MouseEvent.MOUSE_PRESSED ||
                    event.getEventType() == MouseEvent.MOUSE_DRAGGED){
                double moseXnew = event.getSceneX();
                double moseYnew = event.getSceneY();
                if (event.getEventType() == MouseEvent.MOUSE_DRAGGED){
                    double pitchRotate = xRotate.getAngle() - (moseXnew - mouseYold)/rotateModifier;
                    pitchRotate = pitchRotate > cameraYlimit ? cameraYlimit : pitchRotate;
                    pitchRotate = pitchRotate < -cameraYlimit ? -cameraYlimit : pitchRotate;
                    xRotate.setAngle(pitchRotate);
                    double yawRotate = yRotate.getAngle() + (moseXnew - mouseXold) / rotateModifier;
                    yRotate.setAngle(yawRotate);
                }
                mouseXold = moseXnew;
                mouseYold = moseYnew;
            }
        });

        primaryStage.show();
    }
}
