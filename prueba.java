import java.util.List;

class Trayecto{
    private List<Parada> paradas;
    
    public Time calcularTiempoDeDemora() {
        for (Parada parada : paradas) {
            demoraTotal += parada.calcularDemora();}
        return demoraTotal;
    }   	
	
}

class Parada{
    private Direccion destino;
    private Direccion origen;
    private Time tiempoTranscurrido;
    private Time tiempoDetenido;    
 	
    private float variacionPosicion(){
        //Calculo de velocidad a partir de la variacion de la posicion respecto al tiempo transcurrido   
	}    

    public Time calcularDemora(){
        DistanceMatrixAPI distanceMatrixAPI = new DistanceMatrixAPI();
        float distancia = distanceMatrixAPI.calcularDistancia(this.direccionInicial, this.direccionFinal);
        Time tiempoDemora = distancia / this.variacionPosicion() + tiempoDetenido;
        return tiempoDemora;
    }
}