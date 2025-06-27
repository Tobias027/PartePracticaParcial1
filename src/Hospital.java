import java.util.*;

public class Hospital {
    private String nombre;
    private String direccion;
    private ArrayList<Area> areas;

    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.areas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}