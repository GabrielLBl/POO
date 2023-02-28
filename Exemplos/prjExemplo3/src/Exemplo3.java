
import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int num, res, i = 1;
        
        System.out.print("Digite o número a ser tabuado: ");
        num = entrada.nextInt();
        
        while(i <= 10)
        {
            res = i * num;
            System.out.println("\n" + num + " multiplicado por " + i + " é igual a: " + res);
            i++;
        }
    }
    
}
