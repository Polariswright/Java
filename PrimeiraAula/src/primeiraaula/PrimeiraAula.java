/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiraaula;

import java.util.Scanner;

public class PrimeiraAula {

   
    public static void main(String[] args) {
        System.out.println("ola mundo!");
        System.out.println("Java é muito facil");
        linha();
        String nome = "Polaris";
        System.out.println("nome");
        System.out.println("Nome:" + nome);
        System.out.printf("Nome: %s\n",nome);
        linha();
        /*
        PRINTF pode ser usado com formatações que aceita determinados tipos de 
        variaveis 
        %s - string
        %d - numeros inteiros
        %f - numeros com pontos flutuantes(casas decimais)
        %.2f - numeros flutuantes com 2 csas decimais
        
        */
        //declaração de inteiros
        int n1 = 5;
        int n2 = 10;
        int tot = n1 + n2;
        
        System.out.println(n1 + "+" + n2 + "=" + tot );
        linha();
        System.out.printf("%s: %d + %d = %d \n" , nome,n1,n2,tot);
        
        //declaração de Floats
        
        float preco = 8.5f;
        System.out.println("o preço é"+preco);
        System.out.printf("O preço é %.2f\n",preco);
        linha();
        System.out.printf("O %s gasto %.2f no lanche de hoje \n",nome,preco);
        linha();
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome:");
        String nome2 = teclado.nextLine();
        
        System.out.printf("Olá %s, bem vindo ao SENAC MADUREIRA \n",nome2);
    }
    public static void linha(){
        System.out.println("*************************************");
    }
    
}
