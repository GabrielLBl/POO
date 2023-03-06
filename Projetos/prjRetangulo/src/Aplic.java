import fatec.poo.model.Retangulo;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) 
    {
        double medAlt, medBase;
        
        //Instanciações das classes Scanner e Retangulo
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //Passagem de mensagens para os objetos da classe Retangulo
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("\nMedida da altura: " + objRet.getAltura());
        System.out.println("\nMedida da base: " + objRet.getBase());
        
        System.out.println("Medida do perimetro: " + objRet.calcPerimetro());
        System.out.println("Medida da area: " + objRet.calcArea());
        
    }
    
}
