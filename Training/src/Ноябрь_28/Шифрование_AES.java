package Ноябрь_28;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Шифрование_AES {
    public static void main(String[] args) throws Exception {
        String s = "hello world";
        //Создаем шифрование и помещаем шифр которй будем применять:
        Cipher cipher = Cipher.getInstance("AES");

        //Ключи могут быть рандормные и нет:
        //рандомный:
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128); //битность ключа
        SecretKey key = kgen.generateKey(); //гененрируем ключ
        //добавляем ключ самостоятельно:
        //SecretKeySpec key = new SecretKeySpec("Bar12345Bar12345".getBytes(), "AES"); //8 - значений, 16 байт

        //Теперь проинициализируем:
        //ENCRYPT - зашифровать, DECRYPT - расшифровать
        cipher.init(Cipher.ENCRYPT_MODE, key);

        //Тепрь шифруем:
        byte[] bytes = cipher.doFinal(s.getBytes());
        for (byte b : bytes){
            System.out.print(b);
        }
        System.out.println("");
        //Теперь расшифруем:
        Cipher decripteCipher = Cipher.getInstance("AES");
        decripteCipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decripteBytes = decripteCipher.doFinal(bytes);
        for (byte b : decripteBytes){
            System.out.print((char)b);
        }
    }/*AES не надежный формат шифрования!*/
}
