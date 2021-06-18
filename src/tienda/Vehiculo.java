package tienda;
import java.io.IOException;
import java.util.Scanner;

public class Vehiculo {
// Atributos
    public String matricula; // servira para identificarlos
    public String tipo;
    public String marca;
    public String modelo;
    public int anio;
    public long precio;
    public String color;
    public String estado; //nuevo o seminuevo
    public int vendido; // servira para saber si ya se vendio o no. 0 = disponible   1 = vendido  
    Scanner read=new Scanner(System.in);
    Scanner readAux=new Scanner(System.in);

// Metodos de la Clase Vehivulo

      // ### Registrar Vehiculo ###
    public void registrarCoche(int numCoches) throws IOException{
        // Se ejecuta metodo solo si hay espacio disponible para otro registro
        if(numCoches<1000){
            // Se asignan demas valores al nuevo contrato
                System.out.println("\n***** Registro de Nuevo Vehiculo *****");
                System.out.println("\nIntroduzca los Datos que se le Solicitan:");
                System.out.println("Matricula (7 Caracteres entre Mayusculas y Numeros): ");
                matricula=read.next();
                System.out.println("\nTipo de Vehiculo (Sedan, Muscle, Deportivo, SUV, etc.): ");
                tipo=read.next();
                System.out.println("\nMarca (Ford, BMW, Honda, Toyota, etc.): ");
                marca=read.next();
                System.out.println("\nModelo (Mayusculas y Minusculas): ");
                modelo=read.next();
                System.out.println("\nAnio (4 Digitos): ");
                anio=read.nextInt();
                System.out.println("\nPrecio (Enteros): ");
                precio=readAux.nextLong();
                System.out.println("\nColor (Mayusculas y Minusculas): ");
                color=read.next();
                System.out.println("\nEstado (Nuevo o Seminuevo): ");
                estado=read.next();
                vendido=0;

                System.out.println("\033[H\033[2J");
                System.out.flush();
    
            // Se muestra el status del Nuevo Vehiculo
                System.out.println("\n--- Resumen del Nuevo Vehiculo ---");
                System.out.println("\nMatricula: "+matricula);
                System.out.println("\nTipo de Vehiculo: "+tipo);
                System.out.println("\nMarca: "+marca);
                System.out.println("\nModelo: "+modelo);
                System.out.println("\nAnio: "+anio);
                System.out.println("\nPrecio: $"+precio); 
                System.out.println("\nColor: $"+color); 
                System.out.println("\nEstado: $"+estado); 
                System.out.println("\n\n!!!Registro de Vehiculo Exitoso!!!");
    
                System.out.println("\nPulse Cualquier Tecla para Continuar... ");
                System.in.read();
                System.out.println("\033[H\033[2J");
                System.out.flush();
    
            } else {System.out.println("!!Error al Registrar un Nuevo Vehiculo!! No hay espacio suficiente"); }
    
    }

    // ### Mostrar Detalles Basicos de Vehiculo ###
    public void showDetallesVehiculo(){
        System.out.println("Matricula: ("+matricula+") Marca: ("+marca+") Modelo: ("+modelo+") Precio: ($"+precio+")");
    } 

    // ### Mostrar Detalles Completos del Vehiculo ###
    public void showDetallesVehiculoFull() throws IOException{
        showDetallesVehiculo();
        System.out.println("Tipo: ("+tipo+") Anio: ("+anio+") Color: ("+color+") Estado: ($"+estado+")");
        if (vendido==0){System.out.println("!!!Disponible para Compra!!!");}
        else {System.out.println("!!!Vehiculo Vendido!!!");}

        System.out.println("\nPulse Cualquier Tecla para Continuar... ");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    // ### Cambiar estado (Vendido o Disponible) del Vehiculo ###
    public void cambiarDisponibilidad(){
        if(vendido==0){vendido=1;}
        else {vendido=0;}    
    }

}
