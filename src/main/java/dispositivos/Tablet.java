package dispositivos;

import java.util.List;
public class Tablet extends DispositivoTecnologico {
    private String resolucionPantalla;
    private List<String> accesorios;
    public Tablet(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int anioFabricacion, double precio, int cantidadEnStock, String resolucionPantalla, List<String> accesorios) {
        super(marca, memoriaRAM, memoriaAlmacenamiento, procesador, modelo, anioFabricacion, precio, cantidadEnStock);
        this.resolucionPantalla = resolucionPantalla;
        this.accesorios = accesorios;
    }
    public String getResolucionPantalla() {
        return resolucionPantalla;
    }
    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    public List<String> getAccesorios() {
        return accesorios;
    }
    public void setAccesorios(List<String> accesorios) {
        this.accesorios = accesorios;
    }
}