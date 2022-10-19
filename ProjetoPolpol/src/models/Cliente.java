/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author 42labinfo
 */
public class Cliente extends Pessoa {
    private String endereco;
    private String cep;

    public Cliente() {
    }

    public Cliente(int id,String nome, String telefone, String email, String rg, String cpf,String endereco, String cep) {
        super(id, nome, telefone, email, rg, cpf);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente( int id, String nome, String telefone) {
        super(id, nome, telefone);
       
    }
    
   
    
    
}
