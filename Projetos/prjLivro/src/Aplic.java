import java.util.Scanner;
import fatec.poo.model.Livro;


public class Aplic {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int dias, op, identificacao;
        boolean situacao = false;
        double valMultaDiaria, multa;
        
        Livro objLivro = new Livro();
        
        System.out.print("Digite a identificacao do livro: ");
        identificacao = entrada.nextInt();
        
        System.out.print("\nDigite o valor da multa diaria a ser cobrada: ");
        valMultaDiaria = entrada.nextDouble();
        
        objLivro.setIdentificacao(identificacao);
        objLivro.setValMultaDiaria(valMultaDiaria);
        objLivro.setSituacao(situacao);
        
        do
        {
            System.out.print("\n1 - Consultar livro");
            System.out.print("\n2 - Emprestar livro");
            System.out.print("\n3 - Devolver livro");
            System.out.print("\n4 - Sair");
            System.out.print("\n\nDigite a opção: ");
            op = entrada.nextInt();
            
            situacao = objLivro.getSituacao();
            
            switch(op)
            {
                case 1:
                    if(situacao == false)
                        System.out.println("O livro está disponível.");
                    else
                        System.out.println("O livro está emprestado.");
                    break;
                    
                case 2:
                    if(situacao == false)
                    {
                        objLivro.emprestar();
                        System.out.println("O livro foi emprestado com sucesso.");
                    }
                    else
                        System.out.println("O livro já está emprestado.");
                    break;
                        
                case 3:
                    if(situacao == false)
                        System.out.println("O livro já está disponível.");
                    else
                    {
                        System.out.println("Insira, se tiveram, os dias de atraso");
                        dias = entrada.nextInt();
                        
                        multa = objLivro.devolver(dias);
                        
                        if(dias > 0)
                            System.out.println("O livro foi devolvido e o valor pelo atraso é de: " + multa);
                        else
                            System.out.println("O livro foi devolvido sem multa.");
                    }
                    break;
                
                case 4:
                    break;
                    
                default:
                    System.out.println("Opcao invalida, digite novamente.");
                    break;
            }
            
        } while(op != 4);
        
    }
    
}
