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
            System.out.println("Introduzca los Datos que se le Solicitan:");
            System.out.println("Nombre(S) (Mayusculas y Minusculas)(Utilize Guion Bajo \"_\" para Separar Palabras)... &");
            nombre=read.nextLine();
            System.out.println("\nApellido Paterno (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras)... &");
            aPaterno=read.nextLine();
            System.out.println("\nApellido Materno (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras)... &");
            aMaterno=read.nextLine();
            System.out.println("\nEdad... &");
            edad=read.nextInt();
            System.out.println("\nCURP (Mayusculas)... &");
            aux=read.next();
            setCurp(aux);
            System.out.println("\nCalle donde Reside el Cliente (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras)... &");
            aux=read.next();
            setCalle(aux);
            System.out.println("\nColonia donde Reside el Cliente (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras)... &");
            aux=read.next();
            setColonia(aux);
            System.out.println("\nMunicipio o Delegacion donde Reside el Cliente (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras)... &");
            aux=read.next();
            setMunicipio(aux);
            System.out.println("\nEstado donde Reside el Cliente (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras)... &");
            aux=read.next();
            setEstado(aux);
            System.out.println("\nTelefono de Contacto (10 Digitos)... &");
            aux2=readAux.nextLong();
            setTelefono(aux2);

            System.out.println("\033[H\033[2J");
            System.out.flush();

        // Se muestra el status del Nuevo Cliente
            System.out.println("********* D.A System *********");
            System.out.println("Version 3.0");
            System.out.println("\n--- Resumen del Nuevo Cliente Registrado ---");
            System.out.println("ID de Cliente Asignado: "+idCliente);
            System.out.println("\nNombre Completo del Cliente: "+nombre+" "+aPaterno+" "+aMaterno);
            System.out.println("\nEdad: "+edad);
            dom4=getCurp();
            System.out.println("\nCURP: "+dom4);
            dom0=getCalle();
            dom1=getColonia();
            dom2=getMunicipio();
            dom3=getEstado();
            System.out.println("\nDomicilio: "+dom0+", "+dom1+", "+dom2+", "+dom3);
            System.out.println("\nTelefono de Contacto: "); getTelefono();
            System.out.println("\n\n!!!Creacion de Cliente Exitoso!!!");

            System.out.println("\nPulse Enter para Continuar... &");
            System.in.read();
            System.out.println("\033[H\033[2J");
            System.out.flush();

        } else {System.out.println("!!Error al Registrar un Nuevo Cliente!! No hay espacio suficiente"); }

    }

    // ### Mostrar Datos Completos del Cliente ###
    public void showDetallesCliente(){
        System.out.print("ID: ("+idCliente+") Nombre: "+nombre+" "+aPaterno+" "+aMaterno);
    }

    // ### Mostrar Datos Completos del Cliente ###
    public void showDetallesClienteFull() throws IOException{
        System.out.println("\n*** Detalles del Cliente \""+idCliente+"\" ***");
        System.out.println("\nNombre Completo del Cliente: "+nombre+" "+aPaterno+" "+aMaterno);
        System.out.println("\nEdad: "+edad);
        dom4=getCurp();
        System.out.println("\nCURP: "+dom4);
        dom0=getCalle();
        dom1=getColonia();
        dom2=getMunicipio();
        dom3=getEstado();
        System.out.println("\nDomicilio: "+dom0+", "+dom1+", "+dom2+", "+dom3);
        System.out.println("\nTelefono de Contacto: "); getTelefono();

        System.out.println("\nPulse Enter para Continuar... &");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

}
