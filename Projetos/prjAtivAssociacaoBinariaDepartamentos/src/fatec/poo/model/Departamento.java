
package fatec.poo.model;


public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //em plural para representar a multiplicidade 1...*
    private int numFunc; //representa o indice da matriz

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }
    
    //tem como parametro de entrada o endereço de um
    //objeto da classe funcionariohorista,funcionario mensalista, ou funcionariocomissionado
    public void addFuncionario(Funcionario func)
    {
        funcionarios[numFunc] = func;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.print("\nSigla: " + sigla);
        System.out.print("\nNome: " + nome);
        System.out.print("\nNumero de Funcionarios: " + numFunc);
        
        System.out.print("\nRegistro\tNome\tCargo");
        for(int i = 0; i < numFunc; i++)
        {
            System.out.print("\n" + funcionarios[i].getRegistro() + "\t " 
                             + funcionarios[i].getNome() + "\t" 
                             + funcionarios[i].getCargo());
        }
        
        System.out.print("\n\n");
    }

    public String getNome() {
        return nome;
    }
}
