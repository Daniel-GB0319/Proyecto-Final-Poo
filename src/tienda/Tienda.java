package tienda;
import java.io.IOException;
import java.util.Scanner;

// Este es una prueba
public class Tienda{
    public static void main(String[] args) throws IOException {
    // Se declaran variables y objetos necesarios para el programa
        int menu=1, i=0, numClientes=0, numCoches=0, numEmpleados=0, numContratos=0;
        Vehiculo [] coches = new Vehiculo[10];
        Cliente [] clientes = new Cliente[10];
        Empleado [] empleados = new Empleado[10];
        Contrato [] contratos = new Contrato[10];
        Scanner read= new Scanner(System.in);
        
    // Se inicializan Objetos Base
        Vehiculo maquetaVehiculo = new Vehiculo(); 
        maquetaVehiculo.registrarCoche();
        Cliente maquetaCliente = new Cliente(); 
        maquetaCliente.registrarCliente(numClientes);
        Empleado maquetaEmpleado = new Empleado(); 
        maquetaEmpleado.registrarEmpleado(numEmpleados);
        Contrato maquetaContrato = new Contrato(); 
        maquetaContrato.crearContrato(maquetaCliente,maquetaEmpleado,maquetaVehiculo,numContratos);

        do{ // Bucle para que funcione el programa hasta que usuario decida salir        
        // Menu Principal
            System.out.println("\n********* VENTA DE AUTOS *********");
            System.out.println("\n---- Menu Principal ----");
            System.out.println("1) Ver Catalogo de Coches");
            System.out.println("2) Comprar Coche");
            System.out.println("3) Gestionar Pedidos");
            System.out.println("4) Gestionar Clientes");
            System.out.println("5) Gestionar Empleados");
            System.out.println("0) Salir del Programa");
            System.out.println("\nIngrese la Opcion del menu deseada: ");
            menu = read.nextInt();

            switch(menu){
                case 1:
                /*
                prueba
                */ 
                coches[numCoches]=maquetaVehiculo;
                numCoches++;

                   for(i=0;i<numCoches;i++){
                       coches[i].showDetalles();
                   }
                break;

                case 2:

                break;

                case 3:

                break;

                case 4:

                break;

                case 5:

                break;

                case 0:
                    System.out.println("!!!Hasta la Proxima!!!");
                    System.out.println("\nPulse Cualquier Tecla para Continuar... ");
                    System.in.read();
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                break;

                default: 
                    System.out.println("!!!Opcion Invalida!!! Presione Cualquier Tecla para Intentar de Nuevo...");
                    System.out.println("\nPulse Cualquier Tecla para Continuar... ");
                    System.in.read();
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
            }

        }while(menu!=0); // Fin del Programa

        /* ESTRUCTURA DEL MENU PRINCIPAL Y SUBMENUS
        1 ver catalogo (SE UTILIZA CONTADOR "numCoches") (primero se imprime el array de objetos "catalogo" como una lista 
                        mostrando "matricula", "marca", "modelo" y "precio" de cada uno
                        solo si no se han vendido) (SI NO HAY COCHES REGISTRADOS, MANDAR MENSAJE DE CATALOGO VACIO)
            1.1 Registrar Nuevo Coche            
            1.2 Ver Detalles Especificos de un coche (se pide "matricula" y se ingresa a funcion para mostrar detalles especificos)
            1.3 Regresar
        
        2 comprar coche (Se pide "")
        3 Gestionar Pedidos
            3.1 ver detalles pedido (se pide "idpedido" al usuario)
            3.2 realizar pago (se pide "idpedido" y "monto" a pagar)
            3.3 cancelar pedido (se pide "idpedido" y se borra pedido)
            3.4 Regresar
        4 gestionar cliente
            4.1 registrar nuevo cliente
            4.2 ver detalles cliente ()
            4.3 Regresar
        5 gestionar empleado
            5.1 registrar nuevo empleado
            5.2 ver detalles empleado
            5.3 Regresar
        0 salir
        
        
        */ 
    }
}