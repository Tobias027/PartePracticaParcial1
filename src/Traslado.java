import java.time.LocalDate;
import java.util.*;

public class Traslado {
    private LocalDate fechaTraslado;
    private String motivo;
    private String observaciones;
    private boolean autorizado;
    private Area areaOrigen;
    private Area areaDestino;

    public Traslado(LocalDate fechaTraslado, String motivo, String observaciones,
                    Area areaOrigen, Area areaDestino) {
        this.fechaTraslado = fechaTraslado;
        this.motivo = motivo;
        this.observaciones = observaciones;
        this.autorizado = false;
        this.areaOrigen = areaOrigen;
        this.areaDestino = areaDestino;
    }

    public String getInformacionTraslado() {
        return "Traslado - Fecha: " + fechaTraslado + ", Motivo: " + motivo +
                ", Autorizado: " + autorizado + ", Observaciones: " + observaciones;
    }
}