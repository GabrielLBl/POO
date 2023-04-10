package fatec.poo.model;

public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        situacao = false;
    }
    
    public void reservar(int RG) {
        situacao = true;
    }
    
    public double liberar(int dias) {
        totalFaturado = totalFaturado + dias * valorDiaria;
        numRG = 0;
        situacao = false;
        return(dias * valorDiaria);
    }

    public int getNumQuarto() {
        return numQuarto;
    }
    


    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
}
