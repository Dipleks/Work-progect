package Patterns.Patterns_1_15; /*Decorator - позволяет дописывать
свой код в существующий код.*/

public class Patterns_13 {
    public static void main(String[] args) {
        FileS fileS = new FileBufferedReader(new FileSR());
        fileS.read();
    }
}
interface FileS{
    void read ();
}
class FileSR implements FileS{
    @Override
    public void read() {
        System.out.println("read file");
    }
}
//теперь сделаем декоратор, который позолит нам добавить функционал к read:
abstract class FileDecorator implements FileS {
    FileS fileDecorator;
    //добавим конструктор:
    public FileDecorator(FileS fileDecorator) {
        this.fileDecorator = fileDecorator;
    }
    //добавим метод read:
    public abstract void read();
}
//теперь нам нужно заэкстендить этот метод:
class FileBufferedReader extends FileDecorator {
    public FileBufferedReader(FileS fileDecorator) {
        super(fileDecorator);
    }
    @Override
    public void read() {
        fileDecorator.read();
        System.out.println("buffered read");
    }
}
