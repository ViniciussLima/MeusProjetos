package Modelo;

public class Calculos
{
    private Double n1;
    private Double n2;
    private Double n3;
    public Double res;

    public Calculos()
    {
    }
    
    

    public Calculos(Double n1, Double n2)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.Somar();
    }

    public Calculos(Double n1, Double n2, Double n3)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        Somar3();
    }
    
    private void Somar3()
    {
        Somar();
        res += n3;
    }

    private void Somar()
    {
        this.res = this.n1 + this.n2;
    }
}
