package TrabajoFacultad;

import java.util.LinkedList;

public class Carrera extends Facultad implements Informacion{
    private LinkedList<Materia> coleccionMaterias;



    public Carrera(String nombreCarrera) {
        super(nombreCarrera);
        this.coleccionMaterias = new LinkedList<>();

    }
    public void AgregarMaterias(Materia carreraparaAgregar){
        this.coleccionMaterias.add(carreraparaAgregar);
    }
    public void EliminarMateria(String eliminarMateria){
        boolean encontro = false;
        for (Materia c :coleccionMaterias){
            if (c.getNombreFacultad().equals(eliminarMateria)){
                this.coleccionMaterias.remove(c);
                encontro= true;
                break;
            }

        }
        System.out.println(encontro);
    }
    public void EncontrarCarrera(String Materias_a_encontrar){
        boolean encontro = false;
        for (Materia c :coleccionMaterias){
            if (c.equals(Materias_a_encontrar)){
                System.out.println("La materia fue encontrada:"+ c);
                encontro= true;
                break;
            }

        }
        System.out.println(encontro);
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos() {
        for (Materia m:coleccionMaterias){
            System.out.println(m);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombreCarrera='" + getNombreFacultad() + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }
}
