package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String numero)
    {
        super(numero);
        Executar();
    }
    
    private void Executar()
    {
        Validacao validacao = new Validacao(getNumero());
        if (validacao.getMensagem().equals(""))
        {
            Primo primo = new Primo(validacao.getNum());
            setMensagem(primo.getMensagem());
        }
        else
        {
            setMensagem(validacao.getMensagem());
        }
    }

}
