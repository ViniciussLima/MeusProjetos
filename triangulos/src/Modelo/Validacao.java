package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        Validar();
    }
    private void Validar()
    {
        setMensagem("");
        try
        {
            setL1(Double.parseDouble(getLado1()));
            setL2(Double.parseDouble(getLado2()));
            setL3(Double.parseDouble(getLado3()));
            if (getL1() + getL2() > getL3() &&
                    getL2() + getL3() > getL1() &&
                    getL1() + getL3() > getL2())
            {
                setMensagem("");
            }
            else
            {
                setMensagem("Não é triângulo");
            }
        }
        catch (Exception e)
        {
            setMensagem("Número inválido");
        }
    }

}
