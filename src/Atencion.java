import java.time.LocalDate;

public class Atencion {
    private LocalDate fechaAtencion;
    private String tipoAtencion;
    private String observaciones;
    private int duracion;
    private Colaborador colaborador;
    private Paciente paciente;
    private Internacion internacion;

    public Atencion(LocalDate localDate, String tipoAtencion, String observaciones,
                    int duracion, Colaborador colaborador, Paciente paciente) {
        this.fechaAtencion = LocalDate.now();
        this.tipoAtencion = tipoAtencion;
        this.observaciones = observaciones;
        this.duracion = duracion;
        this.colaborador = colaborador;
        this.paciente = paciente;
        this.internacion = null;
        agregarAtencion(colaborador, paciente);
    }

    public void registrarAtencion() {
        // Lógica para registrar la atención
        if (colaborador != null) {
            colaborador.agregarAtencion(this);
        }
        if (paciente != null) {
            paciente.agregarAtencion(this);
        }
    }

    public void finalizarAtencion() {
        System.out.println("Atención finalizada: " + tipoAtencion + " - Duración: " + duracion + " minutos");
    }

    public Internacion getInternacion() {
        return internacion;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void agregarAtencion(Colaborador colaborador, Paciente paciente){
        colaborador.agregarAtencion(this);
        paciente.agregarAtencion(this);

    }

    public void asociarInternacion(LocalDate fechaInicio, String diagnostico, Paciente paciente,
                                     Colaborador colaborador, Habitacion habitacion){
        this.internacion= new Internacion(diagnostico, paciente, colaborador, habitacion);
    }
}