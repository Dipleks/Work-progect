package Практические_занятия.Table;

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
import javafx.scene.effect.ColorInput;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;
import ua.com.prologistic.jaxb.model.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Tb extends Application {

    TableView<Produkt> tableView;
    TextField nameInput, prizInput, dropInput;
    String fileName = "D:/produkt.xml";
    String fileName1 = "D:/produkt1.xml";
    Produkt unmarshStudent = fromXmlToObject(fileName);
    Produkt unmarshStudent1 = fromXmlToObject(fileName1);

    @Override
    public void start(Stage primaryStage) throws Exception {

        if (unmarshStudent != null && unmarshStudent1 != null)
        {
            System.out.println(unmarshStudent.toString());
            unmarshStudent.getName();
            unmarshStudent.getPriz();
            unmarshStudent.getDrop();

            System.out.println(unmarshStudent1.toString());
            unmarshStudent1.getName();
            unmarshStudent1.getPriz();
            unmarshStudent1.getDrop();
        }

        TableColumn<Produkt, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Produkt, Double> prizColumn = new TableColumn<>("Priz");
        prizColumn.setMinWidth(100);
        prizColumn.setCellValueFactory(new PropertyValueFactory<>("priz"));

        TableColumn<Produkt, Integer> dropColumn = new TableColumn<>("Drop");
        dropColumn.setMinWidth(100);
        dropColumn.setCellValueFactory(new PropertyValueFactory<>("drop"));


        tableView = new TableView<>();
        tableView.setItems(getProdukt());
        tableView.getColumns().addAll(nameColumn, prizColumn, dropColumn);
        tableView.setLayoutX(100);
        tableView.setLayoutY(10);

        //Создаем поля для редактирования данных таблицы
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        prizInput = new TextField();
        prizInput.setPromptText("Priz");

        dropInput = new TextField();
        dropInput.setPromptText("Drop");

        //Button
        Button addButton = new Button("Add");
        addButton.setOnAction(event -> addButtonCliced());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(event -> deleteButtonCliced());
        Button b1 = new Button("Add2");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Produkt produkt = new Produkt();
                produkt.setName(nameInput.getText());
                produkt.setPriz(Double.parseDouble(prizInput.getText()));
                produkt.setDrop(Integer.parseInt(dropInput.getText()));
                tableView.getItems().add(produkt);
                convertObjectToXml(produkt, fileName1);
                nameInput.clear();
                prizInput.clear();
                dropInput.clear();
            }
        });

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, prizInput, dropInput, addButton, deleteButton, b1);

        VBox vBox = new VBox();
        vBox.setLayoutX(50);
        vBox.setLayoutY(10);
        vBox.getChildren().addAll(tableView, hBox);

        Group root = new Group();

        root.getChildren().addAll(vBox);

        Scene scene = new Scene(root, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void addButtonCliced() {
        Produkt produkt = new Produkt();
        produkt.setName(nameInput.getText());
        produkt.setPriz(Double.parseDouble(prizInput.getText()));
        produkt.setDrop(Integer.parseInt(dropInput.getText()));
        tableView.getItems().add(produkt);
        convertObjectToXml(produkt, fileName);
        nameInput.clear();
        prizInput.clear();
        dropInput.clear();
    }
    public void deleteButtonCliced(){
        ObservableList<Produkt> produktSelected, allProdukt;
        allProdukt = tableView.getItems();
        produktSelected = tableView.getSelectionModel().getSelectedItems();

        produktSelected.forEach(allProdukt::remove);
    }

    public ObservableList<Produkt> getProdukt () {
        ObservableList<Produkt> produts = FXCollections.observableArrayList();
//        produts.add(new Produkt("Lapton", 899.00, 50));
//        produts.add(new Produkt("Lapton2", 900.00, 51));
//        produts.add(new Produkt("Lapton3", 750.50, 52));
//        produts.add(new Produkt("Lapton4", 68.99, 60));
//        produts.add(new Produkt("Lapton5", 859.00, 80));
        produts.add(new Produkt(unmarshStudent.getName(), unmarshStudent.getPriz(), unmarshStudent.getDrop()));
        produts.add(new Produkt(unmarshStudent1.getName(), unmarshStudent1.getPriz(), unmarshStudent1.getDrop()));
//        unmarshStudent.getName();
//        unmarshStudent.getPriz();
//        unmarshStudent.getDrop();
//            tableView.setItems(unmarshStudent);
        return  produts;
    }

    private static Produkt fromXmlToObject(String filePath) {
        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(Produkt.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Produkt) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
    private static void convertObjectToXml(Produkt produkt, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Produkt.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(produkt, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

