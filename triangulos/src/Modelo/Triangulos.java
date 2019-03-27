package Modelo;

public class Triangulos extends absPropriedades
{

    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
        Verificar();
    }
    
    private void Verificar()
    {
        if (getL1().equals(getL2()) && getL2().equals(getL3()))
        {
            setResposta("Triângulo equilátero");
        }
        else
        {
            if (!getL1().equals(getL2()) &&
                    !getL2().equals(getL3()) &&
                    !getL1().equals(getL3()))
            {
                setResposta("Triângulo Escaleno");
            }
            else
            {
                setResposta("Triângulo Isósceles");
            }
        }
                
    }

}
