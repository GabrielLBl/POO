import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        
        double raio;
        int i;
        
        
        Circulo[] matCirc = new Circulo[10];
        
        for(i = 0; i < 10; i++)
        {
            matCirc[i] = new Circulo();
            
            System.out.print("Digite a medida de raio do Circulo " + (i + 1) + ": ");
            raio = entrada.nextDouble();
            
            matCirc[i].setRaio(raio);
            
        }
        
        for(i = 0; i < 10; i++)
        {
            System.out.println("Objeto Circulo " + (i + 1) + ": ");
            System.out.println("O raio é: " + df.format(matCirc[i].getRaio()));
            System.out.println("A área calculada é: " + df.format(matCirc[i].calcArea()));
            System.out.println("O perímetro calculado é: " + df.format(matCirc[i].calcPerimetro()));
            System.out.println("O diâmetro calculado é: " + df.format(matCirc[i].calcDiametro()));
            System.out.print("\n");
        }
    }
    
}
