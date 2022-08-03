

//EN - CAPSULACIÓN:
// PROTEGER LOS ATRIBUTOS DE LAS CLASES PARA
// RESTRINGIR SU USO EN LA CLASE

public class Estudiante {
        
    private String nombre;   //HACEMOS PRIVADOS
    private int edad;        //LOS ATRIBUTOS
    private String dirección;//PARA EVITAR SU USO FUERA DE LA CLASE
    
    //SIN EMBARGO MANTENEMOS PUBLICO AL CREADOR DE 
    //OBJETOS PARA PODER CREAR ESTUDIANTES "DESDE FUERA"                    
    public Estudiante(String nombre,
                    int edad,
                    String dirección){
        this.nombre = nombre;               
        this.edad = edad;
        this.dirección = dirección;
                    }


    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirección() {
        return this.dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    
    public String toString(){
        return ("El estudiante se llama:  " + this.getNombre() + 
                ", de edad: " + this.getEdad() +
                " con dirección: " + 
                this.getDirección());
    }
    public static void main(String[] args){
        Estudiante juan = new Estudiante("Juan", 25,
                                 "54 Gascona, Oviedo");
    //  Nombre objeto = new(usado para crear nuevos
    //                      objetos o instanicas) + Constructor(ATRIBUTOS) 
        
        System.out.println(juan.toString());   
        
    }
}