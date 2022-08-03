class Bicicleta {
    
    protected int equipo;//-> valores protected accesibles
    protected int velocidad;// en las subclases
    
    public Bicicleta(int velocidadInicial, int equipoInicial){
        equipo = equipoInicial;
        velocidad = velocidadInicial;
    }

    public void setequipo(int nuevoValor){
        equipo = nuevoValor;
    }

    public void aplicaFreno(int decrecimiento){
        velocidad -= decrecimiento;
    }

    public void subeVelocidad(int incremento){
        velocidad += incremento;
    }


}

