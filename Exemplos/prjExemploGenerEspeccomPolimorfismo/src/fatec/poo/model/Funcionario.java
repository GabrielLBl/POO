package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmisao;

    public Funcionario(int registro, String nome, String dtAdmisao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmisao = dtAdmisao;
    }

    public String getNome() {
        return nome;
    }
    
    //Método abstrato
    //Apresenta a assinatura
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
