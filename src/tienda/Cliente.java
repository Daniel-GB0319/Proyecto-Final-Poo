package tienda;

public class Cliente extends Persona {
// Atributos
    public String idCliente;
// Metodos

    public void registrarCliente(int numClientes){
        // Se ejecuta metodo solo si hay espacio disponible para otro registro
        if(numClientes<1000){
            // Se genera idContrato Automaticamente   
                if(numClientes<10){
                    idCliente="CV00"+numClientes;
                } else if (numClientes<100){
                    idCliente="CV0"+numClientes;
                } else { idCliente="CV"+numClientes;}
        }
/* crear funcion generarID (int x).   ejemplo de id = C001 , C002 (usar concatenacion y variable "x" para 
generar ) (variable x proviene de main)

funcion imprimir datos del cliente

*/     
}
}
