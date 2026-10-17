package proyecto.vehiculos;
public class Avion extends VehiculoAereo {
    protected int capacidad_carga;
    protected double consumo_combustible;

    public Avion(int capacidad_carga, double consumo_combustible, double costo_kilometro, String placa, String color, int capacidad_pasajeros, double velocidad) {
        super(costo_kilometro, placa, color, capacidad_pasajeros, velocidad);
        this.capacidad_carga = capacidad_carga;
        this.consumo_combustible = consumo_combustible;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public double getConsumo_combustible() {
        return consumo_combustible;
    }

    public void setConsumo_combustible(double consumo_combustible) {
        this.consumo_combustible = consumo_combustible;
    }
    @Override
    public double calculoTiempoViaje(double distancia){
        return distancia/super.velocidad;
    }
    @Override
    public double calculoRecorridoDistacia(double distancia){
        return distancia*super.costo_kilometro;
    }
    public double calcularCombustible(double distancia){
        return calculoTiempoViaje(distancia)*consumo_combustible;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Capacidad de carga: " + capacidad_carga);
        System.out.println("Consumo de combustible: " + consumo_combustible);
    }
}
