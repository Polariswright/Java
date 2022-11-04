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
import models.Funcionario;

/**
 *
 * @author 42labinfo
 */
public class FuncionarioDAO {
    
    /**
     *
     * @param s
     * @throws SQLException
     */
    public void create(Funcionario f) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("insert into funcionario(nome,telefone,email,rg,cpf,salario) values(?,?,?,?,?,?)");
            sql.setString(1, f.getNome());
            sql.setString(2, f.getTelefone());
            sql.setString(3, f.getEmail());
            sql.setString(4, f.getRg());
            sql.setString(5, f.getCpf());
            sql.setFloat(6, f.getSalario());
            
            sql.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
    public List<Funcionario> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Funcionario> funcionarios = new ArrayList<>();
        
        try{
            sql = con.prepareStatement("Select * from funcionario");
            rs = sql.executeQuery();
            
            while(rs.next()){
               Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setSalario(rs.getFloat("salario"));
              
                
                funcionarios.add(funcionario); 
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de dados" + ex);
        }finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        
        
        
        return funcionarios;
        
        
        
    }
    public void update() throws SQLException{
        
    }
    public void delete() throws SQLException{
        
    }
    
    
}
