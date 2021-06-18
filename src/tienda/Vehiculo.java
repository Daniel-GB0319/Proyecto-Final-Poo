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
    public void registrarCoche(){
        
        int i;
        int cantidad=0;

        System.out.println("Cantidad de coches a registrar? ");
        cantidad = read.nextInt();
        for(i=1;i<=x;i++){
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

            System.out.println("\nDatos Ingresados Del Vehiculo " + i);
            System.out.println("Matricula = " + matricula);
            System.out.println("Tipo de coche = " + tipo);
            System.out.println("Marca = " + marca);
            System.out.println("Modelo = " + modelo);
            System.out.println("Anio = " + anio);
            System.out.println("Precio = " + precio);
            System.out.println("Color = " + color);
            System.out.println("Estado (Nuevo = 0 o Seminuevo = 1) = " + estado);
            System.out.println("Vendido (Disponible = 0 o Vendido = 1) = " + vendido);

        }
        
    }

/* crear funcion "void registrarCoche()" para asignar valores a atributos de objeto
funcion "void cambiarStatus()" para cambiar "vendido=0" o "vendido=1" segun sea el caso 
funcion "void showDetalles()" para imprimir detalles simples (matricula, marca, modelo, precio)
funcion "void showDetallesFull()" para imprimir todos los detalles (funcion showDetalles() + variables que faltan)
*/

}
