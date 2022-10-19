/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author 42labinfo
 */
abstract class Pessoa {
    private int id;
    private String nome; 
    private String telefone; 
    private String email; 
    private String rg; 
    private String cpf; 

    public Pessoa() {
    
    }

    public Pessoa(int id, String nome, String telefone, String email, String rg, String cpf) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String telefone, String email, String rg, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Pessoa(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
        
    
         
    
}
