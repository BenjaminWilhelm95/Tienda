package menuprincipal;
import dispositivos.DispositivoTecnologico;
import java.util.List;
import java.util.Scanner;
import tienda.TiendaTecnologica;
import cliente.Cliente;
public class MenuPrincipal {
    private TiendaTecnologica tienda;
    private Scanner scanner;

    public MenuPrincipal() {
        tienda = new TiendaTecnologica();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("==== Menú Principal ====");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Realizar Venta");
            System.out.println("3. Obtener Información de Dispositivo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    realizarVenta();
                    break;
                case 3:
                    obtenerInformacionDispositivo();
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private void agregarCliente() {
        System.out.println("==== Agregar Cliente ====");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico del cliente: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Ingrese el número de contacto del cliente: ");
        String numeroContacto = scanner.nextLine();
        System.out.print("Ingrese el estado civil del cliente: ");
        String estadoCivil = scanner.nextLine();
        System.out.print("Ingrese la ciudad del cliente: ");
        String ciudad = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, apellido, correoElectronico, numeroContacto, estadoCivil, ciudad);

        if (!clienteExistente(nuevoCliente)) {
            tienda.agregarCliente(nuevoCliente);
            System.out.println("Cliente agregado exitosamente.");
        } else {
            System.out.println("El cliente ya existe en el sistema.");
        }
    }

    private boolean clienteExistente(Cliente cliente) {
        // para verificar si el cliente ya existe en la tienda
        List<Cliente> clientes = tienda.getClientes();
        for (Cliente c : clientes) {
            if (c.getCorreoElectronico().equals(cliente.getCorreoElectronico())) {
                return true;
            }
        }
        return false;
    }
    private void realizarVenta() {
        System.out.println("==== Realizar Venta ====");
    }
    private void obtenerInformacionDispositivo() {
        System.out.println("==== Obtener Información de Dispositivo ====");
        System.out.print("Ingrese la marca del dispositivo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del dispositivo: ");
        String modelo = scanner.nextLine();

        List<DispositivoTecnologico> dispositivos = tienda.buscarDispositivosPorMarcaModelo(marca, modelo);

        if (!dispositivos.isEmpty()) {
            for (DispositivoTecnologico dispositivo : dispositivos) {
                System.out.println("Información del Dispositivo:");
                System.out.println("Marca: " + dispositivo.getMarca());
                System.out.println("Modelo: " + dispositivo.getModelo());
                System.out.println("Precio: " + dispositivo.getPrecio());
                System.out.println("Cantidad en Stock: " + dispositivo.getCantidadEnStock());
            }
        } else {
            System.out.println("El dispositivo no se encontró en el catálogo.");
        }
    }
}