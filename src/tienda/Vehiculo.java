package tienda;
import java.util.Scanner;

public class Vehiculo {
// Atributos
    public String matricula; // servira para identificarlos
    public String tipo;
    public String marca;
    public String modelo;
    public String anio;
    public double precio;
    public String color;
    public int estado; //nuevo = 0 o seminuevo = 1
    public int vendido; // servira para saber si ya se vendio o no. 0 = disponible   1 = vendido  

    Scanner read=new Scanner(System.in);

// Metodos
    public Vehiculo(){
        matricula=null;
        tipo=null;
        marca=null;
        modelo=null;
        anio=null;
        precio=null;
        color=null;
        estado=null;
        vendido=null;
    }

    public void registrarCoche(){

        System.out.println("\n\nA continuacion ingrese los datos solicitados para registrar un nuevo coche:");
        System.out.println("\n\nMatricula (7 Letras Mayusculas): ");
        matricula=read.nextLine();
        System.out.println("\n\nTipo de coche (Deportivo, Muscle, Sedan, Etc): ");
        tipo=read.nextLine();
        System.out.println("\n\nMarca: ");
        marca=read.nextLine();
        System.out.println("\n\nModelo (Mustang, A9, Etc): ");
        modelo=read.nextLine();
        System.out.println("\n\nAnio (Del Modelo): ");
        anio=read.nextLine();
        System.out.println("\n\nPrecio (Con Centavos): ");
        precio=read.nextLine();
        System.out.println("\n\nColor: ");
        color=read.nextLine();
        System.out.println("\n\nEstado (Nuevo = 0 o Seminuevo = 1): ");
        estado=read.nextLine();
        System.out.println("\n\nVendido (Disponible = 0 o Vendido = 1): ");
        vendido=read.nextLine();

        System.out.println("\nDatos Ingresados Del Vehiculo ");
        System.out.println("\nMatricula = " + matricula);
        System.out.println("\nTipo de coche = " + tipo);
        System.out.println("\nMarca = " + marca);
        System.out.println("\nModelo = " + modelo);
        System.out.println("\nAnio = " + anio);
        System.out.println("\nPrecio = " + precio);
        System.out.println("\nColor = " + color);
        System.out.println("\nEstado (Nuevo = 0 o Seminuevo = 1) = " + estado);
        System.out.println("\nVendido (Disponible = 0 o Vendido = 1) = " + vendido);
        
    }

    public void cambiarStatus(int estado){
        if(estado==1){
            estado=0;
        }else{
            estado=1;
        }
    }

    public void showDetalles(){
        System.out.println("\nDatos Del Vehiculo ");
        System.out.println("\nMatricula = " + matricula);
        System.out.println("\nMarca = " + marca);
        System.out.println("\nModelo = " + modelo);
        System.out.println("\nPrecio = " + precio);
    }

    public void showDetallesFull(){
        System.out.println("\nDatos Detallados Del Vehiculo ");
        System.out.println("\nMatricula = " + matricula);
        System.out.println("\nTipo de coche = " + tipo);
        System.out.println("\nMarca = " + marca);
        System.out.println("\nModelo = " + modelo);
        System.out.println("\nAnio = " + anio);
        System.out.println("\nPrecio = " + precio);
        System.out.println("\nColor = " + color);
        System.out.println("\nEstado (Nuevo = 0 o Seminuevo = 1) = " + estado);
        System.out.println("\nVendido (Disponible = 0 o Vendido = 1) = " + vendido);
    }

}
