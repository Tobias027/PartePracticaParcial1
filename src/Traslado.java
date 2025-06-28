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
        return "=== Información del Traslado ===\n"
                + " Fecha de Traslado: " + fechaTraslado + "\n"
                + " Motivo: " + motivo + "\n"
                + " Observaciones: " + observaciones + "\n"
                + " Autorizado: " + (autorizado ? "Sí" : "No") + "\n"
                + " Área de Origen: " + (areaOrigen != null ? areaOrigen.getNombre() : "No especificada") + "\n"
                + "️ Área de Destino: " + (areaDestino != null ? areaDestino.getNombre() : "No especificada");
    }


    public void autorizar(){
        this.autorizado=true;
    }

    public boolean isAutorizado() {
        return autorizado;
    }


}