package programReliz;

import javafx.scene.Group;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;

public interface RootPanel
{
    Group root = new Group();
    Screen screen = Screen.getPrimary();
}
