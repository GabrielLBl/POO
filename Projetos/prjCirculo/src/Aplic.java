import fatec.poo.model.Circulo;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) 
    {
      Scanner entrada = new Scanner(System.in);
      
      double raio;
      Circulo objCirc = new Circulo();
      
      System.out.print("Digite a medida do raio: ");
      raio = entrada.nextDouble();
      
      objCirc.setRaio(raio);
      
      System.out.println("O raio é: " + objCirc.getRaio());
      System.out.println("A área calculada é: " + objCirc.calcArea());
      System.out.println("O perímetro calculado é: " + objCirc.calcPerimetro());
      System.out.println("O diâmetro calculado é: " + objCirc.calcDiametro());
      
    }
}
