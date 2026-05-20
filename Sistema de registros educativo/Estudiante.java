public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String cedula, String nombre, int edad, String carrera) {
        super(cedula, nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Estudiante" +getNombre() + "| Cédula: " + getCedula() + " | Carrera: " + carrera);
    }
}