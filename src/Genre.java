public class Genre {


    private Integer id;
    private String nombre;
    private String descripcion;
    public void setId(Integer genreId) {
        id = genreId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
