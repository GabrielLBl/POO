import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010,
                                                             "Pedro Silveira",
                                                             "14/05/78",
                                                             15.80);
        
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020,
                                                                   "Ana Beatriz",
                                                                   "22/07/88",
                                                                   600);
        
        funcMen.setCargo("Aux. Administrativo");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        funcCom.setCargo("Vendedor");
       
        //Instanciação de objetos da 
        //classe Departamento    
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
        
        Projeto objProj1 = new Projeto(1438, "Aumentar Lucros");
        Projeto objProj2 = new Projeto(4954, "Diminuir os gastos");
        
        objProj1.setDtInicio("24/04/2023");
        objProj1.setDtTermino("30/04/2023");
        
        objProj2.setDtInicio("24/04/2023");
        objProj2.setDtTermino("15/05/2023");
        
        objDep1.addFuncionario(funcHor);
        objDep1.addFuncionario(funcMen);
        objDep2.addFuncionario(funcCom);
        objProj1.addFuncionario(funcHor);
        objProj1.addFuncionario(funcMen);
        objProj1.addFuncionario(funcCom);
         
       
       System.out.println("O funcionário horista " + funcHor.getNome() + " trabalha no departamento de " + funcHor.getDepartamento().getNome());
       System.out.println("O funcionário mensalista " + funcMen.getNome() + " trabalha no departamento de " + funcMen.getDepartamento().getNome());
       System.out.println("O funcionário comissionado " + funcCom.getNome() + " trabalha no departamento de " + funcCom.getDepartamento().getNome());
       
       //Estabelecendo a associação binária entre um
       //objeto da classe Departamento com 1 ou mais (1..*)
       //objetos da classe FuncionarioHorista, FuncionarioMensalista
       //e FuncionarioComissionado
       objDep2.listarFuncionarios();
       
       objProj1.listarFuncionarios();
    }    
}
