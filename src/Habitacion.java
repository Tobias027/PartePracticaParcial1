import java.time.LocalDate;
import java.util.*;

public class Habitacion {
    private int numeroHabitacion;
    private TipoArea area;
    private int capacidadCamas;
    private int camasOcupadas;
    private ArrayList<Internacion> internaciones;

    public Habitacion(int numeroHabitacion, int capacidadCamas, TipoArea area) {
        this.numeroHabitacion = numeroHabitacion;
        this.area=area;
        this.capacidadCamas = capacidadCamas;
        this.camasOcupadas = 0;
        this.internaciones = new ArrayList<>();
    }

    public int getCamasDisponibles() {
        return capacidadCamas - camasOcupadas;
    }

    public boolean asignarCama() {
        if (getCamasDisponibles() > 0) {
            camasOcupadas++;
            return true;
        }
        return false;
    }

    public void liberarCama() {
        if (camasOcupadas > 0) {
            camasOcupadas--;
        }
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public TipoArea getArea() {
        return this.area;
    }

    public void agregarInternacion(Internacion internacion) {
        internaciones.add(internacion);
    }
}
