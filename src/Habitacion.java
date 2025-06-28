import java.time.LocalDate;
import java.util.*;

public class Habitacion {
    private int numeroHabitacion;
    private Area area;
    private int capacidadCamas;
    private int camasOcupadas;

    public Habitacion(int numeroHabitacion, int capacidadCamas, Area area) {
        this.numeroHabitacion = numeroHabitacion;
        this.area=area;
        this.capacidadCamas = capacidadCamas;
        this.camasOcupadas = 0;
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

    public Area getArea() {

        return this.area;
    }


    public String getHabitacionInfo() {
        return "Habitacion: " + numeroHabitacion + ", Camas ocupadas: " + camasOcupadas;
    }
}
