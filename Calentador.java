class Calentador
{
    private int temperatura;
    private int incremento;
    
    Calentador()
    {
        temperatura = 15;    
        incremento = 3;
    }
    
    public void calentar()
    {
        if(temperatura < 30)
        {
            temperatura = temperatura + incremento;
        }
    }
    
    public void enfriar()
    {
        if(temperatura  > -10)
        {
            temperatura = temperatura - incremento;
        }
    }
    
    public int visualizarTemperatura()
    {
       return temperatura;
    }
    
}
