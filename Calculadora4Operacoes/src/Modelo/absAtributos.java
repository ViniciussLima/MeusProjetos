package Modelo;

public abstract class absAtributos 
{
    public Double num1;
    public Double num2;
    public String operacao;
    public Double res;
    
    public String numero1;
    public String numero2;
    public String mensagem;
    
    public String resultado;
    
    public absAtributos(Double num1, Double num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
    }
    
    public absAtributos(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        
    }
    
    public Double getRes()
    {
        return res;
    }
    
    public Double getNum1()
    {
        return num1;
    }

    public Double getNum2()
    {
        return num2;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public String getResultado()
    {
        return resultado;
    }
    
}
