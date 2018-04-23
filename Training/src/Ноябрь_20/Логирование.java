package Ноябрь_20;/*Логирование - loggers*/
import java.util.logging.*;
public class Логирование {
    /*Логиры принято писать отдельно:*/
    //private static final Logger logger2 = Logger.getGlobal();
    //или можно использовать:
    //private static final Logger logger = Logger.getLogger("Ноябрь_20.Логирование");
    //тут даем имя логеру, обычно это имя класса.

    //разници особой между ними нет.

    //Можно записать проще:
    private static final Logger logger = Logger.getLogger("Логирование.class.getName()");
    //Это делается для того, чтоб логирование происходило на уровне класса,
    //что облегчит чтение конфигурации по классу.

    public static void main(String[] args) throws Exception {
        //logger.info("message"); //выведем на консоль наш логер
        //Фаил с конфигурацией лежит:
        //"C:/Program Files/Java/jre1.8.0_151/lib.logging.properties"

        //Мы можем создать свой логер фаил, для этого копируем все что
        //в оригинальном файле (logging.properties) и вставляем в новый и сохраняем там где нужно.
        /*У логеров есть 7 уровней, если мы напишем один, то остальные
        * будут видны только уровнем выше, те что снизу видны не будт.
        * Уровни: SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST.
        *
        * Свой логер мы прописываем в Edit Configuration - VM Options -
        * - -Djava.util.logging.config.file=путь к фалу. И далее мы
        * его можем редактировать как нам необходимо. Редактирование можно производить
        * и коде, но в коде будет тяжелее, если мы поменяем настройки в файле,
        * то не придктся ничего заново компилировать.*/

        //Проверим путь к нашему лог-файлу:
        //System.out.println(System.getProperty("java.util.logging.config.file"));

        //Теперь нам необходимо его применить, для того чтоб использовался он, а не тот что поумолчанию:
        //LogManager.getLogManager().readConfiguration();

        //Теперь научимся логировать:
        //logger.log(Level.FINER, "finer"); //этот не отобразится,т.к по умолчанию у нас стоит INFO
        //logger.log(Level.INFO, "info");
        //Можем добавить 3й параметр, какое-нибудь исключение:
        //logger.log(Level.WARNING, "warning", new Throwable());

        //Мы можем указывать Handler (обработчик), их у нас может быть несколько:
        Handler consoleHandler = new ConsoleHandler(); //пишет события в консоль.
        Handler fileHandler = new FileHandler(); //пишет события в фаил.
//        new StreamHandler(); //будет использоваться крайне редко.
//        new SocketHandler(); //будет использоваться крайне редко.

        //logger.setUseParentHandlers(false); //при запуске этого параметра логирование в консоль приходить не будет.

        //logger.addHandler(fileHandler);
        //Залогировать мы можем еще проще:
        //logger.info("info");

        //допустим я хочу выводить только те сообщения которые заканчиваются на denis:
        //logger.info("info denis");
        //Для этого используем фильтры:
        //Создаем класс фильтры.
        consoleHandler.setFilter(new MyFilter()); //теперь выведется только info denis
        consoleHandler.setFormatter(new MyFormatter()); //выведется только INFO: info denis без даты.
        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);
        logger.info("info");
        logger.info("info denis");
    }
    static class MyFilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord logRecord) {
           return logRecord.getMessage().endsWith("denis");
        }}
    /*Если мы хотим удалить лишнию информацию, например, дату,
    * то нам необходим класс форматер:*/
    static class MyFormatter extends java.util.logging.Formatter{
        @Override
        public String format (LogRecord record){
            return record.getLevel() + ": "+ record.getMessage();
        }}}
