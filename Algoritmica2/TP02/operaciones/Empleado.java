package operaciones;

public class Empleado implements PorPagar{
    private String nombre, numeroDocumento;

    public Empleado(String nombre, String numeroDocumento) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public double obtenerPago() {
        return 0;
    }
}