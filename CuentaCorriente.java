package desafio11;

public class CuentaCorriente {

    private double saldo;

    private String nombreTitular;

    private long numeroCuenta;

    public CuentaCorriente(String nomTit, double sal, long nroCuenta) {
        this.nombreTitular = nomTit;
        this.saldo = sal;
        this.numeroCuenta = nroCuenta;
    }


    public String dame_datosGenerales() { // GETTER

        return "Nombre del titular: " + nombreTitular + "\n" + "Saldo actual de la cuenta: " + saldo + "\n" + "Numero de cuenta: " + numeroCuenta;
    }

    public double dame_saldo() { // GETTER
        return saldo;
    }



    public void ingreso(double ingreso_dinero) { // SETTER

        this.saldo += ingreso_dinero;
    }

    public void reintegro (double reintegro_dinero) { // SETTER

        this.saldo -= reintegro_dinero;
    }

    public void Transferencias (CuentaCorriente CuentaOrigen, CuentaCorriente CuentaDestino, double importe) { // METODO PARA REALIZAR TRANSFERENCIA
       CuentaOrigen.reintegro(importe);
       CuentaDestino.ingreso(importe);
    }








}
