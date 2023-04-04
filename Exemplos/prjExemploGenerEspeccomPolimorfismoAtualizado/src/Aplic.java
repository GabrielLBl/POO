
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                    "Pedro Silveira",
                                                    "14/05/1978",
                                                    15.80);
    
        funcHor.setCargo("Vidraceiro");
        funcHor.setQtdeHorTrab(90);
        
        System.out.println("Funcionario Horista: " + funcHor.getNome() 
                                                   + "\nRegistro: " + funcHor.getRegistro() 
                                                   + "\nAdmitido em: " + funcHor.getDtAdmisao()
                                                   + "\nCargo: " + funcHor.getCargo());
        
        System.out.println("\nSalário Bruto   => " + 
                           df.format(funcHor.calcSalBruto()));
        System.out.println("Gratificação   => " + 
                           df.format(funcHor.calcGratificacao()));
        System.out.println("Desconto        => " +
                           df.format(funcHor.calcDesconto())); 
        System.out.println("Salário Liquido => " +
                           df. format(funcHor.calcSalLiquido()));
        
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(3434,
                                                            "Cleber Mensalista",
                                                            "03/08/1998",
                                                            1250.00);
        
        funcMen.setCargo("Mecanico");
        funcMen.setNumSalMin(4);
        
        System.out.println("\n\nFuncionario Mensalista: " + funcMen.getNome() 
                                                          + "\nRegistro: " + funcMen.getRegistro() 
                                                          + "\nAdmitido em: " + funcMen.getDtAdmisao()
                                                          + "\nCargo: " + funcMen.getCargo());
        
        System.out.println("\nSalário Bruto   => " + 
                           df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto        => " +
                           df.format(funcMen.calcDesconto())); 
        System.out.println("Salário Liquido => " +
                           df. format(funcMen.calcSalLiquido()));
    }
}
