package Практические_занятия.Table_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.ColorAdjust;

interface TableData {

    TableView<SaveTable> table = new TableView<>();
    ColorAdjust color = new ColorAdjust();
    TableColumn<SaveTable, String> fio = new TableColumn<>("ФИО");
    TableColumn<SaveTable, String> dateR = new TableColumn<>("Дата рождения");
    TableColumn<SaveTable, ComboBox> polButton = new TableColumn<>("Пол");
    TextField textFio = new TextField();
    DatePicker textDateR = new DatePicker();
    Button add = new Button("Add");
    Button delete = new Button("Delete");
    ObservableList<SaveTable> listTable = FXCollections.observableArrayList();
    SaveTable saveTable = new SaveTable();

    default TableView<SaveTable> getTable() {

        fio.setMinWidth(200);
        fio.setCellValueFactory(new PropertyValueFactory<>("name"));
        dateR.setMinWidth(100);
        dateR.setCellValueFactory(new PropertyValueFactory<>("dateRozhdenia"));
        polButton.setMinWidth(70);
        polButton.setCellValueFactory(new PropertyValueFactory<>("pol"));

        table.getColumns().addAll(fio, dateR, polButton);
        color.setHue(0.2); //цвет оконтовки 0.7, 0.1
        color.setSaturation(0.3); //цвет кнопки 0.1
        table.setEffect(color);
        table.setFixedCellSize(30.5); //высота ячеек
        table.setPrefHeight(400); //высота таблицы
        return table;
    }
    default Button getAdd(){

        saveTable.setName(textFio.getText());
        textFio.clear();

        return add;
    }
    default Button getDelete() {



        return delete;
    }
    default ObservableList<SaveTable> getListTable() {


        return listTable;
    }
}
