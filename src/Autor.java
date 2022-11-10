public class Autor {

    private String nombres;
    private String apellidos;
    private String localidad;
    private String fecha_nacim;


    public String getNombres(){
        return nombres;
    }
    public void  setNombres(String nombres){
        this.nombres = nombres;
    }

    public String getApellidos(){
        return apellidos;
    }
    public void  setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getLocalidad(){
        return localidad;
    }
    public void  setLocalidad(String localidad){
        this.localidad = localidad;
    }

    public String getFecha_nacim(){
        return fecha_nacim;
    }
    public void  setFecha_nacim(String fecha_nacim){
        this.fecha_nacim = fecha_nacim;
    }


}
