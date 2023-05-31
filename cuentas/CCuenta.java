public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException() {
            super("No hay suficiente saldo en la cuenta");
        }
    }

    public class CantidadNegativaException extends Exception {
        public CantidadNegativaException() {
            super("No se puede realizar la operación con una cantidad negativa");
        }
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws CantidadNegativaException {
        if (cantidad < 0)
            throw new CantidadNegativaException();
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws CantidadNegativaException, SaldoInsuficienteException {
        if (cantidad <= 0)
            throw new CantidadNegativaException();
        if (estado() < cantidad)
            throw new SaldoInsuficienteException();
        setSaldo(getSaldo() - cantidad);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
