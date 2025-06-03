package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/estacionamento?useSSL=false&serverTimezone=America/Sao_Paulo";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public static Connection obterConexao() throws SQLException {
        return DriverManager.getConnection(URL,USUARIO,SENHA);
    }
}
