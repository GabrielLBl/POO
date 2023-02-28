import java.util.Scanner;

public class Exemplo1 {
    
    public static void main(String[] args) 
    {  
        Scanner entrada = new Scanner(System.in);
        int codProd, qtdeVend;
        String descProd;
        double precUnit, valCompra, desconto;
        
        System.out.print("Digite o código do produto: ");  //printf("zap");
        codProd = entrada.nextInt(); // scanf("%d", &codProd);
        
        System.out.print("Digite a descrição do produto: ");
        descProd = entrada.next(); // scanf("%s", descProd);
        
        System.out.print("Digite o preço unitário: ");
        precUnit = entrada.nextDouble(); //scanf("%lf", &precunit);
        
        System.out.print("Digite a qtde vendida: ");
        qtdeVend = entrada.nextInt(); // scanf("%d", &qtdeVend);
        valCompra = precUnit * qtdeVend;
        
        System.out.println("\nValor da compra: " + valCompra); // printf com variaveis
      
        if (valCompra >= 850)
            desconto = valCompra * 0.1;
        else
            desconto = 0;
        
        System.out.println("\nValor do desconto: " + desconto);
         
    }   //fim do main
} //fim da classe
