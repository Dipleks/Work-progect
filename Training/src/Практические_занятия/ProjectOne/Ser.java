package Практические_занятия.ProjectOne;

import java.io.*;

public class Ser {
    public boolean serializabl (S s, String str) {
        boolean flag = false;
        File file = new File(str);
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(s);
            flag = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public S diserializabl (String str) throws InvalidObjectException {
        File fileD = new File(str);
        try (FileInputStream fis = new FileInputStream(fileD);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            S s = (S) ois.readObject();
            return s;

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
