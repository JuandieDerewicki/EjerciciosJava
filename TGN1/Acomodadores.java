package TGN1;

import java.util.Arrays;
public class Acomodadores extends Empleados implements ParaAcomodadores {
    private Salas sala;

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }


    @Override
    public Salas getSalas() {
        return getSalas();
    }

    @Override
    public void SetSala(Salas sala) {
        this.sala=this.sala;

    }
    public String getTipo() {
        // TODO Auto-generated method stub
        return "Acomodador";
    }

    public String toString() {
        return "Acomodador nombre: "+this.getNombre()+" edad:"+this.getEdad();
    }

}
