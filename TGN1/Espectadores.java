package TGN1;

public class Espectadores extends Persona {
    private String fila;
    private int silla;

    public Espectadores(String fila, int silla, int edad, String nombre) {
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
    }

    public String GetButaca() {
        return "se encuentra en la fila" + fila + '\'' +
                "silla:" + silla;
    }

    public String toString() {
        return
                "nombre='" + getNombre() + '\'' +
                        ", edad=" + getEdad() + '\'' +
                        "fila:" + fila + '\'' +
                        "butaca:" + silla;


    }

    public String getTipo() {
        return "Espectador";
    }

}

