package lessons.Lessons_1.l7_Серализация;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InvalidObjectException;

public class TableClass extends Application{
    private Group root = new Group();
    private Scene scene = new Scene(root,700, 600, Color.DARKSEAGREEN);
    private TableView<ClassDB> tableClassDB = new TableView<>();
    private TableColumn<ClassDB, Integer> tableColumnA = new TableColumn<>("Значения A");
    private TableColumn<ClassDB, Integer> tableColumnB = new TableColumn<>("Значения B");
    private TableColumn<ClassDB, Integer> tableColumnC = new TableColumn<>("Значения C");
    private TextField textA = new TextField();
    private TextField textB = new TextField();
    private Button butAplusBrezC = new Button("A+B=C");
    private Button saveList = new Button("Save");

    @Override
    public void start(Stage primaryStage) throws Exception {

        ObservableList<ClassDB> listClassDB = FXCollections.observableArrayList();

        String[] addStringFile = new String[6];
        addStringFile[0] = "C:\\saveTC01.data";
        addStringFile[1] = "C:\\saveTC02.data";
        addStringFile[2] = "C:\\saveTC03.data";
        addStringFile[3] = "C:\\saveTC04.data";
        addStringFile[4] = "C:\\saveTC05.data";
        addStringFile[5] = "C:\\saveTC06.data";

        ClassSeriolaizebl classSeriolaizebl = new ClassSeriolaizebl();

        for (int i = 0; i <= 5; i++) {
            ClassDB classDB = null;
            try {
                classDB = classSeriolaizebl.deserialization(addStringFile[i]);
                listClassDB.add(i, classDB);
            } catch (InvalidObjectException e) {
                e.printStackTrace();
            }
        }

        tableColumnA.setCellValueFactory(new PropertyValueFactory<ClassDB, Integer>("a"));
        tableColumnB.setCellValueFactory(new PropertyValueFactory<ClassDB, Integer>("b"));
        tableColumnC.setCellValueFactory(new PropertyValueFactory<ClassDB, Integer>("c"));

        textA.setPromptText("значения A");
        textB.setPromptText("значения B");
        textA.setLayoutX(20);
        textA.setLayoutY(550);
        textA.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                char c = ke.getCharacter().charAt(0);
                if ( ((c < '0') || (c > '9')) && (c != java.awt.event.KeyEvent.VK_PERIOD)) {
                    ke.consume(); }
            }
        });
        textB.setLayoutX(200);
        textB.setLayoutY(550);
        textB.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                char c = ke.getCharacter().charAt(0);
                if ( ((c < '0') || (c > '9')) && (c != java.awt.event.KeyEvent.VK_PERIOD)) {
                    ke.consume(); }
            }
        });

        butAplusBrezC.setLayoutX(380);
        butAplusBrezC.setLayoutY(550);
        saveList.setLayoutX(450);
        saveList.setLayoutY(550);
        saveList.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i <= 5; i++) {
                    ClassDB classDB = new ClassDB(listClassDB.get(i).getA(), listClassDB.get(i).getB(),
                            listClassDB.get(i).getC());
                    try {
                        classSeriolaizebl.serializable(classDB, addStringFile[i]);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        butAplusBrezC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                listClassDB.add(new ClassDB(Integer.parseInt(textA.getText()),
                        Integer.parseInt(textB.getText()), Integer.parseInt(textA.getText())+Integer.parseInt(textB.getText())));

                System.out.println(listClassDB.get(0).getA());
                System.out.println(textA.getText().indexOf(0));
            }
        });

        tableColumnA.setPrefWidth(220);
        tableColumnB.setPrefWidth(220);
        tableColumnC.setPrefWidth(220);

        tableClassDB.setItems(listClassDB);
        tableClassDB.setEditable(true);
        tableClassDB.getColumns().addAll(tableColumnA, tableColumnB, tableColumnC);
        tableClassDB.setPrefSize(660, 500);
        tableClassDB.setLayoutX(20);
        tableClassDB.setLayoutY(20);

        root.getChildren().addAll(tableClassDB, textA, textB, butAplusBrezC, saveList);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Test Serializable");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
