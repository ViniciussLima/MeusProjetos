package Modelo;

public class Validacao extends absAtributos
{

    public Validacao(String numero1, String numero2, String operacao)
    {
        super(numero1, numero2, operacao);
        ValidarNumeros();
        ValidarOperacao();
    }
    
    private void ValidarNumeros()
    {
        this.mensagem = "";
        try
        {
            this.num1 = Double.parseDouble(numero1);
        }
        catch (Exception e)
        {
            this.mensagem += "Número inválido no campo 1 \n";
        }
        try
        {
            this.num2 = Double.parseDouble(numero2);
        }
        catch (Exception e)
        {
            this.mensagem += "Número inválido no campo 2 \n";
        }
    }
    
    private void ValidarOperacao()
    {
        if (this.mensagem.equals(""))
        {
            if (this.operacao.equals("/")&& this.num2.equals(0.0))
            {
                this.mensagem = "Divisão por zero";
            }
        }
    }

    
    
}
