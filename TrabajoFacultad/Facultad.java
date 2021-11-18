package TrabajoFacultad;

import javax.swing.*;
import java.util.LinkedList;

public class Facultad implements Informacion{
    private String nombreFacultad;
    private LinkedList<Carrera> carreras;

    public Facultad(String nombreFacultad) {
        this.carreras = new LinkedList<>();
        this.nombreFacultad=nombreFacultad;
    }

    public void AgregarCarrera(Carrera carreraparaAgregar){
        this.carreras.add(carreraparaAgregar);
    }


    public void EliminarCarrera(String eliminarCarrera){
        boolean encontro = false;
        for (Carrera c :carreras){
            if (c.equals(eliminarCarrera)){
                this.carreras.remove(eliminarCarrera);
                encontro= true;
                break;
            }

        }
        System.out.println(encontro);
    }

    @Override
    public int verCantidad() {
        return carreras.size();
    }


    public String listarContenidos() {
        for (Carrera c1 : carreras){
            System.out.println(c1);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombreFacultad='" + nombreFacultad + '\'' +
                ", carreras=" + carreras +
                '}';
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }
}
