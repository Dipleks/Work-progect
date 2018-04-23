import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public interface Root
{
    Group group = new Group();
    Group group2 = new Group();
    Stage s1 = new Stage();
    Stage s2 = new Stage();

    Scene scene = new Scene(group, 500, 500);
    Scene scene2 = new Scene(group2, 500, 500);

    Button b1 = new Button("1");
    Button b2 = new Button("2");
}
