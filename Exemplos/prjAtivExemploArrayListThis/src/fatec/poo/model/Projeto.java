
package fatec.poo.model;

import java.util.ArrayList;

public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private ArrayList<Funcionario> funcionarios;
    
    public Projeto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public void addFuncionario(Funcionario func){
        funcionarios.add(func);
        func.setProjeto(this);
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    public void listarFuncionarios(){
        System.out.print("\nCodigo: " + codigo);
        System.out.print("\nDescrição: " + descricao);
        System.out.print("\nData de inicio: " + dtInicio);
        System.out.print("\nData de termino: " + dtTermino);
        System.out.print("\nNumero de Funcionarios: " + funcionarios.size());
        
        System.out.print("\nRegistro\t\tNome\t\tCargo\t\tDepartamento");
        for(int i = 0; i < funcionarios.size(); i++)
        {
            System.out.print("\n" + funcionarios.get(i).getRegistro() + "\t\t" 
                             + funcionarios.get(i).getNome() + "\t\t" 
                             + funcionarios.get(i).getCargo() + "\t\t"
                             + funcionarios.get(i).getDepartamento().getNome());
        }
        
        System.out.print("\n\n");
    }
}
