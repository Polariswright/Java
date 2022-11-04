/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
/**
 *
 *
 * @author 42labinfo
 */
public class ConnectionFactory {

    //declarando as variáveis
    private static final String DRIVER = "com.mysql.cj.jodb.Driver";
    private static final String URL = "jdcb:mysql://localhost:3306/dbsalao";
    private static final String USER = "root";
    private static final String PASS = "";

    //estabelecer a conexao com o database
    public static Connection getConnection() throws SQLException {

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erro de Conexão!", ex);
        }
    }

    public static void closeConnection(Connection con) {
        //fechar a conexao com o banco de dados
        try {
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro de Conexão!", ex);
        }
    }

    //fechar conexao com sql
    public static void closeConnection(Connection con, PreparedStatement sql) {
        closeConnection(con);
        try {
            if (sql != null) {
                sql.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro de Conexão!", ex);
        }
    }
    public static void closeConnection(Connection con, PreparedStatement sql, ResultSet rs) {
        closeConnection(con,sql);
        try {
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro de Conexão!", ex);
        }
    }

}
