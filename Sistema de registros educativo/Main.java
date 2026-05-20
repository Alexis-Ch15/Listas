import java.util.*;

public class Main {
    static ArrayList<Persona> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar");
            System.out.println("2. Mostrar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch(opcion) {
                    case 1: registrar(); break;
                    case 2: mostrar(); break;
                    case 3: actualizar(); break;
                    case 4: eliminar(); break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar solo números.");
            }
        } while (opcion != 5);
    }

    private static void registrar() {
        System.out.print("Tipo\n1.Estudiante\n2.Docente\n: ");
        int tipo = Integer.parseInt(sc.nextLine());
        System.out.print("Cedula: "); String ced = sc.nextLine();
        System.out.print("Nombre: "); String nom = sc.nextLine();
        System.out.print("Edad: "); int edad = Integer.parseInt(sc.nextLine());

        if (tipo == 1) {
            System.out.print("Carrera: ");
            lista.add(new Estudiante(ced, nom, edad, sc.nextLine()));
        } else {
            System.out.print("Asignatura: ");
            lista.add(new Docente(ced, nom, edad, sc.nextLine()));
        }
        System.out.println("Registro agregado correctamente.");
    }

    private static void mostrar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(i + ". ");
            lista.get(i).mostrarDatos();
        }
    }

    private static void eliminar() {
        System.out.print("Indice a eliminar: ");
        try {
            lista.remove(Integer.parseInt(sc.nextLine()));
            System.out.println("Eliminado.");
        } catch (Exception e) {
            System.out.println("Registro no encontrado.");
        }
    }

    private static void actualizar() {
        System.out.print("Indice a actualizar: ");
        try {
            int idx = Integer.parseInt(sc.nextLine());
            Persona p = lista.get(idx);
            System.out.print("Nuevo nombre: "); String nom = sc.nextLine();
            System.out.print("Nueva edad: "); int edad = Integer.parseInt(sc.nextLine());

            if (p instanceof Estudiante) {
                System.out.print("Nueva carrera: ");
                lista.set(idx, new Estudiante(p.getCedula(), nom, edad, sc.nextLine()));
            } else {
                System.out.print("Nueva asignatura: ");
                lista.set(idx, new Docente(p.getCedula(), nom, edad, sc.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar.");
        }
    }
}