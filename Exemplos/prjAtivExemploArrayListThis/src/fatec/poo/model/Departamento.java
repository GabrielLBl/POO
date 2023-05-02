
package fatec.poo.model;

import java.util.ArrayList;


public class Departamento {
    private String sigla;
    private String nome;
    private ArrayList<Funcionario> funcionarios; //em plural para representar a multiplicidade 1..*

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new ArrayList<Funcionario>();
    }

    public String getSigla() {
        return sigla;
    }
    
    //tem como parametro de entrada o endereço de um
    //objeto da classe funcionariohorista,funcionario mensalista, ou funcionariocomissionado
    public void addFuncionario(Funcionario func)
    {
        funcionarios.add(func);
        func.setDepartamento(this); //horista, mensalista, comissionado
                                    // ------> departamento!!!
    }
    
    public void listarFuncionarios(){
        System.out.print("\nSigla: " + sigla);
        System.out.print("\nNome: " + nome);
        System.out.print("\nNumero de Funcionarios: " + funcionarios.size());
        
        System.out.print("\nRegistro\tNome\tCargo");
        for(int i = 0; i < funcionarios.size(); i++)
        {
            System.out.print("\n" + funcionarios.get(i).getRegistro() + "\t " 
                             + funcionarios.get(i).getNome() + "\t" 
                             + funcionarios.get(i).getCargo());
        }
        
        System.out.print("\n\n");
    }

    public String getNome() {
        return nome;
    }
}
