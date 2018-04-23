package FX;/*UI Controls - это добавление элементов в окно.*/
/*Всего 27 элементов с которыми можно работать. Отобразим их все
* в нашей программе:*/
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FX_7 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(new Label("label"));
        flowPane.getChildren().add(new Button("button"));

        //radio button
        ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("one");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        RadioButton rb2 = new RadioButton("one");
        rb2.setToggleGroup(group);
        RadioButton rb3 = new RadioButton("one");
        rb3.setToggleGroup(group);
        flowPane.getChildren().addAll(rb1, rb2, rb3);

        flowPane.getChildren().add(new ToggleButton("toggle"));
        flowPane.getChildren().add(new CheckBox("check box"));
        flowPane.getChildren().add(new ChoiceBox<String>(FXCollections.observableArrayList("First","Second","Third")));
        flowPane.getChildren().add(new TextField("text field"));
        flowPane.getChildren().add(new PasswordField());

        ScrollBar sc = new ScrollBar();
        sc.setMin(0);
        sc.setMax(100);
        sc.setValue(50);
        flowPane.getChildren().add(sc);

        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList("Sinle","Double","Suite", "Family App");
        list.setItems(items);
        list.setMaxHeight(100);
        flowPane.getChildren().add(list);

        TreeItem<String> rootItem = new TreeItem<>("Inbox");
        rootItem.setExpanded(true);
        for (int i = 1; i < 6; i++) {
            TreeItem<String> item = new TreeItem<>("Massage" + i);
            rootItem.getChildren().add(item);
        }
        TreeView<String> tree = new TreeView<>(rootItem);
        tree.setMaxHeight(100);
        flowPane.getChildren().add(tree);

        ObservableList<String> options = FXCollections.observableArrayList(
                "Option 1",
                "Option 2",
                "Option 3"
        );
        ComboBox comboBox = new ComboBox(options);
        flowPane.getChildren().add(comboBox);

        Separator separator = new Separator();
        separator.setOrientation(Orientation.VERTICAL);
        flowPane.getChildren().add(separator);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(40);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);
        flowPane.getChildren().add(slider);

        ProgressBar pb = new ProgressBar(0.6);
        ProgressIndicator pi = new ProgressIndicator(0.6);
        flowPane.getChildren().add(pb);
        flowPane.getChildren().add(pi);

        Hyperlink link = new Hyperlink();
        link.setText("http://google.com");
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("This link is clicked");
            }
        });
        flowPane.getChildren().add(link);

        Tooltip tooltip = new Tooltip();
        tooltip.setText("this is link to google");
        link.setTooltip(tooltip);

        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setPrefHeight(245);
        flowPane.getChildren().add(htmlEditor);

        TitledPane tp = new TitledPane("My Titled Pane", new Button("Button"));
        flowPane.getChildren().add(tp);

        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(tp, new TitledPane("second", new TextField("text field")));
        accordion.setExpandedPane(tp);
        flowPane.getChildren().addAll(accordion);

        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        MenuItem menuItem = new MenuItem("Open");
        MenuItem menuItem2 = new MenuItem("Save");
        menuFile.getItems().addAll(menuItem,menuItem2);
        MenuItem menuItem3 = new MenuItem("Cut");
        MenuItem menuItem4 = new MenuItem("Copy");
        menuEdit.getItems().addAll(menuItem3,menuItem4);
        menuBar.getMenus().addAll(menuFile,menuEdit);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(menuBar, flowPane);

        ColorPicker colorPicker1 = new ColorPicker();
        flowPane.getChildren().add(colorPicker1);

        Pagination pagination1 = new Pagination();
        flowPane.getChildren().add(pagination1);

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");

        Button button = new Button("open dialog");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fileChooser.showOpenDialog(primaryStage);
            }
        });
        flowPane.getChildren().add(button);

        Group root = new Group();
        root.getChildren().addAll(vBox);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
