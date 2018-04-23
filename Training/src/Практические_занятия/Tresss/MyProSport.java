package Практические_занятия.Tresss;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import Практические_занятия.Table.Produkt;

import javax.security.auth.callback.Callback;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;

public class MyProSport extends Application implements ButtonU, DateUpr{

    private String[] seveButton = new String[21];

    @Override
    public void start(Stage primaryStage) throws Exception {

        seveButton[0] = "C:\\saveMyButton1.data";
        seveButton[1] = "C:\\saveMyButton2.data";
        seveButton[2] = "C:\\saveMyButton3.data";
        seveButton[3] = "C:\\saveMyButton4.data";
        seveButton[4] = "C:\\saveMyButton5.data";
        seveButton[5] = "C:\\saveMyButton6.data";
        seveButton[6] = "C:\\saveMyButton7.data";
        seveButton[7] = "C:\\saveMyButton8.data";
        seveButton[8] = "C:\\saveMyButton9.data";
        seveButton[9] = "C:\\saveMyButton10.data";
        seveButton[10] = "C:\\saveMyButton11.data";
        seveButton[11] = "C:\\saveMyButton12.data";
        seveButton[12] = "C:\\saveMyButton13.data";
        seveButton[13] = "C:\\saveMyButton14.data";
        seveButton[14] = "C:\\saveMyButton15.data";
        seveButton[15] = "C:\\saveMyButton16.data";
        seveButton[16] = "C:\\saveMyButton17.data";
        seveButton[17] = "C:\\saveMyButton18.data";
        seveButton[18] = "C:\\saveMyButton19.data";
        seveButton[19] = "C:\\saveMyButton20.data";
        seveButton[20] = "C:\\saveMyButton21.data";

        ObservableList<TableBasik> basiks = FXCollections.observableArrayList();
        SerializableMyPro serializableMyPro = new SerializableMyPro();

//        for (int i = 0; i <= 5; i++) {
//            TableBasik tableBasik = null;
//            try {
//                tableBasik = serializableMyPro.deserialization(seveButton[i]);
//                basiks.add(i, tableBasik);
//            } catch (InvalidObjectException e) {
//                e.printStackTrace();
//            }
//        }

        table.setItems(basiks);
        table.setLayoutX(220);
        table.setLayoutY(45);
        ColorAdjust cA = new ColorAdjust();
        cA.setHue(0.2); //цвет оконтовки 0.7, 0.1
        cA.setSaturation(0.3); //цвет кнопки 0.1
        table.setEffect(cA);
        table.setFixedCellSize(30.5); //высота ячеек
//        table.setPrefHeight(240); //высота таблицы
        table.setPrefSize(720, 240); //размеры таблицы
        table.getColumns().addAll(getVes1Column(), getPodhod1Column(), getPovtor1Column(), getProcent1Column(),
                getVes2Column(), getPodhod2Column(), getPovtor2Column(), getProcent2Column(),
                getVes3Column(), getPodhod3Column(), getPovtor3Column(), getProcent3Column(),
                getPmColumn(), getTonnazhColumn(), getKpdColumn());


        ves1Input.setLayoutX(180);
        ves1Input.setLayoutY(10);
        ves1Input.setPromptText("Вес");
        ves1Input.setMaxWidth(30);
        podhod1Input.setLayoutX(220);
        podhod1Input.setLayoutY(10);
        podhod1Input.setPromptText("Подход");
        podhod1Input.setMaxWidth(30);
        povtor1Input.setLayoutX(260);
        povtor1Input.setLayoutY(10);
        povtor1Input.setPromptText("Повтор");
        povtor1Input.setMaxWidth(30);
        procent1Input.setLayoutX(300);
        procent1Input.setLayoutY(10);
        procent1Input.setPromptText("%");
        procent1Input.setMaxWidth(30);

        ves2Input.setLayoutX(380);
        ves2Input.setLayoutY(10);
        ves2Input.setPromptText("Вес2");
        ves2Input.setMaxWidth(30);
        podhod2Input.setLayoutX(420);
        podhod2Input.setLayoutY(10);
        podhod2Input.setPromptText("Подход2");
        podhod2Input.setMaxWidth(30);
        povtor2Input.setLayoutX(460);
        povtor2Input.setLayoutY(10);
        povtor2Input.setPromptText("Повтор2");
        povtor2Input.setMaxWidth(30);
        procent2Input.setLayoutX(500);
        procent2Input.setLayoutY(10);
        procent2Input.setPromptText("%2");
        procent2Input.setMaxWidth(30);

        ves3Input.setLayoutX(580);
        ves3Input.setLayoutY(10);
        ves3Input.setPromptText("Вес3");
        ves3Input.setMaxWidth(30);
        podhod3Input.setLayoutX(620);
        podhod3Input.setLayoutY(10);
        podhod3Input.setPromptText("Подход3");
        podhod3Input.setMaxWidth(30);
        povtor3Input.setLayoutX(660);
        povtor3Input.setLayoutY(10);
        povtor3Input.setPromptText("Повтор3");
        povtor3Input.setMaxWidth(30);
        procent3Input.setLayoutX(700);
        procent3Input.setLayoutY(10);
        procent3Input.setPromptText("%3");
        procent3Input.setMaxWidth(30);

        pmInput.setLayoutX(740);
        pmInput.setLayoutY(10);
        pmInput.setPromptText("ПМ");
        pmInput.setMaxWidth(30);

//        VBox vBox = new VBox();
//        vBox.setLayoutX(220);
//        vBox.setLayoutY(45);
////        vBox.setMaxHeight(240);
//        vBox.setMaxWidth(952);
//        vBox.getChildren().addAll(table);

        //Эффект отражения:
        Text text = new Text();
        text.setLayoutX(1000);
        text.setLayoutY(40);
        text.setText("Hello, Denis");
        text.setFill(Color.GOLD);
        text.setFont(Font.font(null, FontWeight.BOLD, 40));
        //создадим эффект:
        Reflection reflection = new Reflection();
        reflection.setBottomOpacity(0.0);
        reflection.setTopOpacity(0.5);
        reflection.setFraction(0.7);
        text.setEffect(reflection);

        Button delete = new Button("Delete");
        delete.setLayoutX(900);
        delete.setLayoutY(10);
        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList<TableBasik> tb, alltb;
                alltb = table.getItems();
                tb = table.getSelectionModel().getSelectedItems();
                tb.forEach(alltb::remove);
            }
        });

        Button open = new Button("Открыть");
        open.setLayoutX(1240);
        open.setLayoutY(10);
        Button save = new Button("Сохранить");
        save.setLayoutX(1230);
        save.setLayoutY(770);
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i <= 5; i++) {

//                    TableBasik tableBasik = new TableBasik(Double.parseDouble(ves1Input.getText()),
//                        Integer.parseInt(podhod1Input.getText()), Integer.parseInt(povtor1Input.getText()),
//  Double.parseDouble(procent1Input.getText(), Double.parseDouble(ves2Input.getText()),
//  Integer.parseInt(podhod2Input.getText()), Integer.parseInt(povtor2Input.getText()),
//  Double.parseDouble(procent2Input.getText(), Double.parseDouble(ves3Input.getText()),
//  Integer.parseInt(podhod3Input.getText()), Integer.parseInt(povtor3Input.getText()),
//   Double.parseDouble(procent3Input.getText(), (Integer.parseInt(podhod1Input.getText())*Integer.parseInt(povtor1Input.getText())*Double.parseDouble(ves1Input.getText()))+
//   (Integer.parseInt(podhod2Input.getText())*Integer.parseInt(povtor2Input.getText())*Double.parseDouble(ves2Input.getText()))+
//    (Integer.parseInt(podhod3Input.getText())*Integer.parseInt(povtor3Input.getText())*Double.parseDouble(ves3Input.getText())),
//           ((Integer.parseInt(podhod1Input.getText())*Integer.parseInt(povtor1Input.getText()))+(Integer.parseInt(podhod2Input.getText())*Integer.parseInt(povtor2Input.getText()))+(Integer.parseInt(podhod3Input.getText())*Integer.parseInt(povtor3Input.getText()))),
//           Double.parseDouble(pmInput.getText()));
//                    try {
//                        serializableMyPro.serializable(tableBasik, seveButton[i]);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        });

        root.setEffect(getDropShadow());
        root.getChildren().addAll(text, table, ves1Input, podhod1Input, povtor1Input, procent1Input,
                ves2Input, podhod2Input, povtor2Input, procent2Input, delete,
                ves3Input, podhod3Input, povtor3Input, procent3Input, pmInput,
                getT1(), getB1(), getL1(), getB8(), getL8(), getB15(), getL15(), getD1(), getLd1(),
                getD2(), getLd2(),getD3(), getLd3(), rt1, rt2, open, save);

        Scene scene = new Scene(root,1300,800, Color.DARKSEAGREEN);
        primaryStage.setScene(scene);
//        primaryStage.setMaximized(true); //на весь экран
        primaryStage.setResizable(false); //запрет на маштабирование окна
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

