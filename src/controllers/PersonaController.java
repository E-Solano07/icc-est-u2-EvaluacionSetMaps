package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Persona;

public class PersonaController {
    
    // Método A
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadMinima) {
        
        TreeSet<Persona> resultado = new TreeSet<>(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {

                // Si son duplicados
                if (p1.getEdad() == p2.getEdad() 
                        && p1.getNombre().equalsIgnoreCase(p2.getNombre())) {
                    return 0;
                }

                // Edad descendente
                if (p1.getEdad() != p2.getEdad()) {
                    return Integer.compare(p2.getEdad(), p1.getEdad());
                }

                // Nombre ascendente ignorando mayúsculas
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }
        });

        for (Persona p : personas) {
            if (p.getEdad() >= edadMinima) {
                resultado.add(p);
            }
        }

        return resultado;
    }

    // Método B
    public Map<String, Set<String>> agruparPorRangoEdad(List<Persona> personas) {
        
        TreeMap<String,Set<String>> control = new TreeMap<>();

        control.put("ADULTO", new HashSet<>());
        control.put("JOVEN", new HashSet<>());
        control.put("MAYOR", new HashSet<>());

        for (Persona p : personas) {

            String grupo;

            if (p.getEdad() < 30) {
                grupo = "JOVEN";
            } else if (p.getEdad() < 60) {
                grupo = "ADULTO";
            } else {
                grupo = "MAYOR";
            }

            String[] partes = p.getNombre().split(" ");
            String primerNombre = partes[0];

            if (!control.get(grupo).contains(primerNombre.toLowerCase())) {
                control.get(grupo).add(primerNombre);
                control.get(grupo).add(primerNombre.toLowerCase());

            }
        }

        return control;
    }
}
