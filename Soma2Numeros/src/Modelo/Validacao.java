package Modelo;

public class Validacao
{
    public String numero1;
    public String numero2;
    public String mensagem;
    public Double n1;
    public Double n2;
    
    public void Validar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(numero1);
            this.n2 = Double.parseDouble(numero2);
        }
        catch (Exception e)
        {
            this.mensagem = "Número inválido";
        }
    }
}
