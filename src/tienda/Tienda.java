package tienda;
import java.io.IOException;
import java.util.Scanner;

// Este es una prueba
public class Tienda{
    public static void main(String[] args) throws IOException {
    // Se declaran variables y objetos necesarios para el programa
        int menu=1, submenu=0, i=0,j=0,k=0,l=0, numClientes=1, numCoches=1, numEmpleados=1, numContratos=1;
        Vehiculo [] coches = new Vehiculo[10];
        Cliente [] clientes = new Cliente[10];
        Empleado [] empleados = new Empleado[10];
        Contrato [] contratos = new Contrato[10];
        Scanner read = new Scanner(System.in);
        
    // Se inicializan Objetos Base
        for(i=0;i<10;i++){
            clientes[i]=new Cliente();
            empleados[i]=new Empleado();
            coches[i]=new Vehiculo();
            contratos[i]=new Contrato();
        }
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println("********* D.A System *********");
        System.out.println("Version 3.0");
        System.out.println("\nAutores:");
        System.out.println("$ Gonzalez Barrientos Geovanni Daniel");
        System.out.println("$ Vallejo Garcia Alan Gerardo");
        System.out.println("\nProyecto Final \"Programacion Orientada a Objetos\"");
        System.out.println("Grupo: 2CV12");
        System.out.println("\n!!!!Bienvenido!!!!");
        System.out.println("Pulse Enter para Iniciar El Programa... &");
        System.in.read();
        System.out.println("\033[H\033[2J");
        System.out.flush();

        do{ // Bucle para que funcione el programa hasta que usuario decida salir               
            System.out.println("\033[H\033[2J"); // Se limpia pantalla
            System.out.flush();
            
            // Menu Principal
            System.out.println("********* D.A System *********");
            System.out.println("Version 3.0");
            System.out.println("\n---- Menu Principal ----");
            System.out.println("1) Ver Catalogo de Vehiculos");
            System.out.println("2) Comprar Coche");
            System.out.println("3) Gestionar Pedidos");
            System.out.println("4) Gestionar Clientes");
            System.out.println("5) Gestionar Empleados");
            System.out.println("0) Salir del Programa");
            System.out.println("\nIngrese el Numero correspondiente a la Opcion deseada y pulse Enter... &");
            menu = read.nextInt();

            switch(menu){
                case 1: // Opcion Menu Principal 1) Catalogo de Vehiculos
                    do{
                        System.out.println("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("********* D.A System *********");
                        System.out.println("Version 3.0");
                        System.out.println("\n---- Catalogo de Vehiculos Registrados ----");
                        
                        // Se verifica si hay Existencia en Catalogos
                        if (numCoches==1){// No hay Coches Registrados
                            System.out.println("!!!No hay Coches Registrados Actualmente en Catalogo!!!");
                        } else {// Si hay coches registrados y se imprimen en pantalla
                            for(i=1;i<numCoches;i++){
                                System.out.println("\n"+i+") "); coches[i].showDetallesVehiculo();
                            }
                        }
                        //Submenu de Catalogo
                        System.out.println("\n\nOpciones:");
                        System.out.println("1) Registrar un Nuevo Coche");
                        System.out.println("2) Ver Detalles Especificos de un Coche");
                        System.out.println("0) Regresar al Menu Principal");
                        System.out.println("Ingrese el numero correspondiente a la Opcion deseada y pulse Enter... &");
                        submenu = read.nextInt();

                        switch(submenu){// SubMenu de Catalogo
                            case 1: // Opcion Catalogo 1) Registrar un Nuevo Coche 
                                coches[numCoches].registrarCoche(numCoches);
                                numCoches++; break;
            
                            case 2: // Opcion Catalogo 2) Ver Detalles Especificos de un Coche
                                if (numCoches!=1){
                                    System.out.println("\nIngrese el Numero Correspondiente al Inciso del Vehiculo que desea ver y pulse Enter... &");
                                    i = read.nextInt();
                                    if(i<=numCoches && i>=1){
                                        coches[i].showDetallesVehiculoFull();
                                    } else {
                                        System.out.println("\n!!!Opcion No Corresponde con algun Inciso Mostrado!!!");
                                        System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                                        System.in.read();    
                                    }
                                } else {
                                    System.out.println("\n!!!No Hay Coches Registrados!!!");
                                    System.out.println("\nPulse Enter para Continuar... &");
                                    System.in.read();
                                }    
                            break;
            
                            case 0: // Opcion Catalogo 0) Regresar al Menu Principal
                                System.out.println("\n!!!Regresando al Menu Principal!!!");
                                System.out.println("\nPulse Enter para Continuar... &");
                                System.in.read(); break;
            
                            default: // Opcion por si se ingresa opcion invalida
                                System.out.println("\n!!!Opcion Invalida!!!");
                                System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                                System.in.read();
                        }
                    }while(submenu!=0); // Termina Catalogo de Vehiculos 
                break;

                case 2: // Opcion Menu Principal 2) Comprar Coche
                    if(numClientes>1 && numCoches>1 && numEmpleados>1){ // Si hay elementos para crear un contrato
                        // Se muestran los Clientes Registrados
                        System.out.println("\n---- Clientes Registrados ----");
                        for(i=1;i<numClientes;i++){
                            System.out.println("\n"+i+") "); clientes[i].showDetallesCliente();
                        }
                        System.out.println("\n\nIngrese el Numero correspondiente al Cliente que realiza la Compra... & ");
                        l = read.nextInt();

                        // Se muestran los Empleados Registrados
                        System.out.println("\n---- Empleados Registrados ----");
                        for(i=1;i<numEmpleados;i++){
                            System.out.println("\n"+i+") "); empleados[i].showDetallesEmpleado();
                        }
                        System.out.println("\n\nIngrese el Numero correspondiente al Empleado que realiza la Venta... & ");
                        j = read.nextInt();

                        // Se muestran los Vehiculos Registrados
                        System.out.println("\n---- Vehiculos Registrados en Catalogo ----");
                        for(i=1;i<numCoches;i++){
                            System.out.println("\n"+i+") "); coches[i].showDetallesVehiculo();
                        }
                        System.out.println("\n\nIngrese el Numero correspondiente al Vehiculo que se desea Comprar... & ");
                        k = read.nextInt();
                        contratos[numContratos].crearContrato(clientes[l], empleados[j], coches[k], numContratos);
                        numContratos++;

                    } else{ // No hay Elementos para Crear un Contrato
                        if(numClientes==1){
                            System.out.println("\n!!!No hay Clientes Registrados!!! Ingrese a \"Gestionar Clientes\" para registrar uno. ");
                        }
                        if(numEmpleados==1){
                            System.out.println("\n!!!No hay Empleados Registrados!!! Ingrese a \"Gestionar Empleados\" para registrar uno. ");
                        }
                        if(numCoches==1){
                            System.out.println("\n!!!No hay Vehiculos Registrados!!! Ingrese a \"Ver Catalogo de Vehiculos\" para registrar uno. ");
                        }

                        System.out.println("\nPulse Enter para Continuar... &");
                        System.in.read();
                    }
                break; // Termina Comprar Coche

                case 3: // Opcion Menu Principal 3) Gestionar Contratos
                do{
                    System.out.println("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("********* D.A System *********");
                    System.out.println("Version 3.0");
                    System.out.println("\n---- Lista de Contratos Registrados ----");
                    
                    // Se verifica si hay Existencia de Contratos
                    if (numContratos==1){// No hay Contratos Registrados
                        System.out.println("!!!No hay Contratos Realizados!!! Seleccione \"Comprar Coche\" para crear uno nuevo.");
                    } else {// Si hay contratos registrados y se imprimen en pantalla
                        for(i=1;i<numContratos;i++){
                            System.out.println("\n"+i+") "); contratos[i].showDetallesContrato();
                        }
                    }
                    //Submenu de Gestion de Pedidos
                    System.out.println("\n\nOpciones:");
                    System.out.println("1) Ver Detalles Completos de un Contratos");
                    System.out.println("2) Realizar Pago");
                    System.out.println("3) Cancelar un Pedido");
                    System.out.println("0) Regresar al Menu Principal");
                    System.out.println("Ingrese el numero correspondiente a la Opcion deseada y pulse Enter... & ");
                    submenu = read.nextInt();

                    switch(submenu){// SubMenu de Gestion de Contratos
                        case 1: // Opcion Gestionar Pedidos 1) Ver Detalles Completos de Contratos 
                        if (numContratos!=1){
                            System.out.println("\nIngrese el Numero Correspondiente al Inciso del Contrato que desea ver y pulse Enter... & ");
                            i = read.nextInt();
                            if(i<=numContratos && i>=1){
                                contratos[i].showDetallesContratoFull();
                            } else {
                                System.out.println("\n!!!Opcion No Corresponde con algun Inciso Mostrado!!!");
                                System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                                System.in.read();    
                            }
                        } else {
                            System.out.println("\n!!!No Hay Contratos Registrados!!!");
                            System.out.println("\nPulse Enter para Continuar... &");
                            System.in.read();
                        } 
                        break;
        
                        case 2: // Opcion Catalogo 2) Ver Detalles Especificos de un Coche
                            if (numContratos!=1){
                                System.out.println("\nIngrese el Numero Correspondiente al Inciso del Contrato que desea realizar el Pago y pulse Enter... & ");
                                i = read.nextInt();
                                if(i<=numContratos && i>=1){
                                    contratos[i].realizarPago();
                                } else {
                                    System.out.println("\n!!!Opcion No Corresponde con algun Inciso Mostrado!!!");
                                    System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                                    System.in.read();    
                                }
                            } else {
                                System.out.println("\n!!!No Hay Contratos Registrados!!!");
                                System.out.println("\nPulse Enter para Continuar... &");
                                System.in.read();
                            }    
                        break;

                        case 3: // Opcion Gestion Pedidos 3) Cancelar Contrato
                            if (numContratos!=1){
                                System.out.println("\nIngrese el Numero Correspondiente al Inciso del Contrato que desea Cancelar y pulse Enter: &");
                                i = read.nextInt();
                                if(i<=numContratos && i>=1){
                                    for(k=1;k<numCoches;k++){
                                        if(contratos[i].matricula==coches[k].matricula){
                                            coches[k].cambiarDisponibilidad();
                                        }
                                    }
                                    contratos[i].cancelarContrato();
                                    
                                } else {
                                    System.out.println("\n!!!Opcion No Corresponde con algun Inciso Mostrado!!!");
                                    System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                                    System.in.read();    
                                }
                            } else {
                                System.out.println("\n!!!No Hay Contratos Registrados!!!");
                                System.out.println("\nPulse Enter para Continuar... &");
                                System.in.read();
                            }    
                        break;
        
                        case 0: // Opcion Catalogo 0) Regresar al Menu Principal
                            System.out.println("\n!!!Regresando al Menu Principal!!!");
                            System.out.println("\nPulse Enter para Continuar... &");
                            System.in.read(); break;
        
                        default: // Opcion por si se ingresa opcion invalida
                            System.out.println("\n!!!Opcion Invalida!!!");
                            System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                            System.in.read();
                    }
                }while(submenu!=0); // Termina Gestion de Pedidos 
                break;

                case 4: // Opcion Menu Principal 4) Gestionar Clientes
                do{
                    System.out.println("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("********* D.A System *********");
                    System.out.println("Version 3.0");
                    System.out.println("\n---- Lista de Clientes Registrados ----");
                    
                    // Se verifica si hay Existencia de Clientes
                    if (numClientes==1){// No hay Clientes Registrados
                        System.out.println("!!!No hay Clientes Registrados!!!");
                    } else {// Si hay clientes registrados y se imprimen en pantalla
                        for(i=1;i<numClientes;i++){
                            System.out.println("\n"+i+") "); clientes[i].showDetallesCliente();
                        }
                    }
                    //Submenu de Gestionar Clientes
                    System.out.println("\n\nOpciones:");
                    System.out.println("1) Registrar un Nuevo Cliente");
                    System.out.println("2) Ver Detalles Especificos de un Cliente");
                    System.out.println("0) Regresar al Menu Principal");
                    System.out.println("Ingrese el numero correspondiente a la Opcion deseada y pulse Enter... &");
                    submenu = read.nextInt();

                    switch(submenu){// SubMenu de Gestionar Clientes
                        case 1: // Opcion Gestionar Clientes 1) Registrar un Nuevo Cliente 
                            clientes[numClientes].registrarCliente(numClientes);
                            numClientes++; break;
        
                        case 2: // Opcion Gestionar Clientes 2) Ver Detalles Especificos de un Cliente
                            if (numClientes!=1){
                                System.out.println("\nIngrese el Numero Correspondiente al Inciso del Cliente que desea ver y pulse Enter... & ");
                                i = read.nextInt();
                                if(i<=numClientes && i>=1){
                                    clientes[i].showDetallesClienteFull();
                                } else {
                                    System.out.println("\n!!!Opcion No Corresponde con algun Inciso Mostrado!!!");
                                    System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                                    System.in.read();    
                                }
                            } else {
                                System.out.println("\n!!!No Hay Clientes Registrados!!!");
                                System.out.println("\nPulse Enter para Continuar... &");
                                System.in.read();
                            }    
                        break;
        
                        case 0: // Opcion Gestionar Clientes 0) Regresar al Menu Principal
                            System.out.println("\n!!!Regresando al Menu Principal!!!");
                            System.out.println("\nPulse Enter para Continuar... &");
                            System.in.read(); break;
        
                        default: // Opcion por si se ingresa opcion invalida
                            System.out.println("\n!!!Opcion Invalida!!!");
                            System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                            System.in.read();
                    }
                }while(submenu!=0); // Termina Gestion de Clientes
                break;

                case 5: // Opcion Menu Principal 5) Gestionar Empleados
                do{
                    System.out.println("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("********* D.A System *********");
                    System.out.println("Version 3.0");
                    System.out.println("---- Lista de Empleados Registrados ----");
                    
                    // Se verifica si hay Existencia de Empleados
                    if (numEmpleados==1){// No hay Empleados Registrados
                        System.out.println("!!!No hay Empleados Registrados!!!");
                    } else {// Si hay empleados registrados y se imprimen en pantalla
                        for(i=1;i<numEmpleados;i++){
                            System.out.println("\n"+i+") "); empleados[i].showDetallesEmpleado();
                        }
                    }
                    //Submenu de Gestionar Empleados
                    System.out.println("\n\nOpciones:");
                    System.out.println("1) Registrar un Nuevo Empleado");
                    System.out.println("2) Ver Detalles Especificos de un Empleado");
                    System.out.println("3) Cambiar Salario de un Empleado");
                    System.out.println("0) Regresar al Menu Principal");
                    System.out.println("Ingrese el numero correspondiente a la Opcion deseada y pulse Enter... & ");
                    submenu = read.nextInt();

                    switch(submenu){// SubMenu de Gestionar Empleados
                        case 1: // Opcion Gestionar Empleados] 1) Registrar un Nuevo Empleado 
                            empleados[numEmpleados].registrarEmpleado(numEmpleados);
                            numEmpleados++; break;
        
                        case 2: // Opcion Gestionar Empleados 2) Ver Detalles Especificos de un Empleado
                            if (numEmpleados!=1){
                                System.out.println("\nIngrese el Numero Correspondiente al Inciso del Empleado que desea ver y pulse Enter... &");
                                i = read.nextInt();
                                if(i<=numEmpleados && i>=1){
                                    empleados[i].showDetallesEmpleadoFull();
                                } else {
                                    System.out.println("\n!!!Opcion No Corresponde con algun Inciso Mostrado!!!");
                                    System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                                    System.in.read();    
                                }
                            } else {
                                System.out.println("\n!!!No Hay Empleados Registrados!!!");
                                System.out.println("\nPulse Enter para Continuar... &");
                                System.in.read();
                            }    
                        break;

                        case 3: // Opcion Gestionar Empleados 3) Cambiar Salario de un Empleado
                        if (numEmpleados!=1){
                            System.out.println("\nIngrese el Numero Correspondiente al Inciso del Empleado que desea Cambiar Salario y pulse Enter... &");
                            i = read.nextInt();
                            if(i<=numEmpleados && i>=1){
                                empleados[i].editarSalario();
                            } else {
                                System.out.println("\n!!!Opcion No Corresponde con algun Inciso Mostrado!!!");
                                System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                                System.in.read();    
                            }
                        } else {
                            System.out.println("\n!!!No Hay Empleados Registrados!!!");
                            System.out.println("\nPulse Enter para Continuar... &");
                            System.in.read();
                        }   
                        break;
        
                        case 0: // Opcion Gestionar Empleados 0) Regresar al Menu Principal
                            System.out.println("\n!!!Regresando al Menu Principal!!!");
                            System.out.println("\nPulse Enter para Continuar... &");
                            System.in.read(); break;
        
                        default: // Opcion por si se ingresa opcion invalida
                            System.out.println("\n!!!Opcion Invalida!!!");
                            System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                            System.in.read();
                    }
                }while(submenu!=0); // Termina Gestion de Empleados
                break;

                case 0: // Opcion Menu Principal 0) Salir del Programa
                    System.out.println("\n!!!Hasta la Proxima!!!");
                    System.out.println("\nPulse Enter para Finalizar el Programa... &");
                    System.in.read();
                    System.out.println("\033[H\033[2J");
                    System.out.flush(); break;

                default: // Opcion por si se ingresa opcion invalida
                    System.out.println("\n!!!Opcion Invalida!!!");
                    System.out.println("\nPulse Enter para Intentar de Nuevo... &");
                    System.in.read();
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
            }

        }while(menu!=0); // Fin del Programa

    }
}