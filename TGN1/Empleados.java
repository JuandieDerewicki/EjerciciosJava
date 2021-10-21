package TGN1;

public class Empleados extends Persona{
    private double sueldo;

    public Empleados(String nombre, int edad){
        super(nombre, edad);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    public String toString() {
        return "Persona{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() + '\'' +
                ", sueldo ="+ sueldo + '\'' +
                '}';
    }

    @Override
    public String getTipo() {
        return "EMPLEADO";
    }


}