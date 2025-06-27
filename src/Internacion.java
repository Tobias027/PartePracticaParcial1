import java.time.LocalDate;
import java.util.*;

public class Internacion {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String diagnostico;
    private Paciente paciente;
    private Colaborador colaborador;
    private Habitacion habitacion;
    private ArrayList<Traslado> traslados;
    private ArrayList<Atencion> atenciones;

    public Internacion(LocalDate fechaInicio, String diagnostico, Paciente paciente,
                       Colaborador colaborador, Habitacion habitacion) {
        this.fechaInicio = fechaInicio;
        this.diagnostico = diagnostico;
        this.paciente = paciente;
        this.colaborador = colaborador;
        this.habitacion = habitacion;
        this.traslados = new ArrayList<>();
        this.atenciones = new ArrayList<>();
    }

    public void finalizarInternacion() {
        this.fechaFin = LocalDate.now();
        if (habitacion != null) {
            habitacion.liberarCama();
        }
    }

    public void actualizarDiagnostico(String nuevoDiagnostico) {
        this.diagnostico = nuevoDiagnostico;
    }

    public void asignarColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
        colaborador.agregarInternacion(this);
    }

    public Traslado solicitarTraslado(Area areaDestino, String motivo) {
        Area areaOrigen = this.habitacion.getArea();
        Traslado traslado = new Traslado(LocalDate.now(), motivo, "", areaOrigen, areaDestino);
        traslados.add(traslado);
        return traslado;
    }

    public int getHabitacionActual() {
        return this.habitacion.getNumeroHabitacion();
    }


}