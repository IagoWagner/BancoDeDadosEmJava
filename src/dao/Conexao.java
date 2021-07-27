package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Iago
 */
public class Conexao {
public Connection getConnection() throws SQLException{
Connection conexao = DriverManager.getConnection("jdbc:postgresql://"
        + "localhost:5432/BancoJava","postgres", "L_s321123S_l");
        return conexao;
        
    }
}
