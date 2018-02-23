
/**
 * Write a description of class Persona here.
 *
 * @author (David)
 * @version (23/02/2018)
 */
public class Persona
{
    // Indica el nombre de la persona
    private String nombre;
    // Indica si esa persona es un hombre
    private boolean hombre;
    // Indica el peso de la persona
    private int peso;
    // Indica la altura de la persona
    private int altura;
    // Indica la edad de la persona
    private int edad;
    // Indica la cantidad de calorias ingeridas
    private int caloriasIngeridas;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, boolean hombre, int peso, int altura, int edad)
    {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        int caloriasIngeridas = 0;
    }

    /**
     * Metodo para dar de comer una comida
     */
    public int comer(Comida comida){
        int ingesta = -1;
        int caloriasComida = comida.getCalorias();
        if(hombre == true){
            if ((peso*10)+(altura*6)+(edad*5)+5 >= caloriasIngeridas){
                ingesta = comida.getCalorias();
                caloriasIngeridas += ingesta;
            }
        }
        if(hombre != true){
            if((peso*10)+(altura*6)+(edad*5)-161 >= caloriasIngeridas){
                ingesta = comida.getCalorias();
                caloriasIngeridas += ingesta;
            }
        }
        return ingesta;
    }

    /**
     * Metodo getter de caloriasIngeridas
     */
    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }
}
