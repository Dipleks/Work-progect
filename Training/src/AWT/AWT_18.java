package AWT;/*Заставка - Splash screen.
Есть два способа отобразить окно загрузки приложений:
Первый мы просто рисуем (это приметивный способ) и
второй мы создаем прогресс бар (это актуальный способ)*/
/*Для того чтоб заставка отбразилась нужно указать к
* ней путь: заходим AWT_18-Edit Configurations-VM Options-пишем "-splash:путь к картинке" */
import javax.swing.*;
import java.awt.*;

public class AWT_18 {
    public static void main(String[] args) throws Exception{
//Получим доступ к созданию нашей заставке:
        SplashScreen splash = SplashScreen.getSplashScreen();

        //Нарисуем загрузку:
//        Rectangle bounds = splash.getBounds();
//        Graphics2D g2 = splash.createGraphics();
//        g2.setColor(Color.blue);
//        for (int i = 0; i < 100; i++) {
//            g2.fillRect(0, 0, bounds.width*i/100,20);
//            splash.update();
//            Thread.sleep(30);
//        }

        //Создадим прогресс бар:
        final Image img = new ImageIcon(splash.getImageURL()).getImage();
        final JFrame splashFrame = new JFrame();
        JPanel splashPanel = new JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(img, 0, 0, null);
            }
        };
        final JProgressBar jProgressBar = new JProgressBar();
        jProgressBar.setStringPainted(true);
        splashPanel.setLayout(new BorderLayout());
        splashPanel.add(jProgressBar, BorderLayout.NORTH);
        splashFrame.add(splashPanel);
        splashFrame.setBounds(splash.getBounds());
        splashFrame.setVisible(true);

        try { for (int i = 0; i <= 100; i++) {
                jProgressBar.setString("Loading..."+i);
                jProgressBar.setValue(i);
                splashPanel.repaint();
                Thread.sleep(50); }
        } catch (InterruptedException e) {} }}
