import fatec.poo.model.Aluno;
import java.util.Scanner;


public class Aplic {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int ra;
        int check;
        double ntPrv1, ntPrv2, ntTrab1, ntTrab2;
        
        Aluno objAluno = new Aluno();
        
        System.out.print("Digite o seu RA: ");
        ra = entrada.nextInt();
        
        System.out.print("Digite a nota de sua Prova 1: ");
        ntPrv1 = entrada.nextDouble();
        
        System.out.print("Digite a nota de sua Prova 2: ");
        ntPrv2 = entrada.nextDouble();
        
        System.out.print("Digite a nota de seu Trabalho 1: ");
        ntTrab1 = entrada.nextDouble();
        
        System.out.print("Digite a nota de seu Trabalho 2: ");
        ntTrab2 = entrada.nextDouble();
        
        objAluno.setRA(ra);
        objAluno.setNtPrv1(ntPrv1);
        objAluno.setNtPrv2(ntPrv2);
        objAluno.setNtTrab1(ntTrab1);
        objAluno.setNtTrab2(ntTrab2);
        
        do
        {
            System.out.print("\n1 - Exibir a Nota das Provas/Trabalhos");
            System.out.print("\n2 - Exibir a Média dos Trabalhos/Provas");
            System.out.print("\n3 - Exibir a Média Final");
            System.out.print("\n4 - Sair");
        
            System.out.print("\n\nDigite a opção: ");
            check = entrada.nextInt();
            
            switch (check) 
            {
                case 1:
                    System.out.println("A nota da P1 é: " + objAluno.getNtPrv1() + "\nA Nota da P2 é: " +
                            objAluno.getNtPrv2() + "\nA Nota do Trab1 é: " + objAluno.getNtTrab1()
                            + "\nA nota do Trab2 é: " + objAluno.getNtTrab2());
                    break;
                    
                case 2:
                    System.out.println("A média das suas provas é: " + objAluno.calcMediaProva() + "\nA média de seus trabalhos é: " + objAluno.calcMediaTrab());
                    break;
                    
                case 3:
                    System.out.println("A sua média final é: " + objAluno.calcMediaFinal());
                    if(objAluno.calcMediaFinal() >= 6)
                        System.out.println("A média foi superior a 6 e o aluno passou!");
                    else
                        System.out.println("A média não atingiu o mínimo e o aluno reprovou.");
                    break;
                    
                default:
                    System.out.println("Opcao inválida, digite novamente.");
                    break;
            }
                
        } while(check != 4);
    }
    
}
