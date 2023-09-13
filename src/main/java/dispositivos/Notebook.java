package dispositivos;
import java.util.List;
public class Notebook extends DispositivoTecnologico {
    private String resolucionPantalla;
    private String tipoTeclado;
    private int bateriaMah;
    public Notebook(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int anioFabricacion, double precio, int cantidadEnStock, String resolucionPantalla, String tipoTeclado, int bateriaMah) {
        super(marca, memoriaRAM, memoriaAlmacenamiento, procesador, modelo, anioFabricacion, precio, cantidadEnStock);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateriaMah = bateriaMah;
    }
    public String getResolucionPantalla() {
        return resolucionPantalla;
    }
    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    public String getTipoTeclado() {
        return tipoTeclado;
    }
    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }
    public int getBateriaMah() {
        return bateriaMah;
    }
    public void setBateriaMah(int bateriaMah) {
        this.bateriaMah = bateriaMah;
    }
}