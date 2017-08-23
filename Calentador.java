class Calentador
{
    int temperatura;
    
    Calentador()
    {
        temperatura = 15;    
    }
    
    void calentar()
    {
        temperatura = temperatura + 5;
    }
    
    void enfriar()
    {
        temperatura = temperatura - 5;
    }
    
    int visualizarTemperatura()
    {
       return temperatura;
    }
}
