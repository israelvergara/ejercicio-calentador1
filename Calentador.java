/**
 * clase Calentador permite simular un calentador con un incremtneo de 3°C 
 * teniendo un limite de temparatura maxima de 30°C y una  minima de -10°C
 * cuenta con variables de instancia que son: temperatura guarda la temperaura 
 * inicial, incremento la cual contiene un incremento de la temperatura, min 
 * toma el valor minimo de la temperatura, max toma el valor maximo de la 
 * temperatura y nuevo incremento es el incremento que introduce el usuario.
 * 
 * En el Constructor se inicializan las siguientes variables de instancia con 
 * sus respectivos valores: temperatura = 15;
 *                          incremento = 3;
 *                          min = tempMin; el valor de tempMin lo inttroduce el usuario
 *                          max = tempMax; el valor de tempMin lo inttroduce el usuario
 * contiene los metodos calentar, enfriar, visualizarTemperatura y modifica incremento
 */
class Calentador
{
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
    private int nuevoIncremento;
        
    /**
     * constructor que inicializa las variables de instancia
     * temperatura, incremento, min y max.
     */
    public Calentador(int tempMin, int tempMax)
    {
        temperatura = 15;    
        incremento = 3;
        min = tempMin;
        max = tempMax;
    }
    
    /**
     * calentar simula que la temperatura incrementa
     */
    public void calentar()
    {
        if(temperatura + incremento < max)
        {
             temperatura += incremento;
        }
    }
    
    /**
     * enfriar simula que la temperatura disminuye
     */
    public void enfriar()
    {
        if(temperatura - incremento > min)
        {
            temperatura -= incremento;
        }
    }
    
   /**
    * visualiza la temperatura en pantalla
    * @return temperatura es la variable que contiene la temperatura. 
    */
    public int visualizarTemperatura()
    {
       return temperatura;
    }
   
   /**
    * modifica el incremento actual por uno que introduce el usuario.
    * @param nuevoIncremento es la variable que recibe el valor del nuevo incremento
    */
   public void modificaIncremento(int nuevoIncremento)
   {
        if(nuevoIncremento > 0)
        {
            incremento = nuevoIncremento;
        }
   }
}
