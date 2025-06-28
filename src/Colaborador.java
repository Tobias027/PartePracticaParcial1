import java.time.LocalDate;
import java.util.*;

public class Colaborador extends Persona {
    private int numeroLegajo;
    private Especialidad especialidad;
    private LocalDate fechaIngreso;
    private ArrayList<Internacion> internacionesAtendidas;
    private ArrayList<Atencion> atencionesRealizadas;

    public Colaborador(String nombreCompleto, int numeroDocumento, LocalDate fechaNacimiento,
                       int numeroLegajo, Especialidad especialidad, LocalDate fechaIngreso) {
        super(nombreCompleto, numeroDocumento, fechaNacimiento);
        this.numeroLegajo = numeroLegajo;
        this.especialidad = especialidad;
        this.fechaIngreso = fechaIngreso;
        this.internacionesAtendidas = new ArrayList<>();
        this.atencionesRealizadas = new ArrayList<>();
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getLegajo() {
        return numeroLegajo;
    }

    public void agregarInternacion(Internacion internacion) {
        internacionesAtendidas.add(internacion);
    }

    public void agregarAtencion(Atencion atencion) {
        atencionesRealizadas.add(atencion);
    }

    public String getColaboradorInfo() {
        return "Colaborador: " + nombreCompleto + ", Número: " + numeroLegajo +
                ", Especialidad: : " + especialidad ;
    }
}