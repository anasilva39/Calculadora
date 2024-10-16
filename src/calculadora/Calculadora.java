
package calculadora;



import java.util.Scanner;


public class Calculadora {

    
    public static void main(String[] args) {
        
        float num1,num2;
        float result =0;
        String operacao;
        
        Scanner ent = new Scanner(System.in);
        
        System.out.println("-----------------------");
        System.out.println("  Escolha a operação   ");
        System.out.println("   + - Adição          ");
        System.out.println("   - - Subtração       ");
        System.out.println("   * - Multiplicação   ");
        System.out.println("   / - Divisão         ");
        System.out.println("-----------------------");
        operacao = ent.next();
        System.out.println("Informe o Primeiro valor: ");
        num1 = ent.nextFloat();
        System.out.println("Informe o Segundo valor: ");
        num2 = ent.nextFloat();
        
        
        
        switch(operacao){
            case "+":
                result = (num1+num2);
                break;
            case "-":
                result = (num1-num2);
                break;
            case "*":
                result = (num1*num2);
                break;
            case "/":
                result = (num1/num2);
                break;
                
            default:
                System.out.println("Erro");
                break; 
                         
                  
        }
         System.out.println("O resultado é: "+result);
    }
    
}
