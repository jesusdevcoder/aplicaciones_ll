// Archivo: Carro.java
public class Carro {
    private String marca;
    private int kilometros;

    // Constructor de la clase Carro
    public Carro(String marca, int kilometros) {
        this.marca = marca;
        this.kilometros = kilometros;
    }


    //se pueden tener varios constructores en java los cuales esta asignara dependiendo los datos que le demos al crear el objeto

    // Método para mostrar información del carro
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Kilómetros: " + kilometros);
    }

    // Método getter para obtener la marca
    public String getMarca() {
        return this.marca;
    }

    // Método setter para modificar la marca (opcional)
    public void setMarca(String marca) {
        this.marca = marca;

    }



}
