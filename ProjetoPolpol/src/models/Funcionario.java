/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author 42labinfo
 */
public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario() {
    }

    public Funcionario(float salario, int id, String nome, String telefone) {
        super(id, nome, telefone);
        this.salario = salario;
    }

    public Funcionario(float salario, String nome, String telefone, String email, String rg, String cpf) {
        super(nome, telefone, email, rg, cpf);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
