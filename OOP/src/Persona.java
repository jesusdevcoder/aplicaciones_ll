public class Persona {

    private int edad;

    //constructor
    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void mostaredad(){
        System.out.println("edad de la persona " + edad);
    }
}
