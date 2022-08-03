


public class DemoAbstracción{

    //RECORDEMOS QUE LAS CLASES ABSTRACTAS
    //NO SE PUEDEN INIZIALIZAR, SE INVOCAN SUS MÉTODOS INDIRECTAMENTE:
    public static void main(String[] args) {
        ObjetoGráfico círculo = new Círculo();
        círculo.dibujar();
        círculo.redimensionar();
        
        ObjetoGráfico rectángulo = new Rectángulo();
        rectángulo.dibujar();
        rectángulo.redimensionar();
    
        
    }
}