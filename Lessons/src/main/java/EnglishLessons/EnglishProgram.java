package EnglishLessons;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

public class EnglishProgram extends Application implements ProposalRu, ProposalEn{

    private Group root = new Group();
    private Button b1 = new Button("Перевод");
    private Button b2 = new Button("Перевод");
    private Button b3 = new Button("Перевод");
    private Button b4 = new Button("Перевод");
    private Button b5 = new Button("Перевод");
    private Button b6 = new Button("Перевод");
    private Button b7 = new Button("Перевод");
    private Button b8 = new Button("Перевод");
    private TableView<TableEn> tableEn = new TableView<>();
    private TableView<TableRu> tableRu = new TableView<>();
    private TableColumn<TableEn, String> numberTC = new TableColumn<>("№");
    private TableColumn<TableEn, String> enStrTC = new TableColumn<>("English");
    private TableColumn<TableEn, Button> transleitTC = new TableColumn<>("Перевод");
    private TableColumn<TableRu, String> numberTCRu = new TableColumn<>("№");
    private TableColumn<TableRu, String> enStrTCRu = new TableColumn<>("English");
    private TableColumn<TableRu, Button> transleitTCRu = new TableColumn<>("Перевод");
    private ObservableList<TableEn> list = FXCollections.observableArrayList();
    private ObservableList<TableRu> list1 = FXCollections.observableArrayList();
    private ToggleGroup toggleGroup = new ToggleGroup();
    private RadioButton radioButton1 = new RadioButton("En");
    private RadioButton radioButton2 = new RadioButton("Ru");
    private Pagination pagination = new Pagination(28, 0);

    @Override
    public void start(Stage primaryStage) throws Exception{

        numberTC.setCellValueFactory(new PropertyValueFactory<TableEn, String>("number"));
        enStrTC.setCellValueFactory(new PropertyValueFactory<TableEn, String>("enStr"));
        transleitTC.setCellValueFactory(new PropertyValueFactory<TableEn, Button>("transleit"));
        numberTCRu.setCellValueFactory(new PropertyValueFactory<TableRu, String>("number"));
        enStrTCRu.setCellValueFactory(new PropertyValueFactory<TableRu, String>("enStr"));
        transleitTCRu.setCellValueFactory(new PropertyValueFactory<TableRu, Button>("transleit"));

        pagination.setLayoutX(80);
        pagination.setLayoutY(20);
        pagination.setPrefSize(300, 50);
        pagination.setStyle("-fx-border-color:red;");
//        pagination.setPageFactory((Integer pI) -> cP(pI));
//        pagination.setPageFactory((Integer a) -> cL(a));

        pagination.setPageFactory(new Callback<Integer, Node>() {
            @Override
            public Node call(Integer param) {
                VBox vBox = new VBox();

                Label label = new Label("Does he need you?");
                Label label1 = new Label("Does he need you?");
                Label label2 = new Label("Does he need you?");
                vBox.getChildren().addAll(label,label1,label2);

                return vBox;

            }
        });

        root.getChildren().addAll(getRadioButton1(), getRadioButton2(), pagination);

        Scene scene = new Scene(root, 900, 800, Color.DARKSEAGREEN);
        primaryStage.setTitle("English");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
//    public VBox cP (int pI){
//        VBox vBox = new VBox();
//
//        Label label = new Label("Does he need you?");
//        Label label1 = new Label("Does he need you?");
//        Label label2 = new Label("Does he need you?");
//        vBox.getChildren().addAll(label,label1,label2);
//
//        return vBox;
//    }
//    public Label cL (int a) {
//        Label label = new Label("Does he need you?");
//
//        return label;
//    }

    ////////////////////////////

    private ObservableList<TableEn> getList() {
        list.add(new TableEn("1", en1, getB1()));
        list.add(new TableEn("2", en2, getB2()));
        list.add(new TableEn("3", en3, getB3()));
        list.add(new TableEn("4", en4, getB4()));
        return list;
    }
    private ObservableList<TableRu> getList1() {
        list1.add(new TableRu("1", ru1, getB5()));
        list1.add(new TableRu("2", ru2, getB6()));
        list1.add(new TableRu("3", ru3, getB7()));
        list1.add(new TableRu("4", ru4, getB8()));
        return list1;
    }

    public static void main(String[] args) {
        launch(args);
    }

    //////////////////////////////

    private Button getB1() {
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.remove(0);
                list.add(0, new TableEn("1", ru1, b1));
            }
        });
        return b1;
    }
    private Button getB2() {
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.remove(1);
                list.add(1, new TableEn("2", ru2, b2));
            }
        });
        return b2;
    }
    private Button getB3() {
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.remove(2);
                list.add(2, new TableEn("3", ru3, b3));
            }
        });
        return b3;
    }
    private Button getB4() {
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list.remove(3);
                list.add(3, new TableEn("4", ru4, b4));
            }
        });
        return b4;
    }

    private Button getB5() {
        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list1.remove(0);
                list1.add(0, new TableRu("1", en1, b5));
            }
        });
        return b5;
    }
    private Button getB6() {
        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list1.remove(1);
                list1.add(1, new TableRu("2", en2, b6));
            }
        });
        return b6;
    }
    private Button getB7() {
        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list1.remove(2);
                list1.add(2, new TableRu("3", en3, b7));
            }
        });
        return b7;
    }
    private Button getB8() {
        b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list1.remove(3);
                list1.add(3, new TableRu("4", en4, b8));
            }
        });
        return b8;
    }

    ///////////////////////////////////

    private TableView<TableEn> getTableEn() {
        tableEn.setItems(getList());
        tableEn.getColumns().addAll(numberTC, enStrTC, transleitTC);
        tableEn.setLayoutX(50);
        tableEn.setLayoutY(80);
        tableEn.setPrefSize(370, 600);
        return tableEn;
    }
    private TableView<TableRu> getTableRu() {
        tableRu.setItems(getList1());
        tableRu.getColumns().addAll(numberTCRu, enStrTCRu, transleitTCRu);
        tableRu.setLayoutX(50);
        tableRu.setLayoutY(100);
        tableRu.setPrefSize(370, 600);
        return tableRu;
    }

    private RadioButton getRadioButton1() {
        radioButton1.setToggleGroup(toggleGroup);
        radioButton1.setLayoutX(20);
        radioButton1.setLayoutY(20);
        radioButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().addAll(getTableEn());
                root.getChildren().remove(getTableRu());
            }
        });
        return radioButton1;
    }
    private RadioButton getRadioButton2() {
        radioButton2.setToggleGroup(toggleGroup);
        radioButton2.setLayoutX(20);
        radioButton2.setLayoutY(40);
        radioButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().addAll(getTableRu());
                root.getChildren().remove(getTableEn());
            }
        });
        return radioButton2;
    }
}
