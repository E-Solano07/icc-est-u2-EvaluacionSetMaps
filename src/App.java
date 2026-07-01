import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import controllers.PersonaController;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan Pérez", 34));
        personas.add(new Persona("María González", 27));
        personas.add(new Persona("Carlos Rodríguez", 45));
        personas.add(new Persona("Ana Martínez", 19));
        personas.add(new Persona("Luis Sánchez", 52));
        personas.add(new Persona("Sofía López", 31));
        personas.add(new Persona("Pedro Hernández", 67));
        personas.add(new Persona("Laura García", 24));
        personas.add(new Persona("Miguel Torres", 40));
        personas.add(new Persona("Carmen Ramírez", 58));
        personas.add(new Persona("José Flores", 36));
        personas.add(new Persona("Elena Cruz", 22));
        personas.add(new Persona("David Morales", 49));
        personas.add(new Persona("Patricia Ortiz", 29));
        personas.add(new Persona("Javier Castro", 55));
        personas.add(new Persona("Isabel Romero", 43));
        personas.add(new Persona("Daniel Vargas", 18));
        personas.add(new Persona("Lucía Mendoza", 6));
        personas.add(new Persona("Fernando Herrera", 38));
        personas.add(new Persona("Rosa Silva", 26));
        personas.add(new Persona("Andrés Navarro", 47));
        personas.add(new Persona("Paula Rojas", 33));
        personas.add(new Persona("Sergio Medina", 70));
        personas.add(new Persona("Beatriz Vega", 51));
        personas.add(new Persona("Ricardo Castillo", 28));
        personas.add(new Persona("Marta Paredes", 64));
        personas.add(new Persona("Juan Pérez", 21));
        personas.add(new Persona("María González", 56));
        personas.add(new Persona("Carlos Rodríguez", 39));
        personas.add(new Persona("Ana Martínez", 55));
        personas.add(new Persona("Luis Sánchez", 72));
        personas.add(new Persona("Sofía López", 25));
        personas.add(new Persona("Pedro Hernández", 42));
        personas.add(new Persona("Laura García", 59));
        personas.add(new Persona("Miguel Torres", 37));
        personas.add(new Persona("Carmen Ramírez", 65));
        personas.add(new Persona("José Flores", 23));
        personas.add(new Persona("Elena Cruz", 54));
        personas.add(new Persona("David Morales", 41));
        personas.add(new Persona("Patricia Ortiz", 20));
        personas.add(new Persona("Javier Castro", 68));
        personas.add(new Persona("Isabel Romero", 35));
        personas.add(new Persona("Daniel Vargas", 44));
        personas.add(new Persona("Lucía Mendoza", 60));
        personas.add(new Persona("Fernando Herrera", 32));
        personas.add(new Persona("Rosa Silva", 48));
        personas.add(new Persona("Andrés Navarro", 57));
        personas.add(new Persona("Paula Rojas", 26));
        personas.add(new Persona("Sergio Medina", 63));
        personas.add(new Persona("Beatriz Vega", 50));

        PersonaController controller = new PersonaController();

        //Método A
        System.out.println("=== FILTRAR Y ORDENAR ===");
        Set<Persona> filtradas = controller.filtrarYOrdenar(personas, 20);

        for (Persona p : filtradas) {
            System.out.println(p.getNombre() + " - " + p.getEdad());
        }

        // Método B
        System.out.println("\n=== AGRUPAR POR RANGO ===");
        Map<String, Set<String>> grupos = controller.agruparPorRangoEdad(personas);

        for (String clave : grupos.keySet()) {
            System.out.println(clave + ": " + grupos.get(clave));
        }
    }
}
