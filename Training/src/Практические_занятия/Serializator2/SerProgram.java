package Практические_занятия.Serializator2;

import java.io.*;

public class SerProgram {

    public boolean seri (DBProg dbProg, String ft) {
        boolean flag = false;
        File f = new File(ft);
        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(dbProg);
            flag = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public DBProg dser (String ft) throws InvalidObjectException {
        File fr = new File(ft);
        try (FileInputStream fis = new FileInputStream(fr);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            DBProg dbProg = (DBProg) ois.readObject();
            return dbProg;

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
