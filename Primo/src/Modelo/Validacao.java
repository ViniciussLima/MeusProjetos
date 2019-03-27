package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
        ValidarNumero();
    }
    
    private void ValidarNumero()
    {
        setMensagem("");
        try
        {
            setNum(Integer.parseInt(getNumero()));
        }
        catch (Exception e)
        {
            setMensagem("Número inválido");
        }
    }

}
