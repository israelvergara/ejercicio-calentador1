class Calentador
{
    int temperatura;
    int incremento;
    
    Calentador()
    {
        temperatura = 15;    
        incremento = 3;
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
