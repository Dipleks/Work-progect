package lessons.Lessons_1.l6_Таблицы;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.InvalidObjectException;

public class TableTest extends Application  {
    private Group root = new Group();
    private Scene scene = new Scene(root, 810, 800, Color.DARKSEAGREEN);
    private TableView<Person> table = new TableView<Person>();
    private TableColumn<Person, String> namePerson = new TableColumn<>("Имя");
    private TableColumn<Person, String> familyPerson = new TableColumn<>("Фамилия");
    private TableColumn<Person, String> otchPerson = new TableColumn<>("Отчество");
    private TableColumn<Person, String> numberPhonePerson = new TableColumn<>("Внутренний номер");
    private TextField t1 = new TextField();
    private TextField t2 = new TextField();
    private TextField t3 = new TextField();
    private TextField t4 = new TextField();
    private Button seveB = new Button("Сохранить");
    private Button add = new Button("Добавить");
    private Button delete = new Button("Удалить");
    private Button open = new Button("Новый список");
    private Button open2 = new Button("Старый список");

    @Override
    public void start(Stage primaryStage) throws Exception {

        namePerson.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        namePerson.setPrefWidth(155);
        namePerson.setEditable(true);
        namePerson.setSortable(false); //запрещаем сортировку колонки
        namePerson.setCellFactory(TextFieldTableCell.forTableColumn()); //определяем тип ячеек
        //создаем событие для ячейки, позволяющее редактирование:
        namePerson.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Person, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Person, String> event) {
                ((Person) event.getTableView().getItems().get(
                        event.getTablePosition().getRow())
                ).setName(event.getNewValue());
            }
        });
