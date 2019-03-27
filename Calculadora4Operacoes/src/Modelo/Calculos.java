package Modelo;

public class Calculos extends absAtributos
{

    public Calculos(Double num1, Double num2, String operacao)
    {
        super(num1, num2, operacao);
        Calcular();
    }
    
    
    private void Calcular()
    {
        if (this.operacao.equals("+")) Somar();
        if (this.operacao.equals("-")) Subtrair();
        if (this.operacao.equals("*")) Multiplicar();
        if (this.operacao.equals("/")) Dividir();
        
    }
    
    private void Somar()
    {
        this.res = this.num1 + this.num2;
    }
    
    private void Subtrair()
    {
        this.res = this.num1 - this.num2;
    }
    
    private void Multiplicar()
    {
        this.res = this.num1 * this.num2;
    }
    
    private void Dividir()
    {
        this.res = this.num1 /this.num2;
    }

    
    
}
