package tienda;

public class Persona {
// Atributos
    public String nombre;
    public String aPaterno;
    public String aMaterno;
    public int edad;
    public String aux;
    public long aux2;
    public String dom0;
    public String dom1;
    public String dom2;
    public String dom3;
    public String dom4;
    private String curp;
    private String calle;
    private String colonia;
    private String municipio;
    private String estado;
    private long telefono;

 //Metodos de Clase Padre Persona
    public String getCurp(){
        return this.curp; 
    }

    public void setCurp(String curp){
        this.curp=curp;
    }

    public String getCalle(){
        return this.calle; 
    }

    public void setCalle(String calle){
        this.calle=calle;
    }

    public String getColonia(){
        return this.colonia; 
    }

    public void setColonia(String colonia){
        this.colonia=colonia;
    }

    public String getMunicipio(){
        return this.municipio; 
    }

    public void setMunicipio(String municipio){
        this.municipio=municipio;
    }

    public String getEstado(){
        return this.estado; 
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    public void getTelefono(){
        System.out.print(this.telefono); 
    }

    public void setTelefono(long telefono){
        this.telefono=telefono;
    }
}
