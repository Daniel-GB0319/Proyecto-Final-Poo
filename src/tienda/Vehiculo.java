package tienda;
import java.util.Scanner;

public class Vehiculo {
// Atributos
    public String matricula; // servira para identificarlos
    public String tipo;
    public String marca;
    public String modelo;
    public int anio;
    public int precio;
    public String color;
    public int estado; //nuevo o seminuevo
    public int vendido; // servira para saber si ya se vendio o no. 0 = disponible   1 = vendido  

    Scanner read=new Scanner(System.in);

// Metodos
    public void registrarCoche(){
        System.out.println("\n\nA continuacion ingrese los datos solicitados para registrar un nuevo coche:");
        System.out.println("\n\nMatricula (7 Letras Mayusculas): ");
        matricula=read.nextLine();
        System.out.println("Matricula = " + matricula);
    }

/* crear funcion "void registrarCoche()" para asignar valores a atributos de objeto
funcion "void cambiarStatus()" para cambiar "vendido=0" o "vendido=1" segun sea el caso */
    public void showDetalles(){
        System.out.println("Matricula: ("+matricula+") Marca: ("+marca+") Modelo: ("+modelo+") Precio: ($"+precio+")");
        //para imprimir detalles simples (matricula, marca, modelo, precio)
    } 

    public void showDetallesFull(){
        showDetalles();
        
    }


}
