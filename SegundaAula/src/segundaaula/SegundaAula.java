
package segundaaula;


public class SegundaAula {
    public static void main(String[] args) {
        //string pra inteiro
      String valor = "30";
      int idade = Integer.parseInt(valor);
        System.out.printf("%d",idade);
        //string para float
      float idade2 = Float.parseFloat(valor);
        System.out.printf("%.1f\n", idade2);
        
      double idade3 = Double.parseDouble(valor);
    
      System.out.printf("%.2f\n",idade3);
      
      linha();
      
      //inteiro para string
      int valor4 = 30;
      String idade4 = Integer.toString(valor4);
        System.out.printf("%s\n",idade4);
        
        linha();
        
       //convertendo de float para string
       float valor5 = 3;
      String minecraft = Float.toString(valor5);
        System.out.printf("%s\n",minecraft);
        
    }
    
    public static void linha() {
        System.out.println("==============================================");
    }
}   
