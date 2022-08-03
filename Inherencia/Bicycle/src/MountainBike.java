class MountainBike extends Bicicleta {
                    //---> con extends la clase M-B heredará 
                    //los atributos de la clase Bicycle

    public int alturaSilla;//--> Atributo específico de la clase M-B

    public MountainBike(int alturaInicial,// atributo específico
                        int velocidadInicial,// + atributos clase padre
                        int equipoInicial){
        super(velocidadInicial, equipoInicial);
        // --> método super invoca el 
        //constructor de la clase padre
        this.alturaSilla = alturaInicial;
    }
    
}
