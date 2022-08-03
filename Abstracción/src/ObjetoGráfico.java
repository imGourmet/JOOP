//LAS CLASES ABSTRACTAS NO SE PUEDEN INZIALIZAR
//DESDE SÍ MISMAS.
//SON ÚTILES PARA CREAR SUBCLASES QUE LAS PUEDAN LLAMAR O INVOCAR
//HEREDANDO SUS METODOS O ATRIBUTOS, SIN REVELAR SU FUNCIONAMIENTO.


public abstract class ObjetoGráfico {
    int x, y;

    void moverA(int nuevoX,int nuevoY){
        System.out.println("Mover X a: " + "e Y: ");
    }
    abstract void dibujar();
    abstract void redimensionar();
}
