package tienda;

public class Persona {
// Atributos
    public String nombre;
    public String aPaterno;
    public String aMaterno;
    public int edad;
    private String curp; // curp en lugar de ine
    private String domicilio;
    private int telefono;

    //Metodos

    public String getCurp(){
        return this.curp;
    }
    public void setCurp(String curp){
        this.curp=curp;
    }

    public String getDomicilio(){
        return this.domicilio;
    }
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
}
