class Calentador
{
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
    private int nuevoIncremento;
        
    public Calentador(int tempMin, int tempMax)
    {
        temperatura = 15;    
        incremento = 3;
        min = tempMin;
        max = tempMax;
    }
    
    public void calentar()
    {
        if(temperatura+ incremento < max)
        {
             temperatura += incremento;
        }
    }
    
    public void enfriar()
    {
        if(temperatura - incremento > min)
        {
            temperatura -= incremento;
        }
    }
    
    public int visualizarTemperatura()
    {
       return temperatura;
    }
    
     public void modificaIncremento(int nuevoIncremento)
    {
        if(nuevoIncremento > 0)
        {
            incremento = nuevoIncremento;
        }
    }
}
