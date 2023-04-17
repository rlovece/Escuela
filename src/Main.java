import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Juan Perez", "0000001", 30, "Programación");
        Estudiante e2 = new Estudiante("Calos Alvarez", "0000002", 26, "Arquitectura");
        Estudiante e3 = new Estudiante("Ana Nuñez", "0000003", 28, "Programación");

        Profesor p1 = new Profesor("Monica Martinez", "00000023", 51, "Matemática");

        ArrayList<Estudiante> lista1 = new ArrayList<Estudiante>();

        Materia mate2023 = new Materia(p1, lista1, 2023);

        /// agrego estudiantes a la lista
        mate2023.getListaAlumnos().add(e1);
        mate2023.getListaAlumnos().add(e2);
        mate2023.getListaAlumnos().add(e3);

        Consola.escribir(mate2023.toString());

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