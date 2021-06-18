package tienda;

public class Persona {
// Atributos
    public String nombre;
    public String aPaterno;
    public String aMaterno;
    public int edad;
    public String aux;
    public long aux2;
    private String curp;
    private String domicilio;
    private long telefono;

 //Metodos de Clase Padre Persona
    public void getCurp(){
        System.out.print(this.curp); 
    }

    public void setCurp(String curp){
        this.curp=curp;
    }

    public void getDomicilio(){
        System.out.print(this.domicilio); 
    }

    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }

    public void getTelefono(){
        System.out.print(this.telefono); 
    }

    public void setTelefono(long telefono){
        this.telefono=telefono;
    }
}
