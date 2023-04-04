
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
    
        funcHor.setQtdeHorTrab(90);
        
        System.out.println("Funcionario Horista: " + funcHor.getNome());
        System.out.println("Salário Bruto   => " + 
                           df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto        => " +
                           df.format(funcHor.calcDesconto())); 
        System.out.println("Salário Liquido => " +
                           df. format(funcHor.calcSalLiquido()));
        
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(3434,
                                                            "Cleber Mensalista",
                                                            "03/08/1998",
                                                            1250.00);
        
        funcMen.setNumSalMin(4);
        
        System.out.println("\n\nFuncionario Mensalista: " + funcMen.getNome());
        System.out.println("Salário Bruto   => " + 
                           df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto        => " +
                           df.format(funcMen.calcDesconto())); 
        System.out.println("Salário Liquido => " +
                           df. format(funcMen.calcSalLiquido()));
    }
}
