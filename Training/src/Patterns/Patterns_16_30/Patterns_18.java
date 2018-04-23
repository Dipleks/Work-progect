package Patterns.Patterns_16_30;/*Command
удобство в том, что есть возможность инкапсулировать обработчики.*/

import java.util.ArrayList;
import java.util.List;

public class Patterns_18 {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        receiver.addCommand(new MouseClick());
        receiver.addCommand(new MousePress());
        receiver.RunCommand();
    }
}
interface Command{
    void execute();
}
class MouseClick implements Command{
    @Override
    public void execute() {
        System.out.println("click command");
    }
}
class MousePress implements Command{
    @Override
    public void execute() {
        System.out.println("click press");
    }
}
class Receiver {
    List<Command> commands = new ArrayList<>();
    void addCommand(Command command){
        commands.add(command);
    }

    void RunCommand(){
        for (Command command : commands){
            command.execute();
        }
    }
}