/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210361_vinicius_alves_pedro_projeto.DAO;

import java.sql.*;

/**
 * Classe que cria a conexão com o banco de dados.
 * @author vinic
 */
public class Conexao {
    /**
     * Inseridos local, porta, e senha, para que a conexão seja estabelecida.
     * @return
     * @throws SQLException 
     */
    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "0000"
        );
        return conexao;
    }
}
