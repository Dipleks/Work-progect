package Практические_занятия.Tresss;

import javafx.scene.Group;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.shape.Rectangle;

public interface GroupRoot {
    Group root = new Group();
    TableView<TableBasik> table = new TableView<TableBasik>();
    TextField ves1Input = new TextField();
    TextField podhod1Input = new TextField();
    TextField povtor1Input = new TextField();
    TextField procent1Input = new TextField();
    TextField ves2Input = new TextField();
    TextField podhod2Input = new TextField();
    TextField povtor2Input = new TextField();
    TextField procent2Input = new TextField();
    TextField ves3Input = new TextField();
    TextField podhod3Input = new TextField();
    TextField povtor3Input = new TextField();
    TextField procent3Input = new TextField();
    TextField pmInput = new TextField();
    TextField tonnazhInput = new TextField();
    TextField kpdInput = new TextField();
    Rectangle rt1 = new Rectangle(0, 290, 1400, 1);
    Rectangle rt2 = new Rectangle(0, 540, 1400, 1);

    TableColumn<TableBasik, Double> ves1Column = new TableColumn<>("Вес");
    TableColumn<TableBasik, Integer> podhod1Column = new TableColumn<>("Подход");
    TableColumn<TableBasik, Integer> povtor1Column = new TableColumn<>("Повтор");
    TableColumn<TableBasik, Double> procent1Column = new TableColumn<>("%");
    TableColumn<TableBasik, Double> ves2Column = new TableColumn<>("Вес");
    TableColumn<TableBasik, Integer> podhod2Column = new TableColumn<>("Подход");
    TableColumn<TableBasik, Integer> povtor2Column = new TableColumn<>("Повтор");
    TableColumn<TableBasik, Double> procent2Column = new TableColumn<>("%");
    TableColumn<TableBasik, Double> ves3Column = new TableColumn<>("Вес");
    TableColumn<TableBasik, Integer> podhod3Column = new TableColumn<>("Подход");
    TableColumn<TableBasik, Integer> povtor3Column = new TableColumn<>("Повтор");
    TableColumn<TableBasik, Double> procent3Column = new TableColumn<>("%");
    TableColumn<TableBasik, Double> pmColumn = new TableColumn<>("ПМ");
    TableColumn<TableBasik, Integer> tonnazhColumn = new TableColumn<>("Тоннаж");
    TableColumn<TableBasik, Double> kpdColumn = new TableColumn<>("КПД");

    default TableColumn<TableBasik, Double> getVes1Column() {
        ves1Column.setMaxWidth(55);
        ves1Column.setResizable(false); //изменение ширины колонки
        ves1Column.setCellValueFactory(new PropertyValueFactory<>("ves1"));
        return ves1Column;
    }
    default TableColumn<TableBasik, Integer> getPodhod1Column() {
        podhod1Column.setMaxWidth(55);
        podhod1Column.setResizable(false);
        podhod1Column.setCellValueFactory(new PropertyValueFactory<>("podhod1"));
        return podhod1Column;
    }
    default TableColumn<TableBasik, Integer> getPovtor1Column() {
        povtor1Column.setMaxWidth(55);
        povtor1Column.setResizable(false);
        povtor1Column.setCellValueFactory(new PropertyValueFactory<>("povtor1"));
        return povtor1Column;
    }
    default TableColumn<TableBasik, Double> getProcent1Column(){
        procent1Column.setMaxWidth(35);
        procent1Column.setResizable(false);
        procent1Column.setCellValueFactory(new PropertyValueFactory<>("procent1"));
        return procent1Column;
    }
    default TableColumn<TableBasik, Double> getVes2Column() {
        ves2Column.setMaxWidth(45);
        ves2Column.setResizable(false); //изменение ширины колонки
        ves2Column.setCellValueFactory(new PropertyValueFactory<>("ves2"));
        return ves2Column;
    }
    default TableColumn<TableBasik, Integer> getPodhod2Column() {
        podhod2Column.setMaxWidth(55);
        podhod2Column.setResizable(false);
        podhod2Column.setCellValueFactory(new PropertyValueFactory<>("podhod2"));
        return podhod2Column;
    }
    default TableColumn<TableBasik, Integer> getPovtor2Column() {
        povtor2Column.setMaxWidth(55);
        povtor2Column.setResizable(false);
        povtor2Column.setCellValueFactory(new PropertyValueFactory<>("povtor2"));
        return povtor2Column;
    }
    default TableColumn<TableBasik, Double> getProcent2Column(){
        procent2Column.setMaxWidth(35);
        procent2Column.setResizable(false);
        procent2Column.setCellValueFactory(new PropertyValueFactory<>("procent2"));
        return procent2Column;
    }
    default TableColumn<TableBasik, Double> getVes3Column() {
        ves3Column.setMaxWidth(45);
        ves3Column.setResizable(false); //изменение ширины колонки
        ves3Column.setCellValueFactory(new PropertyValueFactory<>("ves3"));
        return ves3Column;
    }
    default TableColumn<TableBasik, Integer> getPodhod3Column() {
        podhod3Column.setMaxWidth(55);
        podhod3Column.setResizable(false);
        podhod3Column.setCellValueFactory(new PropertyValueFactory<>("podhod3"));
        return podhod3Column;
    }
    default TableColumn<TableBasik, Integer> getPovtor3Column() {
        povtor3Column.setMaxWidth(55);
        povtor3Column.setResizable(false);
        povtor3Column.setCellValueFactory(new PropertyValueFactory<>("povtor3"));
        return povtor3Column;
    }
    default TableColumn<TableBasik, Double> getProcent3Column(){
        procent3Column.setMaxWidth(35);
        procent3Column.setResizable(false);
        procent3Column.setCellValueFactory(new PropertyValueFactory<>("procent3"));
        return procent3Column;
    }
    default TableColumn<TableBasik, Double> getPmColumn(){
        pmColumn.setMaxWidth(35);
        pmColumn.setResizable(false);
        pmColumn.setCellValueFactory(new PropertyValueFactory<>("pm"));
        return pmColumn;
    }
    default TableColumn<TableBasik, Integer> getTonnazhColumn() {
        tonnazhColumn.setMaxWidth(55);
        tonnazhColumn.setResizable(false);
        tonnazhColumn.setCellValueFactory(new PropertyValueFactory<>("tonnazh"));
        return tonnazhColumn;
    }
    default TableColumn<TableBasik, Double> getKpdColumn(){
        kpdColumn.setMaxWidth(50);
        kpdColumn.setResizable(false);
        kpdColumn.setCellValueFactory(new PropertyValueFactory<>("kpd"));
        return kpdColumn;
    }

}
