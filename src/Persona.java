import java.time.LocalDate;

abstract class Persona {
    protected String nombreCompleto;
    protected int numeroDocumento;
    protected LocalDate fechaNacimiento;

    public Persona(String nombreCompleto, int numeroDocumento, LocalDate fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }
}