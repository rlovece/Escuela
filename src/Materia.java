import java.util.ArrayList;

public class Materia {

    private Profesor profe;
    private ArrayList<Estudiante> listaEstudiantes= new ArrayList<Estudiante>();
    private int anio;

    ///region Constructor

    public Materia(Profesor profe, ArrayList<Estudiante> listaAlumnos, int anio) {
        this.profe = profe;
        this.listaEstudiantes = listaAlumnos;
        this.anio = anio;
    }
    ///endregion

    ///region G y S

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    public ArrayList<Estudiante> getListaAlumnos() {
        return listaEstudiantes;
    }

    public void setListaAlumnos(ArrayList<Estudiante> listaAlumnos) {
        this.listaEstudiantes = listaAlumnos;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    ///endregion


    @Override
    public String toString() {
        return "Materia: " + profe.getMateria() +
                " Año: " + anio +
                "\n Profesor:" + profe.getNombre() +
                "\n Lista de alumnos \n" + listaEstudiantes;
    }
}
