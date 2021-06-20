package tienda;
import java.io.IOException;
import java.util.Scanner;

public class Empleado extends Persona {
    public String idEmpleado;
    public long salario;
    public int ventas; // cuantos coches ha vendido
    Scanner read = new Scanner(System.in);
    Scanner readAux= new Scanner(System.in);

// Metodos de Clase Empleado

    // ### Registrar Empleado ###
    public void registrarEmpleado(int numEmpleados) throws IOException{
        // Se ejecuta metodo solo si hay espacio disponible para otro registro
            if(numEmpleados<1000){
            // Se genera idEmpleado Automaticamente   
                if(numEmpleados<10){
                    idEmpleado="E00"+numEmpleados;
                } else if (numEmpleados<100){
                    idEmpleado="E0"+numEmpleados;
                } else { idEmpleado="E"+numEmpleados;}
    
            // Se asignan demas valores al nuevo contrato
                System.out.println("\n***** Creacion de Nuevo Empleado *****");
                System.out.println("Introduzca los siguientes Datos Solicitados:");
                System.out.println("Nombre(S) (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras): ");
                nombre=read.next();
                System.out.println("\nApellido Paterno (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras): ");
                aPaterno=read.next();
                System.out.println("\nApellido Materno (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras): ");
                aMaterno=read.next();
                System.out.println("\nEdad: ");
                edad=read.nextInt();
                System.out.println("\nCURP (Mayusculas): ");
                aux=read.next();
                setCurp(aux);
                System.out.println("\nCalle donde Reside el Empleado (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras): ");
                aux=read.next();
                setCalle(aux);
                System.out.println("\nColonia donde Reside el Empleado (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras): ");
                aux=read.next();
                setColonia(aux);
                System.out.println("\nMunicipio o Delegacion donde Reside el Empleado (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras): ");
                aux=read.next();
                setMunicipio(aux);
                System.out.println("\nEstado donde Reside el Empleado (Mayusculas y Minusculas) (Utilize Guion Bajo \"_\" para Separar Palabras): ");
                aux=read.next();
                setEstado(aux);
                System.out.println("\nTelefono (10 Digitos): ");
                aux2=readAux.nextLong();
                setTelefono(aux2);
                System.out.println("\nSalario: ");
                salario=readAux.nextLong();
                ventas=0;

                System.out.println("\033[H\033[2J");
                System.out.flush();
    
            // Se muestra el status del Nuevo Empleado
                System.out.println("--- Resumen del Nuevo Empleado Registrado ---");
                System.out.println("ID de Empleado Asignado: "+idEmpleado);
                System.out.println("\nNombre Completo del Empleado: "+nombre+" "+aPaterno+" "+aMaterno);
                System.out.println("\nEdad: "+edad);
                dom4=getCurp();
                System.out.println("\nCURP: "+dom4);
                dom0=getCalle();
                dom1=getColonia();
                dom2=getMunicipio();
                dom3=getEstado();
                System.out.println("\nDomicilio: "+dom0+", "+dom1+", "+dom2+", "+dom3);
                System.out.println("\nTelefono: "); getTelefono();
                System.out.println("\nSalario: $"+salario);
                System.out.println("\n!!!Creacion de Empleado Exitoso!!!");
    
                System.out.println("\nPulse Enter para Continuar... ");
                System.in.read();
                System.out.println("\033[H\033[2J");
                System.out.flush();
    
            } else {System.out.println("!!Error al Registrar un Nuevo Empleado!! No hay espacio suficiente"); }
    
        }
    
        // ### Mostrar Datos Basicos del Empleado ###
        public void showDetallesEmpleado(){
            System.out.print(" "+idEmpleado+" "+nombre+" "+aPaterno+" "+aMaterno+" Salario:($"+salario+")");
        }
    
        // ### Mostrar Datos Completos del Empleado ###
        public void showDetallesEmpleadoFull() throws IOException{
            System.out.println("\n*** Detalles del Empleado \""+idEmpleado+"\" ***");
            System.out.println("Nombre Completo del Empleado: "+nombre+" "+aPaterno+" "+aMaterno);
            System.out.println("\nEdad: "+edad);
            dom4=getCurp();
            System.out.println("\nCURP: "+dom4);
            dom0=getCalle();
            dom1=getColonia();
            dom2=getMunicipio();
            dom3=getEstado();
            System.out.println("\nDomicilio: "+dom0+", "+dom1+", "+dom2+", "+dom3);
            System.out.println("\nTelefono: "); getTelefono();
            System.out.println("\nSalario: $"+salario);
            System.out.println("\nVentas: "+ventas);
    
            System.out.println("\nPulse Enter para Continuar... ");
            System.in.read();
            System.out.println("\033[H\033[2J");
            System.out.flush();
        }

         // ### Mostrar Datos Basicos del Empleado ###
         public void editarSalario() throws IOException{
            System.out.println("\n*** Gestion de Salario del Empleado \""+idEmpleado+"\" ***");
            System.out.println("Salario Actual: $"+salario);
            System.out.println("\nIngrese la nueva cantidad de Salario a Asignar: ");
            salario=readAux.nextLong();

            System.out.println("\n!!!Cambio de Salario Exitoso!!!");
            System.out.println("Nuevo Salario: $"+salario);

            System.out.println("\nPulse Enter para Continuar... ");
            System.in.read();
            System.out.println("\033[H\033[2J");
            System.out.flush();
         }

         // ### Incrementar Ventas del Empleado ###
         public void aumentarVenta(){
             ventas++;
         }

}
