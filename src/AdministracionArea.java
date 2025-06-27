import  java.util.*;

public class AdministracionArea {
    private TipoArea area;
    private List<Traslado> trasladosAutorizados;

    public AdministracionArea(TipoArea area) {
        this.area = area;
        this.trasladosAutorizados = new ArrayList<>();
    }

    public boolean autorizarTraslado(Traslado traslado) {
        if (traslado != null) {
            traslado.autorizar();
            trasladosAutorizados.add(traslado);
            return true;
        }
        return false;
    }
}