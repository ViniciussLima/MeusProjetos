package Modelo;

public class Controle extends absAtributos
{

    public Controle(String numero1, String numero2, String operacao)
    {
        super(numero1, numero2, operacao);
        Executar();
    }
    

       
    private void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(
                this.numero1, this.numero2, this.operacao);
        if (validacao.getMensagem().equals(""))
        {
            Calculos calculos = new Calculos(
                    validacao.getNum1(), 
                    validacao.getNum2(), 
                    this.operacao);
            this.resultado = calculos.getRes().toString();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }

    
    
    
}
