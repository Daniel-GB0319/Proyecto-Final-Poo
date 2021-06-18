package tienda;
import java.io.IOException;
import java.util.Scanner;

public class Cliente extends Persona {
// Atributos
    public String idCliente;
    Scanner read = new Scanner(System.in);
    Scanner readAux= new Scanner(System.in);

// Metodos de Clase Cliente

    // ### Registrar Cliente ###
    public void registrarCliente(int numClientes) throws IOException{
    // Se ejecuta metodo solo si hay espacio disponible para otro registro
        if(numClientes<1000){
        // Se genera idCliente Automaticamente   
            if(numClientes<10){
                idCliente="C00"+numClientes;
            } else if (numClientes<100){
                idCliente="C0"+numClientes;
            } else { idCliente="C"+numClientes;}

        // Se asignan demas valores al nuevo cliente
            System.out.println("\n***** Creacion de Nuevo Cliente *****");
            System.out.println("\nIntroduzca los Datos que se le Solicitan:");
            System.out.println("Nombre (Mayusculas y Minusculas): ");
            nombre=read.nextLine();
            System.out.println("\nApellido Paterno (Mayusculas y Minusculas): ");
            aPaterno=read.nextLine();
            System.out.println("\nApellido Materno (Mayusculas y Minusculas): ");
            aMaterno=read.nextLine();
            System.out.println("\nEdad: ");
            edad=read.nextInt();
            System.out.println("\nCURP (Mayusculas): ");
            aux=read.next();
            setCurp(aux);
            System.out.println("\nDomicilio (Calle, Colonia, Municipio o Delegacion, Estado) (Mayusculas y Minusculas): ");
            aux=read.next();
            setDomicilio(aux);
            System.out.println("\nTelefono (10 Digitos): ");
            aux2=readAux.nextLong();
            setTelefono(aux2);

            System.out.println("\033[H\033[2J");
            System.out.flush();

        // Se muestra el status del Nuevo Cliente
            System.out.println("\n--- Resumen del Nuevo Cliente ---");
            System.out.println("\nID de Cliente Asignado: "+idCliente);
            System.out.println("Nombre Completo del Cliente: "+nombre+" "+aPaterno+" "+aMaterno);
            System.out.println("Edad: "+edad);
            System.out.println("\nCURP: "); getCurp();
            System.out.println("\n\nDomicilio: "); getDomicilio();
            System.out.println("\n\nTelefono: "); getTelefono();
            System.out.println("\n\n!!!Creacion de Cliente Exitoso!!!");

            System.out.println("\nPulse Cualquier Tecla para Continuar... ");
            System.in.read();
            System.out.println("\033[H\033[2J");
            System.out.flush();

        } else {System.out.println("!!Error al Registrar un Nuevo Cliente!! No hay espacio suficiente"); }

    }

    // ### Mostrar Datos Completos del Cliente ###
    public void showDetallesCliente(){
        System.out.print(" "+idCliente+" "+nombre+" "+aPaterno+" "+aMaterno);
    }

    // ### Mostrar Datos Completos del Cliente ###
    public void showDetallesClienteFull() throws IOException{
        System.out.println("\n*** Detalles del Cliente \""+idCliente+"\" ***");
        System.out.println("\nNombre Completo del Cliente: "+nombre+" "+aPaterno+" "+aMaterno);
        System.out.println("\nEdad: "+edad);
        System.out.println("\nCURP: "); getCurp();
        System.out.println("\nDomicilio: "); getDomicilio();
        System.out.println("\nTelefono: "); getTelefono();

        System.out.println("\nPulse Cualquier Tecla para Continuar... ");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }


}
