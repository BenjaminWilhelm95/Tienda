package compras;
import cliente.Cliente;
import java.util.Date;
import java.util.List;
import dispositivos.DispositivoTecnologico;
public class Compra {
    private List<DispositivoTecnologico> dispositivos;
    private Cliente cliente;
    private Date fechaCompra;
    public Compra(List<DispositivoTecnologico> dispositivos, Cliente cliente, Date fechaCompra) {
        this.dispositivos = dispositivos;
        this.cliente = cliente;
        this.fechaCompra = fechaCompra;
    }
    public List<DispositivoTecnologico> getDispositivos() {
        return dispositivos;
    }
    public void setDispositivos(List<DispositivoTecnologico> dispositivos) {
        this.dispositivos = dispositivos;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}