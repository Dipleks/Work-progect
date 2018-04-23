package Практические_занятия.Serializator1;

import Практические_занятия.Serializator.Student;

import java.io.*;

public class Ser {

    public boolean seri (Bd bd, String fN) {
        boolean flag = false;
        File f = new File(fN);
        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(bd);
            flag = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public Bd dser (String fN) throws InvalidObjectException {
        File fr = new File(fN);
        try (FileInputStream fis = new FileInputStream(fr);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Bd bd = (Bd) ois.readObject();
            return bd;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }
}
