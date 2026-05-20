public class Docente extends Persona {
    private String asignatura;

    public Docente(String cedula, String nombre, int edad, String asignatura) {
        super(cedula, nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Docente:"+getNombre() + " | Cédula: " + getCedula() + " | Asignatura: " + asignatura);
    }
}