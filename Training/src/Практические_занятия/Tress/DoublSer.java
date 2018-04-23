package Практические_занятия.Tress;

import java.io.*;

public class DoublSer {
    public boolean seri (DSave dSave, String s) {
        boolean flag = false;
        File f = new File(s);
        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(dSave);
            flag = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public DSave dser (String s) throws InvalidObjectException {
        File f = new File(s);
        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            DSave dSave = (DSave) ois.readObject();
            return dSave;

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
