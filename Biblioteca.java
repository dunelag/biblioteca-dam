public class Biblioteca {
    private Libro[] libros;
    private int indice;
    public Biblioteca(int capacidad) {
        this.libros = new Libro[capacidad];
        this.indice = 0;
    }

    public void agregarLibro(Libro libro) {
    if (indice < libros.length) {
        libros[indice] = libro;
        indice++;
    }
}
}