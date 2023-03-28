
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;


public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //Instanciação de um objeto da classe Aluno
        Aluno objAluno = new Aluno(1010, "GB ReiDelas", "24/03/2003");
        
        objAluno.setMensalidade(1500);
        System.out.println("Registro Escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        System.out.print("\n");
        
        Professor objProf = new Professor(345, "Dimas ReiDelas", "11/03/1958");
        
        objProf.setSalario(3250);
        System.out.println("Registro Funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data Nascimento: " + objProf.getDataNascimento());
        System.out.println("Salario: " + df.format(objProf.getSalario()));
    }
}
