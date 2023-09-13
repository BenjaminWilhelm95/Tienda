package tienda;
import compras.Compra;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import dispositivos.DispositivoTecnologico;
import cliente.Cliente;
public class TiendaTecnologica {
    private List<Cliente> clientes;
    private List<DispositivoTecnologico> catalogo;
    private List<Compra> compras;

    public TiendaTecnologica() {
        clientes = new ArrayList<>();
        catalogo = new ArrayList<>();
        compras = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
    public List<DispositivoTecnologico> buscarDispositivosPorMarcaModelo(String marca, String modelo) {
        List<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<>();
        for (DispositivoTecnologico dispositivo : catalogo) {
            if (dispositivo.getMarca().equals(marca) && dispositivo.getModelo().equals(modelo)) {
                dispositivosEncontrados.add(dispositivo);
            }
        }
        return dispositivosEncontrados;
    }
    public void registrarCompra(Compra compra) {
        compras.add(compra);
        for (DispositivoTecnologico dispositivo : compra.getDispositivos()) {
            // Actualizar el stock de dispositivos después de una compra
            dispositivo.setCantidadEnStock(dispositivo.getCantidadEnStock() - 1);
        }
    }

    public void agregarDispositivo(DispositivoTecnologico dispositivo) {
        catalogo.add(dispositivo);
    }

    public List<DispositivoTecnologico> buscarDispositivosPorTipo(String tipo) {
        List<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<>();
        for (DispositivoTecnologico dispositivo : catalogo) {
            if (dispositivo.getClass().getSimpleName().equals(tipo)) {
                dispositivosEncontrados.add(dispositivo);
            }
        }
        return dispositivosEncontrados;
    }

    public void realizarVenta(Cliente cliente, List<DispositivoTecnologico> dispositivos) {
        Compra compra = new Compra(dispositivos, cliente, new Date());
        registrarCompra(compra);
    }

}