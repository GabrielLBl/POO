
import java.util.Scanner;


public class Exemplo2 {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int num, res;
        
        System.out.print("Digite o número a ser tabuado: ");
        num = entrada.nextInt();
        
        for(int i = 1; i <= 10; i++)
        {
            res = i * num;
            System.out.println("\n" + num + " multiplicado por " + i + " é igual a: " + res);
        }
    }
    
}
