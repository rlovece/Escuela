public class Profesor extends Persona{

    private String materia;

    ///region Constructor

    public Profesor(String nombre, String dni, int edad, String materia) {
        super(nombre, dni, edad);
        this.materia = materia;
    }

    ///endregion

    ///region G y S

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    ///endregion

    public void dandoClase (){
        Consola.escribir(this.nombre + "está dando clases 👩‍🏫");
    }
}
