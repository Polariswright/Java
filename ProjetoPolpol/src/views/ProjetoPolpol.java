/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package views;

import models.Cliente;

/**
 *
 * @author 42labinfo
 */
public class ProjetoPolpol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = new String();
        nome = "Polaris";
        
        Cliente cliente2 = new Cliente( 1, "polaris", "(21)2121-22121");
        Cliente cliente1 = new Cliente();
        
        System.out.println("Cliente2:"+cliente2.getId()+"-"+cliente2.getNome()+"-"+cliente2.getTelefone());
        
    }
    
}
