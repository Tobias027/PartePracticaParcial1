import java.time.LocalDate;
import java.util.*;

public class Paciente extends Persona {
    private int numeroPaciente;
    private LocalDate fechaIngreso;
    private String diagnosticoInicial;
    private List<Internacion> internaciones;
    private List<Atencion> atenciones;

    public Paciente(String nombreCompleto, int numeroDocumento, LocalDate fechaNacimiento,
                    int numeroPaciente, LocalDate fechaIngreso, String diagnosticoInicial) {
        super(nombreCompleto, numeroDocumento, fechaNacimiento);
        this.numeroPaciente = numeroPaciente;
        this.fechaIngreso = fechaIngreso;
        this.diagnosticoInicial = diagnosticoInicial;
        this.internaciones = new ArrayList<>();
        this.atenciones = new ArrayList<>();
    }

    public String getPacienteInfo() {
        return "Paciente: " + nombreCompleto + ", Número: " + numeroPaciente +
                ", Documento: " + numeroDocumento + ", Diagnóstico: " + diagnosticoInicial;
    }

    public void agregarInternacion(Internacion internacion) {
        internaciones.add(internacion);
    }

    public void agregarAtencion(Atencion atencion) {
        atenciones.add(atencion);
    }
}