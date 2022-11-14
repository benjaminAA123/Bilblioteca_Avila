public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");


        Libro book = new Libro();

        book.setIsbn(1);
        book.setAutor("Lyman Frank Braum");
        book.setTitulo("Mago de oz");
        book.setGenero("Fantasia");
        book.setFecha_public("1/2/1900");

        System.out.println(book.getIsbn());
        System.out.println(book.getAutor());
        System.out.println(book.getTitulo());
        System.out.println(book.getGenero());
        System.out.println(book.getFecha_public());

        Autor author = new Autor();
        author.setNombres("Lyman_Frank");
        author.setApellidos("Braum");
        author.setLocalidad("Nueva_York");
        author.setFecha_nacim("06/05/1919");

        System.out.println(author.getNombres());
        System.out.println(author.getApellidos());
        System.out.println(author.getLocalidad());
        System.out.println(author.getFecha_nacim());


        Usuarios user = new Usuarios();

        user.setNombre("Marco");
        user.setApellidos("Garcia");
        user.setDni("7456546545A");
        user.setDireccion("Calle de la iglesia");
        user.setTelefono(653578785);

        System.out.println(user.getNombre());
        System.out.println(user.getApellidos());
        System.out.println(user.getDni());
        System.out.println(user.getDireccion());
        System.out.println(user.getTelefono());

        Prestar loan = new Prestar();

        loan.setFecha_presentacion("Manolo");
        loan.setFecha_devuelta("Tomates");

        System.out.println(loan.getFecha_presentacion());
        System.out.println(loan.getFecha_devuelta());


    }
}