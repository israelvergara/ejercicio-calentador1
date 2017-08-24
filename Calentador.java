class Calentador
{
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
        
    Calentador(int min, int max)
    {
        temperatura = 15;    
        incremento = 3;
    }
    
    public void calentar()
    {
        if( temperatura +incremento < max)
        {
            temperatura = temperatura + incremento;
        }
    }
    
    public void enfriar()
    {
        if(temperatura -incremento > min)
        {
            temperatura = temperatura - incremento;
        }
    }
    
    public int visualizarTemperatura()
    {
       return temperatura;
    }
    
}
