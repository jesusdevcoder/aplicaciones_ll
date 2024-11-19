public class Main {
    public static void main(String[] args) {
        // Crear un objeto Carro
        Carro miCarro = new Carro("Toyota", 15000);

        // Usar el getter para acceder a la marca del carro
        System.out.println("Marca del carro: " + miCarro.getMarca());

        // Mostrar la información completa del carro
        miCarro.mostrarInformacion();

        // Usar el setter para modificar la marca
        miCarro.setMarca("Honda");
        System.out.println("Nueva marca del carro: " + miCarro.getMarca());

         Persona yo = new Persona(12);
         yo.mostaredad();
    }
}