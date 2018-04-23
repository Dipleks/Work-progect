package Ноябрь_23;/*Scanner и PrintWriter*/

import java.io.*;
import java.util.Scanner;

public class Scanner_и_PrintWriter {
    public static void main(String[] args) throws Exception {
        /*До этого мы уже изучали работу с File и Buffer, но
        * есть и другие способу чтения и записи фала, это Scanner и
        * PrintWriter, эти инструменты намного мощнее.*/

//        Scanner scanner = new Scanner(new FileReader("FileTest.txt"));
//        PrintWriter writer = new PrintWriter(new FileWriter("FileTest.txt"));
//        Scanner scanner1 = new Scanner(new FileInputStream("FileTest.txt"));
//        PrintWriter writer1 = new PrintWriter(new FileOutputStream("FileTest.txt"));

        /*Scanner и PrintWriter имплементят интерфейс Closeable, поэтому наши
        * выше написанные выражения лучше поместить в трей:*/

//        try(Scanner scanner = new Scanner(new FileReader("FileTest.txt"))) {
//            //мы можем читать таким образом:
//            while (scanner.hasNext()){
//                System.out.println(scanner.next());
//            } }

        try (PrintWriter writer = new PrintWriter(new FileWriter("FileTest.txt"))){
            writer.write("перезапись1");
            writer.write("\n");
            writer.write("перезапись2");
        }
    }
}
