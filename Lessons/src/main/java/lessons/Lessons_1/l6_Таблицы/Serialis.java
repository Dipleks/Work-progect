package lessons.Lessons_1.l6_Таблицы;

import java.io.*;

public class Serialis {
    public boolean seri (Person pr, String str){
        boolean flag = false;
        File file = new File(str);
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
                ){
            oos.writeObject(pr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public Person deseri (String str) throws InvalidObjectException {
        File dFile = new File(str);
        try (
                FileInputStream fis = new FileInputStream(dFile);
                ObjectInputStream ois = new ObjectInputStream(fis)
                ) {
            Person person = (Person) ois.readObject();
            return (Person) person;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Diser nod");
    }
}
