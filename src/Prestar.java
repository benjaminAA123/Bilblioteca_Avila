import java.util.ArrayList;
import java.util.List;
public class Prestar {

    /** Private **/
    private String fecha_presentacion;

    private String fecha_devuelta;

    private List<Libro> books = new ArrayList<>();
    private List<Usuarios> users = new ArrayList<>();

    /** Public **/

    public void setFecha_presentacion(String fecha_presentacion){
        this.fecha_presentacion = fecha_presentacion;
    }
    public String getFecha_presentacion(){
        return fecha_presentacion;
    }
    public void setFecha_devuelta(String fecha_devuelta){
        this.fecha_devuelta = fecha_devuelta;
    }
    public String getFecha_devuelta(){
        return fecha_devuelta;
    }

    public void addLibro(Libro book){
        this.books.add(book);
    }
    public List<Libro> getBook() {
        return books;
    }

    public void addUser(Usuarios user){
        this.users.add(user);
    }
    public List<Usuarios> getUser() {
        return users;
    }

}


