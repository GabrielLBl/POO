
package fatec.poo.model;


public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private int numFunc;
    private Funcionario[] funcionarios;
    
    public Projeto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }
    
    public void addFuncionario(Funcionario func){
        funcionarios[numFunc] = func;
        numFunc++;
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
        System.out.print("\nNumero de Funcionarios: " + numFunc);
        
        System.out.print("\nRegistro\t\tNome\t\tCargo\t\tDepartamento");
        for(int i = 0; i < numFunc; i++)
        {
            System.out.print("\n" + funcionarios[i].getRegistro() + "\t\t" 
                             + funcionarios[i].getNome() + "\t\t" 
                             + funcionarios[i].getCargo() + "\t\t"
                             + funcionarios[i].getDepartamento().getNome());
        }
        
        System.out.print("\n\n");
    }
}
