package fatec.poo.model;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmisao;
    private String cargo;

    public Funcionario(int registro, String nome, String dtAdmisao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmisao = dtAdmisao;
    }

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }

    public String getDtAdmisao() {
        return dtAdmisao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
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
