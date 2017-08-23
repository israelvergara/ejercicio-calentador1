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
        if(temperatura < 30)
        {
            temperatura = temperatura + incremento;
        }
    }
    
    void enfriar()
    {
        if(temperatura  > -10)
        {
            temperatura = temperatura - incremento;
        }
    }
    
    int visualizarTemperatura()
    {
       return temperatura;
    }
    
}
