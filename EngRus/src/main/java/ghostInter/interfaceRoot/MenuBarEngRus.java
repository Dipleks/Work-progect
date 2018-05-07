package ghostInter.interfaceRoot;

import ghostInter.controlPS.AddButAndLabel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuBarEngRus implements IMenuBar, Root
{
    private final MenuBar menuBar = new MenuBar();

    private final Menu menuExercise = new Menu("Задания");
    private final Menu menuExams = new Menu("Контрольные");
    private final MenuItem menuPS = new MenuItem("Present Simple");
    private final MenuItem examPS = new MenuItem("Контрольная PS");
    private final MenuItem menuToBe = new MenuItem("Форма \"to be\"");
    private final MenuItem examToBe = new MenuItem("Контрольная \"to be\"");

    private final Menu menuHelp = new Menu("Подсказки");

    private final Menu menuServes = new Menu("Сервис");
    private final Menu menuSetting = new Menu("Режим");
    private final MenuItem menuWHITE = new MenuItem("День");
    private final MenuItem menuBLACK = new MenuItem("Ночь");
    private final MenuItem about = new MenuItem("О программе");

    public void getMenu() {
        ROOT.getChildren().addAll(getMenuBar());
    }

    private MenuBar getMenuBar(){

        menuPS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                leftColumm.getChildren().clear();
                rightColumm.getChildren().clear();
                groupRadBut.getChildren().clear();
                groupExam.getChildren().clear();
                ROOT.getChildren().clear();
                MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                menuBarEngRus.getMenu();
                AddButAndLabel addButAndLabel = new AddButAndLabel();
                addButAndLabel.AddMenuButton();

            }
        });
        examPS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                leftColumm.getChildren().clear();
                rightColumm.getChildren().clear();
                groupRadBut.getChildren().clear();
                groupExam.getChildren().clear();
                iprColumm.getChildren().clear();
                numberColumm.getChildren().clear();
                ROOT.getChildren().clear();
                MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                menuBarEngRus.getMenu();
                AddButAndLabel addButAndLabel = new AddButAndLabel();
                addButAndLabel.AddMenuButton1();

            }
        });
        about.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage window = new Stage();
                StackPane stackPane = new StackPane();
                Scene scene = new Scene(stackPane, widthSize/3, heightSize/3);
                Label label = new Label();
//                label.setStyle("-fx-border-color: RED");
                label.setPrefSize(widthSize/4, heightSize/4);
                label.setText("Автор программы Ghost \n" + "\n" + "Программа предназначена " +
                        "\nдля изучения Английского языка." +
                        "\n\n                                    Версия программы: 1.5");
                label.setFont(Font.font("Time New Roman", FontWeight.BOLD,
                        FontPosture.ITALIC, heightSize*0.015));
                label.setAlignment(Pos.CENTER);

                stackPane.getChildren().addAll(label);

                window.setScene(scene);
                window.setTitle("О программе");
                window.initModality(Modality.APPLICATION_MODAL);
                window.show();
            }
        });

        menuBar.setMinWidth(widthSize);
        menuSetting.getItems().addAll(menuWHITE, menuBLACK);
        menuServes.getItems().addAll(menuSetting, about);
        menuExercise.getItems().addAll(menuPS, menuToBe);
        menuExams.getItems().addAll(examPS, examToBe);
        menuBar.getMenus().addAll(menuExercise, menuExams, menuHelp, menuServes);
        return menuBar;
    }
}
