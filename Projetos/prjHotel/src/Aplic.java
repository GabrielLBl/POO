
import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        QuartoHotel[] matHotel = new QuartoHotel[10];
        
        int i, numQuarto, op, j;
        double valorDiaria;
        
        for(i = 0; i < 10; i++){
            System.out.print("Informe o número do quarto: ");
            numQuarto = entrada.nextInt();
            
            System.out.print("Informe o valor diário do quarto: ");
            valorDiaria = entrada.nextDouble();
            
            matHotel[i] = new QuartoHotel(numQuarto, valorDiaria);
            
            System.out.print("\n");
        }
        
        do {
            System.out.print("\n1 - Consultar quarto");
            System.out.print("\n2 - Reservar quarto");
            System.out.print("\n3 - Liberar quarto");
            System.out.print("\n4 - Consultar faturamento quarto");
            System.out.print("\n5 - Consultar faturamento hotel");
            System.out.print("\n6 - Sair");
            System.out.print("\n\nDigite a opção: ");
            op = entrada.nextInt();
            j = 0;
            
            switch(op)
            {
                case 1:
                    System.out.print("Informe o número do quarto: ");
                    numQuarto = entrada.nextInt();
                    
                     for(i = 0; i < matHotel.length; i++)
                    {
                        if(matHotel[i].getNumQuarto() == numQuarto)
                        {
                            if(matHotel[i].getSituacao() == true)
                                System.out.print("O quarto: " + matHotel[i].getNumQuarto() + " está ocupado" + "\n");
                            else
                                System.out.print("O quarto: " + matHotel[i].getNumQuarto() + " está livre" + "\n");
                            break;
                        }
                        
                        else
                            j++;
                    }
                    
                    if(j == matHotel.length)
                        System.out.print("\nQuarto não cadastrado.\n");
                    
                case 2:
                    
            }
            
        } while(op != 6);
        
        
    }
    
}
