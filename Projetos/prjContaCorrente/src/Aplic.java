import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numConta, op = 0;
        double saldoIni, deposito, saque;
        
        System.out.print("Informe o número da conta: ");
        numConta = entrada.nextInt();
        
        System.out.print("Informe o saldo inicial da conta: ");
        saldoIni = entrada.nextDouble();
        
        ContaCorrente objConta = new ContaCorrente(numConta, saldoIni);
        
        do
        {
            System.out.print("\n1 - Depositar");
            System.out.print("\n2 - Sacar");
            System.out.print("\n3 - Consultar Saldo");
            System.out.print("\n4 - Sair");
            System.out.print("\n\nDigite a opção: ");
            op = entrada.nextInt();
            
            switch(op)
            {
                case 1:
                    System.out.print("Insira o valor a ser depositado: ");
                    deposito = entrada.nextDouble();
                    objConta.depositar(deposito);
                    System.out.print("Foram depositados: " + deposito + " reai(s) na conta de número: " + objConta.getNumero() + "\n");
                    break;
                
                case 2:
                    System.out.print("Insira o valor a ser sacado: ");
                    saque = entrada.nextDouble();
                    
                    if(saque > objConta.getSaldo())
                        System.out.print("Saldo insuficiente para operação.\n");
                    else
                    {
                        objConta.sacar(saque);
                        System.out.print("Foram sacados: " + saque + " reai(s) na conta de número: " + objConta.getNumero() + "\n");
                    }
                    break;
                    
                case 3:
                    System.out.print("O saldo atual da conta número: " + objConta.getNumero() + " é de: " + objConta.getSaldo() + "\n");
                    break;
                
                case 4:
                    break;
                
                default:
                    System.out.print("Operacão inválida, digite novamente.");
                    
            }
        } while(op != 4);
        
        
    }
    
}
