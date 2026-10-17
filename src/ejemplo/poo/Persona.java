package ejemplo.poo;

public abstract class Persona {
    //Atributos
    private String numero_cuenta;
    private String titular;
    private String fecha_apertura;
    protected double saldo;
    //Métodos
    public abstract double retiroCuenta(double monto);
    public abstract double depositoCuenta(double monto);
    public abstract void generarCuenta(String numero_cuenta, String titular, String fecha_apertura, double saldo);
    //Getters and Setters

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(String fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo > 0){
            this.saldo = saldo;
        }
        else{
            this.saldo = 0;
        }
        
    }
    
    
    
}
