package fatec.poo.model;

public class Aluno 
{
    private int ra;
    private double ntPrv1, ntPrv2, ntTrab1, ntTrab2;

    public int getRA() {
        return ra;
    }

    public void setRA(int ra) {
        this.ra = ra;
    }

    public double getNtPrv1() {
        return ntPrv1;
    }

    public void setNtPrv1(double ntPrv1) {
        this.ntPrv1 = ntPrv1;
    }

    public double getNtPrv2() {
        return ntPrv2;
    }

    public void setNtPrv2(double ntPrv2) {
        this.ntPrv2 = ntPrv2;
    }

    public double getNtTrab1() {
        return ntTrab1;
    }

    public void setNtTrab1(double ntTrab1) {
        this.ntTrab1 = ntTrab1;
    }

    public double getNtTrab2() {
        return ntTrab2;
    }

    public void setNtTrab2(double ntTrab2) {
        this.ntTrab2 = ntTrab2;
    }
    
    public double calcMediaProva()
    {
        return(0.75 *(ntPrv1 + 2 * ntPrv2)/3);
    }
    
    public double calcMediaTrab()
    {
        return(0.25 * (ntTrab1 + ntTrab2)/2);
    }
    
    public double calcMediaFinal()
    {
        return(calcMediaProva() + calcMediaTrab());
    }
}
