import java.time.LocalDate;
import java.util.*;

public class Atencion {
    private LocalDate fechaAtencion;
    private String tipoAtencion;
    private String observaciones;
    private int duracion;
    private Colaborador colaborador;
    private Paciente paciente;
    private Internacion internacion;

    public Atencion(LocalDate fechaAtencion, String tipoAtencion, String observaciones,
                    int duracion, Colaborador colaborador, Paciente paciente) {
        this.fechaAtencion = fechaAtencion;
        this.tipoAtencion = tipoAtencion;
        this.observaciones = observaciones;
        this.duracion = duracion;
        this.colaborador = colaborador;
        this.paciente = paciente;
        this.internacion = null;
    }

    public void registrarAtencion() {
        // Lógica para registrar la atención
        if (colaborador != null) {
            colaborador.agregarAtencion(this);
        }
        if (paciente != null) {
            paciente.agregarAtencion(this);
        }
        if (internacion != null) {
            internacion.agregarAtencion(this);
        }
    }

    public void finalizarAtencion() {
        System.out.println("Atención finalizada: " + tipoAtencion + " - Duración: " + duracion + " minutos");
    }

    public void gestionarInternacion()
}