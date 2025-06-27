import java.time.LocalDate;

abstract class Persona {
    protected String nombreCompleto;
    protected String numeroDocumento;
    protected LocalDate fechaNacimiento;

    public Persona(String nombreCompleto, String numeroDocumento, LocalDate fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
}