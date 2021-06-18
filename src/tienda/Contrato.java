package tienda;
import java.io.IOException;
import java.util.Scanner;

public class Contrato { // clase "Venta" fue renombrado a Contrato
// Atributos
    public String idContrato;
    public String idCliente;
    public String matricula;
    public String idEmpleado; // empleado que vendio el coche
    public int diaVenta;
    public int mesVenta;
    public int anioVenta;
    public long montoTotal; // (precio inicial vehiculo - descuento en caso de existir
    public long montoAdeudo; // este servira para llevar control de la cantidad adeudada
    public long descuento;
    Scanner read = new Scanner(System.in);


// Metodos de Clase Contrato

    // ### Crear Contrato ###
    public void crearContrato(Cliente c,Empleado e,Vehiculo v,int numContratos) throws IOException{
    // Se ejecuta metodo solo si hay espacio disponible para otro registro
        if(numContratos<1000){
        // Se genera idContrato Automaticamente   
            if(numContratos<10){
                idContrato="CV00"+numContratos;
            } else if (numContratos<100){
                idContrato="CV0"+numContratos;
            } else { idContrato="CV"+numContratos; }
        
        // Se asignan demas valores al nuevo contrato
            System.out.println("\n***** Creacion de Nuevo Contrato *****");
            System.out.println("\nIntroduzca la fecha actual: ");
            System.out.println("\nDia (2 digitos): ");
            diaVenta=read.nextInt();
            System.out.println("\nMes (2 digitos): ");
            mesVenta=read.nextInt();
            System.out.println("\nAnio (4 digitos): ");
            anioVenta=read.nextInt();
            montoTotal=calcularMontoTotal(v);
            v.cambiarDisponibilidad();

            System.out.println("\033[H\033[2J");
            System.out.flush();

        // Se muestra el status del contrato
            System.out.println("\n--- Resumen del Nuevo Contrato ---");
            System.out.println("\nID de Contrato Asignado: "+idContrato);
            idCliente=c.idCliente;
            System.out.println("\nID del Cliente: "+idCliente);
            matricula=v.matricula;
            System.out.println("\nID del Vehiculo Adquirido: "+matricula);
            idEmpleado=e.idEmpleado;
            System.out.println("\nID del Empleado que realizo la venta: "+idEmpleado);
            System.out.println("\nFecha de realizacion del Contrato: "+diaVenta+"/"+mesVenta+"/"+anioVenta);
            System.out.println("\nMonto Total de la Compra: "+montoTotal);
            System.out.println("\n\n!!!Creacion de Contrato Exitoso!!!");

            System.out.println("\nPulse Cualquier Tecla para Continuar... ");
            System.in.read();
            System.out.println("\033[H\033[2J");
            System.out.flush();

    // Se genera mensaje de error y no se ejecuta metodo al no haber espacio disponible
        }else{ System.out.println("!!Error al Crear un Nuevo Contrato!! No hay espacio suficiente"); }
    }

    // ### Calcular monto con descuento ###
    public long calcularMontoTotal(Vehiculo v){
        System.out.println("\nIntroduzca el porcentaje de descuento a aplicar (0% - 100%)");
        descuento = read.nextLong()/100;
        return v.precio-(v.precio*descuento);
    }
    
    // ### Imprimir los detalles del contrato ###
    public void showDetallesContrato() throws IOException{
        System.out.println("\n*** Detalles del Contrato \""+idContrato+"\" ***");
        System.out.println("\nID del Cliente: "+idCliente);
        System.out.println("\nMatricula del Coche Adquirido: "+matricula);
        System.out.println("\nID del Empleado que realizo la venta: "+idEmpleado);
        System.out.println("\nFecha de realizacion del Contrato: "+diaVenta+"/"+mesVenta+"/"+anioVenta);
        System.out.println("\nMonto Total de la Compra: $"+montoTotal);
        System.out.println("\nMonto de Adeudo restante por pagar: $"+montoAdeudo);
        
        System.out.println("\nPulse Cualquier Tecla para Continuar... ");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    // ### Realizar Un Pago ###
    public void realizarPago() throws IOException{
        System.out.println("\n***** Realizacion de Pago *****");
        System.out.println("\nIntroduzca el monto deseado a pagar: ");
        montoAdeudo -= read.nextLong();
        System.out.println("\n\n!!!Pago Realizado con Exito!!!");
        System.out.println("\nAdeudo despues del Pago: $"+montoAdeudo);
        
        System.out.println("\n\nPulse Cualquier Tecla para Continuar... ");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();
    } 
}
