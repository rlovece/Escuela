import java.util.*;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Juan Perez", "0000001", 30, "Programación");
        Estudiante e2 = new Estudiante("Calos Alvarez", "0000003", 26, "Arquitectura");
        Estudiante e3 = new Estudiante("Ana Nuñez", "0000002", 28, "Programación");

        Profesor p1 = new Profesor("Monica Martinez", "00000023", 51, "Matemática");

        ArrayList<Estudiante> lista1 = new ArrayList<Estudiante>();

        Materia mate2023 = new Materia(p1, lista1, 2023);

        /// agrego estudiantes a la lista
        mate2023.getListaAlumnos().add(e1);
        mate2023.getListaAlumnos().add(e2);
        mate2023.getListaAlumnos().add(e3);

        Consola.escribir(mate2023.toString());

        Collections.sort(lista1);

        Consola.escribir("\n\n ✔ La lista de alumnos ordenada: " + lista1.toString());

        TreeMap<String, Estudiante> treeMapEstudiantes = new TreeMap<>();

        for (Estudiante estudiante: lista1
             ) {
            treeMapEstudiantes.put(estudiante.getDni(), estudiante);
        }

        Consola.escribir("\n\n ✔ Arbol de estudiantes ordenado por DNI: " + treeMapEstudiantes);

        Consola.escribir("\n\n ✔ De forma iterada");

        for (Map.Entry<String, Estudiante> par: treeMapEstudiantes.entrySet()
             ) {

            Consola.escribir("\n DNI (clave): " + par.getKey());
            Consola.escribir("Datos: " + par.getValue());
        }

    }
}

/*
Crea una clase Persona que tenga tres atributos: nombre, edad y dni. Luego,
crea dos subclases llamadas Estudiante y Profesor que hereden de
Persona.

Como básico la subclase Estudiante debe tener un atributo carrera
y un método estudiar que imprima por pantalla un mensaje indicando que el
estudiante está estudiando.

La subclase Profesor debe tener un atributo
materia y un método enseñar que imprima por pantalla un mensaje indicando
que el profesor está enseñando. Una idea podría ser crear una clase Materia
y relacionarla con los alumnos y profesores.
*/