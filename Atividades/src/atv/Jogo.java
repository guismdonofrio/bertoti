package atv;

public class Jogo {

    private String titulo;
    private String genero;
    private String plataforma;

    public Jogo(String titulo, String genero, String plataforma) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public boolean comparar(Jogo jogo) {
        if (this.titulo.equals(jogo.titulo) &&
            this.genero.equals(jogo.genero) &&
            this.plataforma.equals(jogo.plataforma)) {
            return true;
        }
        return false;
    }

    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Plataforma: " + plataforma);
    }
}
