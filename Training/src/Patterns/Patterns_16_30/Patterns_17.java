package Patterns.Patterns_16_30;/*Chain Of Responsibility
- цепочка ответственности.*/

public class Patterns_17 {
    public static void main(String[] args) {
        MassegePrinter massegePrinter = new ConsoleMassegePrinter();
        FileMassegePrinter fileMassegePrinter = new FileMassegePrinter();
        massegePrinter.setNexMassegePrinter(fileMassegePrinter);
        fileMassegePrinter.setNexMassegePrinter(new DbMassegePrinter());
        massegePrinter.print("hello");
    }
}

abstract class MassegePrinter {
    MassegePrinter nexMassegePrinter;
    void setNexMassegePrinter (MassegePrinter massegePrinter){
        nexMassegePrinter = massegePrinter;
    }
    abstract void pintMasege(String massege);
    void print (String massege){
        pintMasege(massege);
        if (nexMassegePrinter != null){
            nexMassegePrinter.print(massege);
        }
    }
}
class ConsoleMassegePrinter extends MassegePrinter{
    @Override
    void pintMasege(String massege) {
        System.out.println("print to console: " + massege);
    }
}
class FileMassegePrinter extends MassegePrinter{
    @Override
    void pintMasege(String massege) {
        System.out.println("print to file: " + massege);
    }
}
class DbMassegePrinter extends MassegePrinter{
    @Override
    void pintMasege(String massege) {
        System.out.println("print to db: " + massege);
    }
}