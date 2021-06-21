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
    public long aux;
    public long montoTotal; // (precio inicial vehiculo - descuento en caso de existir
    public long montoAdeudo; // este servira para llevar control de la cantidad adeudada
    public int status; // Saber si Contrato Sigue Activo=0, Liquidado o Pagado Completamente=1  Cancelado=2
    Scanner read = new Scanner(System.in);
    Scanner readAux = new Scanner(System.in);


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
        
            System.out.println("\033[H\033[2J");
            System.out.flush();
        // Se asignan demas valores al nuevo contrato
            System.out.println("***** Creacion de Nuevo Contrato *****");
            System.out.println("Introduzca los Datos que se le Solicitan: ");
            System.out.println("\nDia Actual (2 digitos): ");
            diaVenta=read.nextInt();
            System.out.println("\nMes Actual (2 digitos): ");
            mesVenta=read.nextInt();
            System.out.println("\nAnio Actual (4 digitos): ");
            anioVenta=read.nextInt();
            montoTotal=v.precio;
            montoAdeudo=v.precio;
            v.cambiarDisponibilidad();
            status=0;
            e.aumentarVenta();

            System.out.println("\033[H\033[2J");
            System.out.flush();

        // Se muestra el status del contrato
            System.out.println("********* D.A System *********");
            System.out.println("Version 3.0");
            System.out.println("\n--- Resumen del Nuevo Contrato Creado ---");
            System.out.println("ID de Contrato Asignado: "+idContrato);
            idCliente=c.idCliente;
            System.out.println("\nID del Cliente: "+idCliente);
            matricula=v.matricula;
            System.out.println("\nID del Vehiculo Adquirido: "+matricula);
            idEmpleado=e.idEmpleado;
            System.out.println("\nID del Empleado que realizo la venta: "+idEmpleado);
            System.out.println("\nFecha de realizacion del Contrato: "+diaVenta+"/"+mesVenta+"/"+anioVenta);
            System.out.println("\nMonto Total de la Compra: "+montoTotal);
            System.out.println("\n\n!!!Creacion de Contrato Exitoso!!!");

            System.out.println("\nPulse Enter para Continuar... &");
            System.in.read();
            System.out.println("\033[H\033[2J");
            System.out.flush();

    // Se genera mensaje de error y no se ejecuta metodo al no haber espacio disponible
        }else{ System.out.println("!!Error al Crear un Nuevo Contrato!! No hay espacio suficiente"); }
    }
    
    // ### Imprimir los detalles Basicos del contrato ###
    public void showDetallesContrato(){
        if(status==0){
            System.out.print("ID: ("+idContrato+") Fecha de realizacion del Contrato: ("+diaVenta+"/"+mesVenta+"/"+anioVenta+") !!!Contrato Activo!!!");
        } else { 
            if (status==1){
                System.out.print("ID: ("+idContrato+") Fecha de realizacion del Contrato: ("+diaVenta+"/"+mesVenta+"/"+anioVenta+") !!!Contrato Liquidado!!!");
            }else {
                System.out.print("ID: ("+idContrato+") Fecha de realizacion del Contrato: ("+diaVenta+"/"+mesVenta+"/"+anioVenta+") !!!Contrato Cancelado!!!");
            }
        }
    }

    // ### Imprimir los detalles Completos del Contrato ###
    public void showDetallesContratoFull() throws IOException{
        System.out.println("\n*** Detalles del Contrato \""+idContrato+"\" ***");
        System.out.println("ID del Cliente: "+idCliente);
        System.out.println("\nMatricula del Coche Adquirido: "+matricula);
        System.out.println("\nID del Empleado que realizo la venta: "+idEmpleado);
        System.out.println("\nFecha de realizacion del Contrato: "+diaVenta+"/"+mesVenta+"/"+anioVenta);
        System.out.println("\nMonto Total de la Compra: $"+montoTotal);
        System.out.println("\nMonto de Adeudo restante por pagar: $"+montoAdeudo);
        if(status==0){
            System.out.print("Status del Contrato: (Contrato Activo)");
        } else { 
            if (status==1){
                System.out.print("Status del Contrato: (Contrato Liquidado)");
            } else {
                System.out.print("Status del Contrato: (Contrato Cancelado)");
            }
        }

        System.out.println("\nPulse Enter para Continuar... ");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    // ### Realizar Un Pago ###
    public void realizarPago() throws IOException{
        if (status==2 || status==1){
            System.out.println("\n!!!No se puede realizar Pago porque Contrato ya ha sido Cancelado o Liquidado!!!");
        } else {
            System.out.println("\n***** Realizacion de Pago *****");
            System.out.println("Introduzca el monto deseado a pagar (Numeros Enteros y Sin Comas)... &");
            aux = readAux.nextLong();
            montoAdeudo-=aux;
            System.out.println("\n\n!!!Pago Realizado con Exito!!!");
            if(montoAdeudo<=0){
                montoAdeudo=0;
                System.out.println("\n\n!!!Contrato Liquidado!!!");
                status=1;    
            }
            System.out.println("Adeudo despues del Pago: $"+montoAdeudo);
        }
       
        System.out.println("\nPulse Enter para Continuar... &");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
    
    public void cancelarContrato() throws IOException{
        if(status==0){
            status=2;
            montoAdeudo=0;
            System.out.println("\n!!!Contrato Cancelado con Exito!!!");   
        } else { 
            if (status==1){
                System.out.println("\n!!!Contrato no puede Cancelarse porque ya ha sido Liquidado!!!");
            } else {
                System.out.println("\n!!!Este Contrato ya ha sido Cancelado!!!");
            }
        }
        System.out.println("\nPulse Enter para Continuar... &");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

}
