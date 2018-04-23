package Практические_занятия.MyProg;

import java.io.*;

public class SerWork {
    public boolean seri (SaveL1 saveL1, String ft) {
        boolean flag = false;
        File f = new File(ft);
        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(saveL1);
            flag = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public SaveL1 dser (String ft) throws InvalidObjectException {
        File fr = new File(ft);
        try (FileInputStream fis = new FileInputStream(fr);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            SaveL1 saveL1 = (SaveL1) ois.readObject();
            return saveL1;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }

    public boolean seri1 (SaveL2 saveL2, String ft1) {
        boolean flag1 = false;
        File f1 = new File(ft1);
        try (FileOutputStream fos1 = new FileOutputStream(f1);
             ObjectOutputStream oos1 = new ObjectOutputStream(fos1)) {

            oos1.writeObject(saveL2);
            flag1 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag1;
    }

    public SaveL2 dser1 (String ft1) throws InvalidObjectException {
        File fr1 = new File(ft1);
        try (FileInputStream fis1 = new FileInputStream(fr1);
             ObjectInputStream ois1 = new ObjectInputStream(fis1)) {

            SaveL2 saveL2 = (SaveL2) ois1.readObject();
            return saveL2;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }

    public boolean seri3 (SaveL3 saveL3, String ft3) {
        boolean flag3 = false;
        File f3 = new File(ft3);
        try (FileOutputStream fos3 = new FileOutputStream(f3);
             ObjectOutputStream oos3 = new ObjectOutputStream(fos3)) {

            oos3.writeObject(saveL3);
            flag3 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag3;
    }

    public SaveL3 dser3 (String ft3) throws InvalidObjectException {
        File fr3 = new File(ft3);
        try (FileInputStream fis3 = new FileInputStream(fr3);
             ObjectInputStream ois3 = new ObjectInputStream(fis3)) {

            SaveL3 saveL3 = (SaveL3) ois3.readObject();
            return saveL3;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }
    ///////////////
    public boolean seri4 (SaveL4 saveL4, String ft4) {
        boolean flag4 = false;
        File f4 = new File(ft4);
        try (FileOutputStream fos4 = new FileOutputStream(f4);
             ObjectOutputStream oos4 = new ObjectOutputStream(fos4)) {

            oos4.writeObject(saveL4);
            flag4 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag4;
    }

    public SaveL4 dser4 (String ft4) throws InvalidObjectException {
        File fr4 = new File(ft4);
        try (FileInputStream fis4 = new FileInputStream(fr4);
             ObjectInputStream ois4 = new ObjectInputStream(fis4)) {

            SaveL4 saveL4 = (SaveL4) ois4.readObject();
            return saveL4;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }
    ///////////////
    public boolean seri42 (SaveL42 saveL42, String ft42) {
        boolean flag42 = false;
        File f42 = new File(ft42);
        try (FileOutputStream fos42 = new FileOutputStream(f42);
             ObjectOutputStream oos42 = new ObjectOutputStream(fos42)) {

            oos42.writeObject(saveL42);
            flag42 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag42;
    }

    public SaveL42 dser42 (String ft42) throws InvalidObjectException {
        File fr42 = new File(ft42);
        try (FileInputStream fis42 = new FileInputStream(fr42);
             ObjectInputStream ois42 = new ObjectInputStream(fis42)) {

            SaveL42 saveL42 = (SaveL42) ois42.readObject();
            return saveL42;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }
    //////////////
    public boolean seri4_3 (SaveL4_3 saveL4_3, String ft4_3) {
        boolean flag4_3 = false;
        File f4_3 = new File(ft4_3);
        try (FileOutputStream fos4_3 = new FileOutputStream(f4_3);
             ObjectOutputStream oos4_3 = new ObjectOutputStream(fos4_3)) {

            oos4_3.writeObject(saveL4_3);
            flag4_3 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag4_3;
    }

    public SaveL4_3 dser4_3 (String ft4_3) throws InvalidObjectException {
        File fr4_3 = new File(ft4_3);
        try (FileInputStream fis4_3 = new FileInputStream(fr4_3);
             ObjectInputStream ois4_3 = new ObjectInputStream(fis4_3)) {

            SaveL4_3 saveL4_3 = (SaveL4_3) ois4_3.readObject();
            return saveL4_3;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }
    ///////////////
    public boolean seri4_4 (SaveL4_4 saveL4_4, String ft4_4) {
        boolean flag4_4 = false;
        File f4_4 = new File(ft4_4);
        try (FileOutputStream fos4_4 = new FileOutputStream(f4_4);
             ObjectOutputStream oos4_4 = new ObjectOutputStream(fos4_4)) {

            oos4_4.writeObject(saveL4_4);
            flag4_4 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag4_4;
    }

    public SaveL4_4 dser4_4 (String ft4_4) throws InvalidObjectException {
        File fr4_4 = new File(ft4_4);
        try (FileInputStream fis4_4 = new FileInputStream(fr4_4);
             ObjectInputStream ois4_4 = new ObjectInputStream(fis4_4)) {

            SaveL4_4 saveL4_4 = (SaveL4_4) ois4_4.readObject();
            return saveL4_4;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }
    //////////////
    public boolean seri4_5 (SaveL4_5 saveL4_5, String ft4_5) {
        boolean flag4_5 = false;
        File f4_5 = new File(ft4_5);
        try (FileOutputStream fos4_5 = new FileOutputStream(f4_5);
             ObjectOutputStream oos4_5 = new ObjectOutputStream(fos4_5)) {

            oos4_5.writeObject(saveL4_5);
            flag4_5 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag4_5;
    }

    public SaveL4_5 dser4_5 (String ft4_5) throws InvalidObjectException {
        File fr4_5 = new File(ft4_5);
        try (FileInputStream fis4_5 = new FileInputStream(fr4_5);
             ObjectInputStream ois4_5 = new ObjectInputStream(fis4_5)) {

            SaveL4_5 saveL4_5 = (SaveL4_5) ois4_5.readObject();
            return saveL4_5;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }
    //////////////////
    public boolean seri4_6 (SaveL4_6 saveL4_6, String ft4_6) {
        boolean flag4_6 = false;
        File f4_6 = new File(ft4_6);
        try (FileOutputStream fos4_6 = new FileOutputStream(f4_6);
             ObjectOutputStream oos4_6 = new ObjectOutputStream(fos4_6)) {

            oos4_6.writeObject(saveL4_6);
            flag4_6 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag4_6;
    }

    public SaveL4_6 dser4_6 (String ft4_6) throws InvalidObjectException {
        File fr4_6 = new File(ft4_6);
        try (FileInputStream fis4_6 = new FileInputStream(fr4_6);
             ObjectInputStream ois4_6 = new ObjectInputStream(fis4_6)) {

            SaveL4_6 saveL4_6 = (SaveL4_6) ois4_6.readObject();
            return saveL4_6;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not desiarialization");
    }
    ////////////////
    public boolean seri4_7 (SaveL4_7 saveL4_7, String ft4_7) {
        boolean flag4_7 = false;
        File f4_7 = new File(ft4_7);
        try (FileOutputStream fos4_7 = new FileOutputStream(f4_7);
             ObjectOutputStream oos4_7 = new ObjectOutputStream(fos4_7)) {

            oos4_7.writeObject(saveL4_7);
            flag4_7 = true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag4_7;
    }

    public SaveL4_7 dser4_7 (String ft4_7) throws InvalidObjectException {
        File fr4_7 = new File(ft4_7);
        try (FileInputStream fis4_7 = new FileInputStream(fr4_7);
             ObjectInputStream ois4_7 = new ObjectInputStream(fis4_7)) {

            SaveL4_7 saveL4_7 = (SaveL4_7) ois4_7.readObject();
            return saveL4_7;

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
