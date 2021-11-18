package TrabajoFacultad;

public class Estudiantes extends Persona {
    public Estudiantes(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Nombre del estudiante: "+this.getNombre()+" Apellido: "+this.getApellido()+"y Legajo: "+this.getLegajo());
    }

}
