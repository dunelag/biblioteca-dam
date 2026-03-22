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
public void mostrarLibros() {
    for (int i = 0; i < indice; i++) {
        System.out.println("- " + libros[i].getTitulo());
    }
}
}