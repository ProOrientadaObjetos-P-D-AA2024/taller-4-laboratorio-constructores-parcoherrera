package automotor;

public class Automotor {
    
    private String cedulaDuenio, marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo, valorMatricula;

    public Automotor(String cedulaDuenio, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDuenio = cedulaDuenio;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public Automotor(String cedulaDuenio, String marcaVehiculo, int anioFabricacion) {
        this.cedulaDuenio = cedulaDuenio;
        this.anioFabricacion = anioFabricacion;
        valorVehiculo = 4000;
    }

    public String getCedulaDuenio() {
        return cedulaDuenio;
    }

    public void setCedulaDuenio(String cedulaDuenio) {
        this.cedulaDuenio = cedulaDuenio;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        valorMatricula = 0.00002 * valorVehiculo * (2024 - anioFabricacion);
    }

    @Override
    public String toString() {
        return "Cedula dueño: " + getCedulaDuenio() + "\n"
                + "Año de fabricacion: " + getAnioFabricacion() + "\n"
                + "Valor del vehículo: " + getValorVehiculo() + "\n"
                + "Valor de la matrícula: " + getValorMatricula() + "\n";
    }
}
