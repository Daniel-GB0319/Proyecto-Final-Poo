package tienda;

public class Empleado extends Persona {
    public String idEmpleado;
    public int salario;
    public int ventas; // cuantos coches ha vendido
    // Metodos

    public void generarIDC(int empleado){
        if(empleado<1000){
        // Se genera idEmpleado Automaticamente   
            if(empleado<10){
                idEmpleado="E00"+empleado;
            } else if (empleado<100){
                idEmpleado="E0"+empleado;
            } else { idEmpleado="E"+empleado; }
    }   

    public void showEmpleado(){
        System.out.println("\nDatos del Empleado \n");
        System.out.println("\nNombre Completo del Empleado: " + nombre + " " + aPaterno + " " + aMaterno );
        System.out.println("\nEdad: " + edad + "ID Empleado: " + idEmpleado + "Telefono: " + telefono );
        System.out.println("\nDireccion: " + domicilio + "CURP: " + curp);
    }
/* crear funcion generarID (int y).   ejemplo de id = E001 , E002 (usar concatenacion y variable "y" para 
generar ) (variable "y" proviene de main) 

funcion imprimir datos del empleado

*/ 
}
