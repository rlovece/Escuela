public class Estudiante extends Persona{

    private String carrera;

    ///region Constructor
    public Estudiante(String nombre, String dni, int edad, String carrera) {
        super(nombre, dni, edad);
        this.carrera = carrera;
    }
    ///endregion

    ///region G y S

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    ///endregion


    public void estudiar (){
        Consola.escribir(this.nombre + " está estudiando 📚");
    }

    @Override
    public String toString() {
        return nombre + " de " + edad + " años";
    }
}
