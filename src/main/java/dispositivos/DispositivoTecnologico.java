package dispositivos;

public class DispositivoTecnologico {
    private String marca;
    private int memoriaRAM;
    private int memoriaAlmacenamiento;
    private String procesador;
    private String modelo;
    private int anioFabricacion;
    private double precio;
    private int cantidadEnStock;
    public DispositivoTecnologico(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int anioFabricacion, double precio, int cantidadEnStock) {
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getMemoriaRAM() {
        return memoriaRAM;
    }
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    public int getMemoriaAlmacenamiento() {
        return memoriaAlmacenamiento;
    }
    public void setMemoriaAlmacenamiento(int memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidadEnStock() {
        return cantidadEnStock;
    }
    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
}