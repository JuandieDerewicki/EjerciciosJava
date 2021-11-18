package TrabajoFacultad;

import java.util.LinkedList;

public class Materia extends Carrera implements Informacion{
    private String profesor;
    private LinkedList<Estudiantes> colecciondeEstudiantes;



    public Materia(String nombreMateria, String Titular_Profesor) {
        super(nombreMateria);
        this.profesor = Titular_Profesor;
        this.colecciondeEstudiantes = new LinkedList<>();
    }
    public void AgregarEstudiantes(Estudiantes Agregarestudiantes){

        this.colecciondeEstudiantes.add(Agregarestudiantes);
    }
    public boolean eliminarEstudiante(int legajo){
        boolean encontro = false;
        for(Estudiantes estudiante: colecciondeEstudiantes){
            if(estudiante.getLegajo()==legajo){
                colecciondeEstudiantes.remove(estudiante);
                encontro = true;
            }
        }
        return encontro;
    }

    public void ModificarProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public int verCantidad() {
        return colecciondeEstudiantes.size();

    }

    @Override
    public String listarContenidos() {
        for (Estudiantes c :colecciondeEstudiantes){
            System.out.println(c);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombreMateria='" + getNombreFacultad() + '\'' +
                ", profesor='" + profesor + '\'' +
                ", colecciondeEstudiantes=" + colecciondeEstudiantes +
                '}';
    }
}
