package Modelo;

public class Primo extends absPropriedades
{

    public Primo(int num)
    {
        super(num);
        VerificarPrimo();
    }
    
    private void VerificarPrimo()
    {
        setMensagem("É primo");
        for (int i = 2; i < getNum() / 2 + 1; i++)
        {
            if (getNum() % i == 0)
            {
                setMensagem("Não é primo");
                break;
            }
        }
    }

}
