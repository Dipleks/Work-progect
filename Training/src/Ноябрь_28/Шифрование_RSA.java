package Ноябрь_28;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;

/*Данный алгоритм шифрования позволяет нам использовать ключи*/
public class Шифрование_RSA {
    public static void main(String[] args) throws Exception{
        String s = "hello world";
        Cipher cipher = Cipher.getInstance("RSA");

        KeyPairGenerator pairgen = KeyPairGenerator.getInstance("RSA");

        //Рандомный ключь определенного размера
//        SecureRandom random = new SecureRandom();
//        pairgen.initialize(512, random);


        KeyPair keyPair = pairgen.generateKeyPair();
        Key publicKey = keyPair.getPublic();
        Key privateKey = keyPair.getPrivate();

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] bytes = cipher.doFinal(s.getBytes());
        for (byte b : bytes){
            System.out.print(b);
        }
        System.out.println("");
        Cipher decripteCipher = Cipher.getInstance("RSA");
        decripteCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decripteBytes = decripteCipher.doFinal(bytes);
        for (byte b : decripteBytes){
            System.out.print((char)b);
        }
    }/*Чтобы использовать ключи их необходимо спомощью сериализации,
     * засунуть в фаил. Отправляем фаил с публичным ключем человеку,
     * он десириализирует его и дишефрует!*/
}
