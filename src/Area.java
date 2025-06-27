import  java.util.*;

public class Area {
    private String nombre;
    private int numeroPiso;
    private TipoArea tipo;
    private ArrayList<Habitacion> habitaciones;
    private AdministracionArea administracionArea;

    public Area(String nombre, int numeroPiso, TipoArea tipo) {
        this.nombre = nombre;
        this.numeroPiso = numeroPiso;
        this.tipo = tipo;
        this.habitaciones = new ArrayList<>();
        this.administracionArea = new AdministracionArea(tipo);
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }

    public boolean hayCapacidadDisponible() {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getCamasDisponibles() > 0) {
                return true;
            }
        }
        return false;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public AdministracionArea getAdministracionArea() {
        return administracionArea;
    }
}