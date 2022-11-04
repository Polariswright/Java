/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.SQLException;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import models.Servico;

/**
 *
 * @author 42labinfo
 */
public class ServicoDAO {
    
    /**
     *
     * @param s
     * @throws SQLException
     */
    public void create(Servico s) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("insert into servico(descricao,valor) values(?,?)");
            sql.setString(1, s.getDescricao());
            sql.setFloat(2, s.getValor());
            
            sql.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
    public List<Servico> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Servico> servicos = new ArrayList<>();
        
        try{
            sql = con.prepareStatement("Select * from servico");
            rs = sql.executeQuery();
            
            while(rs.next()){
                Servico servico = new Servico();
                
                servico.setId(rs.getInt("id"));
                servico.setDescricao(rs.getString("descricao"));
                servico.setValor(rs.getFloat("valor"));
                
                servicos.add(servico); 
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de dados" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        
        
        
        return servicos;
        
        
        
    }
    public void update() throws SQLException{
        
    }
    public void delete() throws SQLException{
        
    }
    
    
}