//        namePerson.setEditable(true); //разрешает редактирование ячеек столбца
        familyPerson.setCellValueFactory(new PropertyValueFactory<Person, String>("family"));
        familyPerson.setEditable(true);
        familyPerson.setCellFactory(TextFieldTableCell.forTableColumn());
        familyPerson.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Person, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Person, String> event) {
                ((Person) event.getTableView().getItems().get(
                        event.getTablePosition().getRow())
                ).setFamily(event.getNewValue());
            }
        });
        familyPerson.setSortable(false);
        familyPerson.setPrefWidth(225);
        familyPerson.setResizable(false);
        otchPerson.setCellValueFactory(new PropertyValueFactory<Person, String>("otch"));
        otchPerson.setPrefWidth(225);
        otchPerson.setSortable(false);
        otchPerson.setEditable(true);
        otchPerson.setCellFactory(TextFieldTableCell.forTableColumn());
        otchPerson.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Person, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Person, String> event) {
                ((Person) event.getTableView().getItems().get(
                        event.getTablePosition().getRow())
                ).setOtch(event.getNewValue());
            }
        });
        numberPhonePerson.setCellValueFactory(new PropertyValueFactory<Person, String>("numberPhone"));
        numberPhonePerson.setPrefWidth(120);
        numberPhonePerson.setSortable(false);
        numberPhonePerson.setEditable(true);
        numberPhonePerson.setCellFactory(TextFieldTableCell.forTableColumn());
        numberPhonePerson.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Person, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Person, String> event) {
                ((Person) event.getTableView().getItems().get(
                        event.getTablePosition().getRow())
                ).setNumberPhone(event.getNewValue());
            }
        });

        //Меняем цвет ячеек
        table.setRowFactory(new Callback<TableView<Person>, TableRow<Person>>() {
            @Override
            public TableRow<Person> call(TableView<Person> param) {
                return new TableRow<Person>() {
                    @Override
                    protected void updateItem(Person item, boolean empty) {
//                        String style = "-fx-background-color: linear-gradient(#007F0E 0%, #FFFFFF 90%, #eaeaea 90%);";
                        String style = "-fx-background-color: GOLD; -fx-font-size: 12pt; -fx-text-fill: red;";

                        setStyle(style);
//                        setTextFill(Color.RED);
//                        setFont(Font.font(20));
//                        setFont(Color.RED);
                        super.updateItem(item, empty);
                    }
                };
            }
        });

        ObservableList<Person> persons = FXCollections.observableArrayList();
        ObservableList<Person> persons2 = FXCollections.observableArrayList(
                new Person("N0", "F1", "Otch1", "8-999-288-12-21"),
                new Person("N1", "F2", "Otch2", "8-999-288-12-22"),
                new Person("N2", "F3", "Otch3", "8-999-288-12-23"),
                new Person("N3", "F4", "Otch4", "8-999-288-12-24"),
                new Person("N4", "F4", "Otch4", "8-999-288-12-24"),
                new Person("N5", "F4", "Otch4", "8-999-288-12-24"),
                new Person("N6", "F4", "Otch4", "8-999-288-12-24"),
                new Person("N7", "F4", "Otch4", "8-999-288-12-24"),
                new Person("N8", "F4", "Otch4", "8-999-288-12-24"),
                new Person("N9", "F4", "Otch4", "8-999-288-12-24"),
                new Person("N10", "F4", "Otch4", "8-999-288-12-24"),
                new Person("N11", "F4", "Otch4", "8-999-288-12-24")
        );

        table.setLayoutX(40);
        table.setLayoutY(90);
        table.setEditable(true); //разрешает редактирование ячеек таблицы
        table.setPrefSize(740, 700);
        table.setItems(persons);
        table.setTableMenuButtonVisible(true); //кнопка позволяющая добавить или бурать колонки
        table.setCursor(Cursor.TEXT); //вид курсора при его попадании в область таблицы
        table.setTooltip(new Tooltip("TestTooltip")); //при наведении на поле столбца отображает текст
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        table.getColumns().addAll(familyPerson, namePerson, otchPerson, numberPhonePerson);

        String[] strAdd = new String[43];
        strAdd[0] = "C:\\serfr00.data";
        strAdd[1] = "C:\\serfr01.data";
        strAdd[2] = "C:\\serfr02.data";
        strAdd[3] = "C:\\serfr03.data";
        strAdd[4] = "C:\\serfr04.data";
        strAdd[5] = "C:\\serfr05.data";
        strAdd[6] = "C:\\serfr06.data";
        strAdd[7] = "C:\\serfr07.data";
        strAdd[8] = "C:\\serfr08.data";
        strAdd[9] = "C:\\serfr09.data";
        strAdd[10] = "C:\\serfr10.data";
        strAdd[11] = "C:\\serfr11.data";
        strAdd[12] = "C:\\serfr013.data";
        strAdd[13] = "C:\\serfr0.data";
        strAdd[14] = "C:\\serfr1.data";
        strAdd[15] = "C:\\serfr2.data";
        strAdd[16] = "C:\\serfr3.data";
        strAdd[17] = "C:\\serfr4.data";
        strAdd[18] = "C:\\serfr5.data";
        strAdd[19] = "C:\\serfr6.data";
        strAdd[20] = "C:\\serfr7.data";
        strAdd[21] = "C:\\serfr8.data";
        strAdd[22] = "C:\\serfr9.data";
        strAdd[23] = "C:\\serfr23.data";
        strAdd[24] = "C:\\serfr24.data";
        strAdd[25] = "C:\\serfr25.data";
        strAdd[26] = "C:\\serfr26.data";
        strAdd[27] = "C:\\serfr27.data";
        strAdd[28] = "C:\\serfr28.data";
        strAdd[29] = "C:\\serfr29.data";
        strAdd[30] = "C:\\serfr30.data";
        strAdd[31] = "C:\\serfr31.data";
        strAdd[32] = "C:\\serfr32.data";
        strAdd[33] = "C:\\serfr33.data";
        strAdd[34] = "C:\\serfr34.data";
        strAdd[35] = "C:\\serfr35.data";
        strAdd[36] = "C:\\serfr36.data";
        strAdd[37] = "C:\\serfr37.data";
        strAdd[38] = "C:\\serfr38.data";
        strAdd[39] = "C:\\serfr39.data";
        strAdd[40] = "C:\\serfr40.data";
        strAdd[41] = "C:\\serfr41.data";
        strAdd[42] = "C:\\serfr42.data";

        Serialis serialis = new Serialis();

        //записываем и читаем в/из память:
        seveB.setLayoutX(20);
        seveB.setLayoutY(15);
        seveB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

               for (int i = 0; i <= 42; i++) {
                   Person person = new Person(persons.get(i).name, persons.get(i).family,
                                persons.get(i).otch, persons.get(i).numberPhone);
                   serialis.seri(person, strAdd[i]);
                   System.out.println("строка " + i + " - " + persons.get(i).name);
               }
            }
        });
        //читаем имеющийся список:
        open.setLayoutX(110);
        open.setLayoutY(15);
        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                table.setItems(persons);
            }
        });
        open2.setLayoutX(700);
        open2.setLayoutY(15);
        open2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                table.setItems(persons2);
            }
        });

            for (int i = 0; i <= 42; i++) {
                Person rez = null;
                try {
                    rez = serialis.deseri(strAdd[i]);
                    persons.add(i, rez);
                } catch (InvalidObjectException e) {
                    e.printStackTrace();
                }
            }

        t1.setLayoutX(180);
        t1.setLayoutY(50);
        t1.setPromptText("Имя");
        t2.setLayoutX(20);
        t2.setLayoutY(50);
        t2.setPromptText("Фамилия");
        t3.setLayoutX(340);
        t3.setLayoutY(50);
        t3.setPromptText("Отчество");
        t4.setLayoutX(500);
        t4.setLayoutY(50);
        t4.setPromptText("Номер");
        add.setLayoutX(660);
        add.setLayoutY(50);
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //добавляем пустые ячейки:
                if(t1.getText().equals("+")) {
                    for (int i = 0; i < 300; i++) {
                        persons.add(new Person("   ","   ","   ","   "));
                    } System.out.println("Создание дополнительный 300 ячеек");
                } else {
                    System.out.println("Ячейки не созданны, кол-во достаточное!");
                }

                    if (persons.get(0).name.equals("   ") & t1.getText() != null /*|| persons.get(20).name.equals("----------")*/) {
                        persons.remove(0);
                        persons.add(0, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));

                    } else if (persons.get(1).name.equals("   ") & t1.getText() != null){
                        persons.remove(1);
                        persons.add(1, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 1");
                    } else if (persons.get(2).name.equals("   ") & t1.getText() != null){
                        persons.remove(2);
                        persons.add(2, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 2");
                    } else if (persons.get(3).name.equals("   ") & t1.getText() != null){
                        persons.remove(3);
                        persons.add(3, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 3");
                    } else if (persons.get(4).name.equals("   ") & t1.getText() != null){
                        persons.remove(4);
                        persons.add(4, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 4");
                    } else if (persons.get(5).name.equals("   ") & t1.getText() != null){
                        persons.remove(5);
                        persons.add(5, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 5");
                    } else if (persons.get(6).name.equals("   ") & t1.getText() != null){
                        persons.remove(6);
                        persons.add(6, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 6");
                    } else if (persons.get(7).name.equals("   ") & t1.getText() != null){
                        persons.remove(7);
                        persons.add(7, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 7");
                    } else if (persons.get(8).name.equals("   ") & t1.getText() != null){
                        persons.remove(8);
                        persons.add(8, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 8");
                    } else if (persons.get(9).name.equals("   ") & t1.getText() != null){
                        persons.remove(9);
                        persons.add(9, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 9");
                    } else if (persons.get(10).name.equals("   ") & t1.getText() != null){
                        persons.remove(10);
                        persons.add(10, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 10");
                    } else if (persons.get(11).name.equals("   ") & t1.getText() != null){
                        persons.remove(11);
                        persons.add(11, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 11");
                    } else if (persons.get(12).name.equals("   ") & t1.getText() != null){
                        persons.remove(12);
                        persons.add(12, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 12");
                    } else if (persons.get(13).name.equals("   ") & t1.getText() != null){
                        persons.remove(13);
                        persons.add(13, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 13");
                    } else if (persons.get(14).name.equals("   ") & t1.getText() != null){
                        persons.remove(14);
                        persons.add(14, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 14");
                    } else if (persons.get(15).name.equals("   ") & t1.getText() != null){
                        persons.remove(15);
                        persons.add(15, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 15");
                    } else if (persons.get(16).name.equals("   ") & t1.getText() != null){
                        persons.remove(16);
                        persons.add(16, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 16");
                    } else if (persons.get(17).name.equals("   ") & t1.getText() != null){
                        persons.remove(17);
                        persons.add(17, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 17");
                    } else if (persons.get(18).name.equals("   ") & t1.getText() != null){
                        persons.remove(18);
                        persons.add(18, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 18");
                    } else if (persons.get(19).name.equals("   ") & t1.getText() != null){
                        persons.remove(19);
                        persons.add(19, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 19");
                    } else if (persons.get(20).name.equals("   ") & t1.getText() != null){
                        persons.remove(20);
                        persons.add(20, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 20");
                    } else if (persons.get(21).name.equals("   ") & t1.getText() != null){
                        persons.remove(21);
                        persons.add(21, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 21");
                    } else if (persons.get(22).name.equals("   ") & t1.getText() != null){
                        persons.remove(22);
                        persons.add(22, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 22");
                    } else if (persons.get(23).name.equals("   ") & t1.getText() != null){
                        persons.remove(23);
                        persons.add(23, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 23");
                    } else if (persons.get(24).name.equals("   ") & t1.getText() != null){
                        persons.remove(24);
                        persons.add(24, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 24");
                    } else if (persons.get(25).name.equals("   ") & t1.getText() != null){
                        persons.remove(25);
                        persons.add(25, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 25");
                    } else if (persons.get(26).name.equals("   ") & t1.getText() != null){
                        persons.remove(26);
                        persons.add(26, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 26");
                    } else if (persons.get(27).name.equals("   ") & t1.getText() != null){
                        persons.remove(27);
                        persons.add(27, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 27");
                    } else if (persons.get(28).name.equals("   ") & t1.getText() != null){
                        persons.remove(28);
                        persons.add(28, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 28");
                    } else if (persons.get(29).name.equals("   ") & t1.getText() != null){
                        persons.remove(29);
                        persons.add(29, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 29");
                    } else if (persons.get(30).name.equals("   ") & t1.getText() != null){
                        persons.remove(30);
                        persons.add(30, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 30");
                    } else if (persons.get(31).name.equals("   ") & t1.getText() != null){
                        persons.remove(31);
                        persons.add(31, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 31");
                    } else if (persons.get(32).name.equals("   ") & t1.getText() != null){
                        persons.remove(32);
                        persons.add(32, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 32");
                    } else if (persons.get(33).name.equals("   ") & t1.getText() != null){
                        persons.remove(33);
                        persons.add(33, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 33");
                    } else if (persons.get(34).name.equals("   ") & t1.getText() != null){
                        persons.remove(34);
                        persons.add(34, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 34");
                    } else if (persons.get(35).name.equals("   ") & t1.getText() != null){
                        persons.remove(35);
                        persons.add(35, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 35");
                    } else if (persons.get(36).name.equals("   ") & t1.getText() != null){
                        persons.remove(36);
                        persons.add(36, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 36");
                    } else if (persons.get(37).name.equals("   ") & t1.getText() != null){
                        persons.remove(37);
                        persons.add(37, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 37");
                    } else if (persons.get(38).name.equals("   ") & t1.getText() != null){
                        persons.remove(38);
                        persons.add(38, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 38");
                    } else if (persons.get(39).name.equals("   ") & t1.getText() != null){
                        persons.remove(39);
                        persons.add(39, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 39");
                    } else if (persons.get(40).name.equals("   ") & t1.getText() != null){
                        persons.remove(40);
                        persons.add(40, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 40");
                    } else if (persons.get(41).name.equals("   ") & t1.getText() != null){
                        persons.remove(41);
                        persons.add(41, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 41");
                    } else if (persons.get(42).name.equals("   ") & t1.getText() != null){
                        persons.remove(42);
                        persons.add(42, new Person(t1.getText(), t2.getText(), t3.getText(), t4.getText()));
                        System.out.println("exit 42");
                    } else {
                        System.out.println("Exit");
                    }
                    t1.clear();
                    t2.clear();
                    t3.clear();
                    t4.clear();

            }
        });

        delete.setLayoutX(740);
        delete.setLayoutY(50);
        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList<Person> deletePerson, prSel;
                prSel = table.getItems();
                deletePerson = table.getSelectionModel().getSelectedItems();
                deletePerson.forEach(prSel::remove);
                persons.add(42, new Person("   ", "   ", "   ", "   "));
            }
        });

        root.getChildren().addAll(table, t1, t2, t3, t4, delete, add, seveB, open, open2);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test Table");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
