
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
    // Indica si puede comer mas o no
    private int puedeComerMas;
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
        if(hombre){
            puedeComerMas = (peso*10)+(altura*6)+(edad*5)+5;
        }
        else{
            puedeComerMas = (peso*10)+(altura*6)+(edad*5)-161;
        }
    }

    /**
     * Metodo para dar de comer una comida
     */
    public int comer(Comida comida){
        int ingesta = -1;
        int caloriasComida = comida.getCalorias();
        if(hombre == true){
            if (puedeComerMas >= caloriasIngeridas){
                ingesta = comida.getCalorias();
                caloriasIngeridas += ingesta;
            }
        }
        if(hombre != true){
            if(puedeComerMas >= caloriasIngeridas){
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

    /**
     * Ahora queremos que sea posible preguntarle cosas a la persona.
     * Si no ha sobrepasado su metabolismo basal,
     * te contestará "SI" o "NO" (¡en mayúsculas!)
     * dependiendo de si la pregunta tiene una longitud (es decir, el número de letras de la misma) divisible por 3 o no, respectivamente
     * En caso de que la persona ya haya sobrepasado el metabolismo basal
     * o en el caso de que tu pregunta contenga el nombre de la persona, responderá con la misma pregunta que le has hecho pero gritando
     */
    public String contestar(String pregunta){
        String respuesta = "";
        if(caloriasIngeridas >= puedeComerMas || pregunta.contains(nombre)){
            respuesta = pregunta.toUpperCase();
        }
        else{
            if(pregunta.length()% 3 == 0){
                respuesta = "SI";
            }
            else{
                respuesta = "NO";
            }
        }
        System.out.println(respuesta);
        return respuesta;
    }
}
