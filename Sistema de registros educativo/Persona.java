public abstract class Persona {
    private String cedula;
    private String nombre;
    private int edad;

    public Persona(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCedula() { return cedula; }
    public abstract void mostrarDatos();

    public String getNombre() {
        return nombre;
    }
}