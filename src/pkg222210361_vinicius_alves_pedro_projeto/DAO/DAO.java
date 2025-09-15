/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210361_vinicius_alves_pedro_projeto.DAO;

import java.sql.*;
import pkg222210361_vinicius_alves_pedro_projeto.model.Historico;

/**
 * 
 * Classe DAO (Objeto de Acesso a Dados).
 * @author vinic
 */
public class DAO {

    private Connection conn;

    public DAO(Connection conn) {
        this.conn = conn;
    }

    /**
     * Função que executa comandos SQL além de capturar exceção para fins de indicação.
     * @param contas
     * @throws SQLException 
     */
    public void insert(Historico contas) throws SQLException {
        String sql = "INSERT INTO historico(contas, resultados) VALUES (?, ?)";

        for (int i = 0; i < contas.resultados().size(); i++) {
            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setString(1, contas.contas().get(i));
            ps.setDouble(2, contas.resultados().get(i));

            ps.execute();
        }
        conn.close();
    }
}
