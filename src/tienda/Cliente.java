package tienda;

public class Cliente extends Persona {
// Atributos
    public String idCliente;
// Metodos

public void generarIDE(int cliente){
    if(cliente<1000){
        // Se genera idCliente Automaticamente   
            if(cliente<10){
                idCliente="C00"+cliente;
            } else if (cliente<100){
                idCliente="C0"+cliente;
            } else { idCliente="C"+cliente; }
}

public void showCliente(){
    System.out.println("\nDatos del Cliente \n");
    System.out.println("\nNombre Completo del Empleado: " + nombre + " " + aPaterno + " " + aMaterno );
    System.out.println("\nEdad: " + edad + "ID Cliente: " + idCliente + "Telefono: " + telefono );
    System.out.println("\nDireccion: " + domicilio + "CURP: " + curp );
}
/* crear funcion generarID (int cliente).   ejemplo de id = C001 , C002 (usar concatenacion y variable "x" para 
generar ) (variable x proviene de main)

funcion imprimir datos del cliente

*/     
}
