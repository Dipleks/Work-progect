package newDB;

import java.io.*;
import java.sql.*;

public class NewDBinJava
{
    static String db = "testnewdb"; // имя БД
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5433/"; //URL БД и название БД
    static final String USER = "postgres"; //Вводим логин к БД
    static final String PASS = "353808"; //Вводим пароль к БД

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        db();

    }
    private static void db() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер PostgreSQL JDBC не найден. Включите его в путь к библиотеке!");
            e.printStackTrace();
            return;
        }

        Connection connection;
        boolean haveBase;
        try {
            connection = DriverManager
                    .getConnection(DB_URL + db, USER, PASS);
            haveBase = true;
        } catch (Exception e) {
            haveBase = false;
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);
            if (!haveBase) {
                Statement statement = connection.createStatement();
                statement.executeUpdate("CREATE DATABASE testnewdb");
            }
        }
    }
}
