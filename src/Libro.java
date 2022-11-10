public class Libro {
    private Integer isbn;
    private String autor;
    private String genero;
    private String titulo;
    private String fecha_public;

     // Metodos, secciones, comportamiento,

    public Integer getIsbn(){
        return isbn;
    }
    public void setIsbn(Integer isbn){
        this.isbn = isbn;
    }


    public String getAutor(){
        return autor;
    }
    public void  setAutor(String autor){
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }
    public void  setGenero(String genero){
        this.genero = genero;
    }

    public String getTitulo(){
        return titulo;
    }
    public void  setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getFecha_public(){
        return fecha_public;
    }
    public void  setFecha_public(String fecha_public){
        this.autor = fecha_public;
    }

}
