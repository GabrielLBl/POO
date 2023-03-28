
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.util.Scanner;


public class Aplic {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Instrutor objInst = new Instrutor(123, "Carlos Tenis", "1599348593");
        Cliente objCli = new Cliente("538395934-75", "GB Clientela", "15349534959");
        
        objInst.setAreaAtuacao("Cardio");
        System.out.println("Identificacao: " + objInst.getIdentificacao());
        System.out.println("Area de atuacao: " + objInst.getAreaAtuacao());
        System.out.println("Nome: " + objInst.getNome());
        System.out.println("Telefone: " + objInst.getTelefone());
        
        System.out.print("\n");
        
        objCli.setAltura(1.90);
        objCli.setPeso(86);
        System.out.println("CPF: " + objCli.getCpf());
        System.out.println("Nome: " + objCli.getNome());
        System.out.println("Telefone: " + objCli.getTelefone());
        System.out.println("Altura: " + objCli.getAltura());
        System.out.println("Peso: " + objCli.getPeso());
        System.out.println("IMC: " + objCli.calcImc());
    }
    
}
