package com.example.empresa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static String status = "Infelizmente não conectou...";

    public ConnectionFactory() {
    }
    public static java.sql.Connection getConexaoMySQL() throws SQLException {
        Connection connection = null;

        String serverName = "localhost:3306/";
        String myDatabase = "empresa";
        String url = "jdbc:mysql://" + serverName + myDatabase + "?autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "MYPASSWORD";

        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);


            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {

                status = ("STATUS--->Conectado com sucesso!");

            } else {

                status = ("STATUS---> sem conexão");

            }

            return connection;


        } catch (ClassNotFoundException e) {

            System.out.println("driver não conectado.");
            return null;

        } catch (SQLException e) {
            System.out.println("sem conexão com o Banco de Dados.");
            return null;
        }

    }
    public static String statusConnection() {
        return status;
    }
    public static boolean FinalizarConexao() {
        try {
            ConnectionFactory.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }


    public static java.sql.Connection ReiniciarConexao() throws SQLException {
        FinalizarConexao();
        return ConnectionFactory.getConexaoMySQL();

    }


}
