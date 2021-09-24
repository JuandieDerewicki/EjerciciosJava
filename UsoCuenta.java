package desafio11;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente Cuenta1 = new CuentaCorriente("Juan Diego Derewicki", 80000, 220429);

        CuentaCorriente Cuenta2 = new CuentaCorriente("Valentin Puente", 60000, 240298);

        System.out.println ("Los datos de la Cuenta1 son: " + Cuenta1.dame_datosGenerales() +
                "\n" + "Los datos de la Cuenta2 son " + Cuenta2.dame_datosGenerales());

        Cuenta1.Transferencias(Cuenta1, Cuenta2, 2500);

        System.out.println ("Datos de la cuenta1 luego de la transferencia: " + Cuenta1.dame_saldo() +
                "\n" + "Datos de la cuenta2 luego de la transferencia: " + Cuenta2.dame_saldo());

    }
}
