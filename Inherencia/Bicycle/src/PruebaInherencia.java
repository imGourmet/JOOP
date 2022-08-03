class PruebaInherencia {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20,10,1);
        System.out.println("El quipo es: " + mountainBike.equipo);
        System.out.println("Altura de silla: " + mountainBike.alturaSilla);
        System.out.println("Velocidad de la bici : " + mountainBike.velocidad);

        mountainBike.aplicaFreno(5);
        System.out.println("La velocidad de la bici después de frenar es: " + mountainBike.velocidad);
    }    
}
