package TrabajoFacultad;

public class Profesor extends Persona {
    private double basico;
    private int antiguedad;
    public Profesor(String nombre, String apellido, int legajo, double basico,int antiguedad) {
        super(nombre, apellido, legajo);
        this.antiguedad= antiguedad;
        this.basico= basico;
    }


    public double calcularSueldo(){
        this.basico += basico*10/(100) * antiguedad;
        return basico;

    }

    @Override
    public String toString() {
        return "Profesor{" +
                "basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
