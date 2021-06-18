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
    public Persona(){
        nombre=null;
        aPaterno=null;
        aMaterno=null;
        edad=null;
        curp=null;
        domicilio=null;
        telefono=null;
    }

    //Metodos
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getaPaterno(){
        return aPaterno;
    }
    public void setaPaterno(String aPaterno){
        this.aPaterno=aPaterno;
    }

    public String getaMaterno(){
        return aMaterno;
    }
    public void setaMaterno(String aMaterno){
        this.aMaterno=aMaterno;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad=edad;
    }

    public String getCurp(){
        return curp;
    }
    public void setCurp(String curp){
        this.curp=curp;
    }

    public String getDomicilio(){
        return domicilio;
    }
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
}
