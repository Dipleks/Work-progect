import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class ThedTest implements RootG
{
    private String[] str = new String[5];
    private String[] str1 = new String[5];
    private Button b1 = new Button("Запустим среду 1");
    private Button b2 = new Button("Запустим среду 2");
    private Label[] label1 = new Label[5];
    private Label[] label2 = new Label[5];
    private int a = 0;

    Button getB1() {
        b1.setLayoutX(80);
        b1.setOnAction(event -> {
            if (a==0) {
                getT1();
                getT2();
                a++;
            } else {
                System.out.println("run");
            }
        });
        return b1;
    }
    Button getB2() {
        b2.setOnAction(event -> {
            if (a==1) {
                for (int i = 0; i < 5; i++) {
                    vBox2.getChildren().remove(label1[i]);
                    vBox1.getChildren().remove(label2[i]);
                }
                root.getChildren().remove(vBox1);
                root.getChildren().remove(vBox2);
                a--;
            } else {
                System.out.println("clear");
            }
        });
        b2.setLayoutX(80);
        b2.setLayoutY(30);
        return b2;
    }

    private void getT1(){
        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                Map<Integer, String> map = new HashMap<>();
                for (int i = 0; i < 5; i++) {
                    try {
                        map.put(i, addLabStr()[i]);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < 5; i++) {
                    label1[i] = new Label();
                    label1[i].setText(map.get(i));
                    label1[i].setLayoutX(20);
                    label1[i].setLayoutY(i*20);
                }
                vBox2.setStyle("-fx-border-color: RED");
                vBox2.setLayoutX(150);
                vBox2.setLayoutY(70);
                vBox2.setSpacing(10);
                vBox2.setPadding(new Insets(10, 20, 10, 10));
                vBox2.setPrefSize(120, 500);
                vBox2.getChildren().addAll(label1);
                root.getChildren().addAll(vBox2);
            }
        });
        thread1.run();
    }
    private void getT2(){
        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                Map<Integer, String> map = new HashMap<>();
                for (int i = 0; i < 5; i++) {
                    try {
                        map.put(i, addNumStr()[i]);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < 5; i++) {
                    label2[i] = new Label();
                    label2[i].setText(map.get(i));
                    label2[i].setLayoutX(5);
                    label2[i].setLayoutY(i*20);
                }
                vBox1.setStyle("-fx-border-color: RED");
                vBox1.setLayoutX(20);
                vBox1.setLayoutY(70);
                vBox1.setSpacing(10); //расстояние между строками
                vBox1.setPadding(new Insets(10, 10, 10, 10)); //расстояние от: верхнего,
                                                                        // правого, нижнего, левого краёв!
                vBox1.setPrefSize(120, 500);
                vBox1.getChildren().addAll(label2);
                root.getChildren().addAll(vBox1);
            }
        });
        thread2.run();
    }
    private String[] addLabStr() throws IOException {
        File file = new File("src/textMap.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < 5; i++) {
            str[i] = br.readLine();
        }
        return str;
    }
    private String[] addNumStr() throws IOException {
        File file = new File("src/textNum.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (int i = 0; i < 5; i++) {
            str1[i] = br.readLine();
        }
        return str1;
    }
}
