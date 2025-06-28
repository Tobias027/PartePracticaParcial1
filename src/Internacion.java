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

    public Internacion(String diagnostico, Paciente paciente,
                       Colaborador colaborador, Habitacion habitacion) {
        this.fechaInicio = LocalDate.now();
        this.diagnostico = diagnostico;
        this.paciente = paciente;
        this.colaborador = colaborador;
        this.habitacion = habitacion;
        this.habitacion.asignarCama();
        this.traslados = new ArrayList<>();
        agregarInternacion(colaborador, paciente, habitacion);
    }

    public void finalizarInternacion() {
        this.fechaFin = LocalDate.now();
        if (habitacion != null) {
            habitacion.liberarCama();
        }
    }

    public void agregarInternacion(Colaborador colaborador, Paciente paciente, Habitacion habitacion){
        colaborador.agregarInternacion(this);
        paciente.agregarInternacion(this);
        habitacion.asignarCama();

    }

    public void actualizarDiagnostico(String nuevoDiagnostico) {
        this.diagnostico = nuevoDiagnostico;
    }

    public void asignarColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
        colaborador.agregarInternacion(this);
    }

    public Traslado solicitarTraslado(Area areaDestino, String motivo, String observaciones) {
        Area areaOrigen = this.habitacion.getArea();
        Traslado traslado = new Traslado(LocalDate.now(), motivo, observaciones, areaOrigen, areaDestino);
        return  traslado;
    }

    public void verificarTraslado(Traslado traslado) {
        if (traslado.isAutorizado()){
            traslados.add(traslado);
        }else{
            System.out.println("\nSe debe autorizar el traslado.\n");
        }
    }



    public int getHabitacionActual() {
        return this.habitacion.getNumeroHabitacion();
    }

    public void getInfoInternacion(){
        System.out.println("=== Información de la Internación ===");
        System.out.println("Fecha Inicio: " + this.fechaInicio);
        System.out.println("Diagnóstico: " + this.diagnostico);
        System.out.println("Paciente: " + this.paciente.getPacienteInfo());
        System.out.println("Colaborador: " + this.colaborador.getColaboradorInfo());
        System.out.println("Habitación: " + this.habitacion.getHabitacionInfo());

        System.out.println("Traslados:");
        for (Traslado traslado : this.traslados) {
            System.out.println(" - " + traslado.getInformacionTraslado());
        }
    }

}