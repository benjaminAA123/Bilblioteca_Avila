public class Usuarios {

        private Integer telefono;
        private String nombre;
        private String apellidos;
        private String dni;
        private String direccion;

        public Integer getTelefono(){
            return telefono;
        }
        public void setTelefono(Integer telefono){
            this.telefono = telefono;
        }

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getApellidos(){
            return apellidos;
        }
        public void setApellidos(String apellidos){
            this.apellidos = apellidos;
        }

        public String getDni(){
            return dni;
        }
        public void setDni(String dni){
            this.dni = dni;
        }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

}
