
package fatec.poo.model;

public class FuncionarioComissionado extends Funcionario{
    double salBase;
    double taxaComissao;
    double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmisao, double taxaComissao) {
        super(registro, nome, dtAdmisao);
        this.taxaComissao = taxaComissao;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    public double getSalBase() {
        return salBase;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void addVendas(double vendas) {
        totalVendas = totalVendas + vendas;
    }
    
    public double calcSalBruto(){
        return(salBase + ((taxaComissao/100) * totalVendas));
    }
    
    public double calcGratificacao(){
        if(totalVendas <= 5000)
            return(0);
        else if(totalVendas <= 10000)
            return(calcSalBruto() * 0.03);
        else
            return(calcSalBruto() * 0.05);
    }
    
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
