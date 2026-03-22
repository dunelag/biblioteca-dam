public class Libro {
    private String titulo;
    private String autor;
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() { return titulo; }

    public boolean prestarLibro(String titulo) {
        return true;
    }

    public boolean devolverLibro(String titulo) {
        return true;
    }
}