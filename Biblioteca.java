public class Biblioteca {
    private Libro[] libros;
    private int indice;
    public Biblioteca(int capacidad) {
        this.libros = new Libro[capacidad];
        this.indice = 0;
    }
}