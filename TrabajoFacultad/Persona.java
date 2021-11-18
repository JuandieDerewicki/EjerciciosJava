package TrabajoFacultad;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int legajo;
    public Persona(String nombre, String apellido,int legajo){
        this.apellido=apellido;
        this.legajo=legajo;
        this.nombre=nombre;
    }




    public void modificarDatos(String nombre, String apellido, int legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }
}
