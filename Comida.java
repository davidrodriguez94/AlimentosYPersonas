/**
 * Write a description of class Comida here.
 *
 * @author (David Rodriguez)
 * @version (23/02/2018)
 */
public class Comida
{
    // Indica que comida es 
    private String comida;
    // Indica la cantidad de calorias asociada a la comida
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String comida, int calorias)
    {
        this.comida = comida;
        this.calorias = calorias;
    }
    
    public int getCalorias(){
        return calorias;
    }
}
