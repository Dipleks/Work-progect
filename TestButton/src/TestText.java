import java.io.*;

public class TestText {
    public static void main(String[] args) throws IOException {
//        File file = new File("test.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("asdbv");
//        bufferedWriter.flush();

        FileReader fileReader = new FileReader("test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        System.out.println(bufferedReader.readLine());
    }
}
