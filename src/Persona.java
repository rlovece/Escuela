public class Persona implements Comparable<Persona>{

    protected String nombre;
    protected String dni;
    protected int edad;

    ///region Constructor
    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    ///endregion

    ///region G and S

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        if (this.edad < o.getEdad()){
            return -1;
        } else if (this.edad == o.getEdad()){
            return 0;
        } else {
            return 1;
        }
    }

    ///endregion

}
