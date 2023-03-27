import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        int numConta, op, i, j;
        double saldoIni, deposito, saque;
        
        ContaCorrente[] matBanco = new ContaCorrente[15];
        
        
        for(i = 0; i < 15; i++)
        {
            System.out.print("Informe o número da conta: ");
            numConta = entrada.nextInt();
        
            System.out.print("Informe o saldo inicial da conta: ");
            saldoIni = entrada.nextDouble();
            
            matBanco[i] = new ContaCorrente(numConta, saldoIni);
            
            System.out.print("\n");
        }
        
        do
        {
            System.out.print("\n1 - Depositar");
            System.out.print("\n2 - Sacar");
            System.out.print("\n3 - Consultar Saldo");
            System.out.print("\n4 - Listar Contas");
            System.out.print("\n5 - Sair");
            System.out.print("\n\nDigite a opção: ");
            op = entrada.nextInt();
            j = 0;
            
            switch(op)
            {
                case 1:
                    System.out.print("Informe o número da conta: ");
                    numConta = entrada.nextInt();
                    
                    for(i = 0; i < 15; i++)
                    {
                        if(matBanco[i].getNumero() == numConta)
                        {
                            System.out.print("Insira o valor a ser depositado: ");
                            deposito = entrada.nextDouble();
                            matBanco[i].depositar(deposito);
                            System.out.print("\nForam depositados: " + df.format(deposito) + " reai(s) na conta de número: " + matBanco[i].getNumero() + "\n");
                            break;
                        }
                        else
                            j++;
                    }
                    
                    if(j == 15)
                        System.out.print("\nConta não cadastradada.\n");
                    
                    break;
                
                case 2:
                    System.out.print("Informe o número da conta: ");
                    numConta = entrada.nextInt();
                    
                    for(i = 0; i < 15; i++)
                    {
                        if(matBanco[i].getNumero() == numConta)
                        {
                            System.out.print("Insira o valor a ser sacado: ");
                            saque = entrada.nextDouble();

                            if(saque > matBanco[i].getSaldo())
                                System.out.print("\nSaldo insuficiente para operação.\n");
                            else
                            {
                                matBanco[i].sacar(saque);
                                System.out.print("\nForam sacados: " + df.format(saque) + " reai(s) na conta de número: " + matBanco[i].getNumero() + "\n");
                            }
                            break;
                        }
                        else
                            j++;
                    }
                    
                    if(j == 15)
                        System.out.print("\nConta não cadastradada.\n");
                    
                    break;
                    
                case 3:
                    System.out.print("Informe o número da conta: ");
                    numConta = entrada.nextInt();
                    
                    for(i = 0; i < 15; i++)
                    {
                        if(matBanco[i].getNumero() == numConta)
                        {
                            System.out.print("\nO saldo atual da conta número: " + matBanco[i].getNumero() + " é de: " + df.format(matBanco[i].getSaldo()) + "\n");
                            break;
                        }
                        
                        else
                            j++;
                    }
                    
                    if(j == 15)
                        System.out.print("\nConta não cadastradada.\n");
                    
                    break;
                
                case 4:
                    System.out.printf("Número da conta\t\tSaldo\n");
                    for(i = 0; i < 15; i++)
                        System.out.printf("%5d\t\t\t%5s\n", matBanco[i].getNumero(), df.format(matBanco[i].getSaldo()));
                    break;
                
                case 5:
                    break;
                
                default:
                    System.out.print("\nOperacão inválida, digite novamente.\n");
                    
            }
        } while(op != 5);
        
        
    }
    
}
