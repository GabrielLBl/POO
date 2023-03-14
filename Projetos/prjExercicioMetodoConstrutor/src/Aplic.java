import fatec.poo.model.Circulo;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) 
    {
      Scanner entrada = new Scanner(System.in);
      
      double raio;
      String uniMedCirc;
      
      System.out.print("Digite a unidade de medida: ");
      uniMedCirc = entrada.next();
      
      Circulo objCirc = new Circulo(uniMedCirc);
      
      System.out.print("Digite a medida do raio: ");
      raio = entrada.nextDouble();
      
      objCirc.setRaio(raio);
      
      System.out.println("O raio é: " + objCirc.getRaio() + " " +objCirc.getUnidadeMedida());
      System.out.println("A área calculada é: " + objCirc.calcArea() + " " +objCirc.getUnidadeMedida() + "²");
      System.out.println("O perímetro calculado é: " + objCirc.calcPerimetro() + " " +objCirc.getUnidadeMedida());
      System.out.println("O diâmetro calculado é: " + objCirc.calcDiametro() + " " +objCirc.getUnidadeMedida());
      
    }
}
