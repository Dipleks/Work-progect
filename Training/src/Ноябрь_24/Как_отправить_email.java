package Ноябрь_24;

import com.sun.deploy.util.SessionProperties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Как_отправить_email {
    public static void main(String[] args) throws Exception {
        final Properties properties = new Properties();
        //Подгружаем класс:
        properties.load(Как_отправить_email.class.getClassLoader().getResourceAsStream("mail.properties"));

        /*фаил mail.properties содержит данные:
        * mail.transport.protocol=smtps
        * mail.smtps.auth=true
        * mail.smtps..host=smtps.gmail.com
        * mail.smtps.user=myemail@gmail.com*/

        /*Для работы с имэйлом нам необходимо скачать JAVA MAIL API и подключить его.
        * Подключение: Project Structure - SDKs - и добавляем наш путь к скачаному javax.mail.jar*/

        //Настраиваем сообщение:
        Session mailSession = Session.getDefaultInstance(properties);
        MimeMessage messagem = new MimeMessage(mailSession);
        //Пишем от кого:
        messagem.setFrom(new InternetAddress("myemail@gmail.com"));
        //Пишем кому:
        messagem.addRecipient(Message.RecipientType.TO, new InternetAddress("youremail@mail.ru"));
        //Заголовок:
        messagem.setSubject("Hello");
        //Текст сообщения:
        messagem.setText("Hi this is my test massage");

        //Отправка:
        Transport tr = mailSession.getTransport();
        //Пишем пароль от своей почты:
        tr.connect(null, "123");
        //Отправляем:
        tr.sendMessage(messagem, messagem.getAllRecipients());
        tr.close();

        /*Далее запускаем программу. но она выдаст ошибку! Gmail, как бы нам говорит,
        * что возможно мы хакеры и отправлять сообщение он не будет! На почту нам приходит
        * письмо, где нас спрашивают, отправляли ли мы письмо и т.д., мы мы выбираем
        * что отправляли и нас перекидывеает на страницу где мы включаем доступ
        * отправки имэйла сторонним программам!*/
    }
}
