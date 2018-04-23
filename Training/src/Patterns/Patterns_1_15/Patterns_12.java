package Patterns.Patterns_1_15;/*Composite*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patterns_12 {
    public static void main(String[] args) {
    }
}
/*Создадим "папку", с параметрами и чтобы она
была композитным объектом она должна содержать другие папки:*/
class Folder {
    String name;
    Date creationDate;
    //другие папки:
    List<Folder> folders = new ArrayList<>();
    List<File> files = new ArrayList<>();
//создадим конструктор имени:
    public Folder(String name) {
        this.name = name;
    }
 //создадим функционал который будет работать с папками:
    void addFolder (Folder folder){
        folders.add(folder);
    }
    void removeFolder (Folder folder){
        folders.remove(folder);
    }
    List<Folder> getFolders(){
        return folders;
    }
    void addFile (File file){
        files.add(file);
    }
    void removeFile (File file){
        files.remove(file);
    }
    List<File> getFile(){
        return files;
    }

}
class File{
    String fileName;
}