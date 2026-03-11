package atv;

public class Main {

    public static void main(String[] args) {

        BibliotecaJogos biblioteca = new BibliotecaJogos();

        Jogo j1 = new Jogo("Minecraft", "Sandbox", "PC");
        Jogo j2 = new Jogo("FIFA 24", "Esporte", "PlayStation");
        Jogo j3 = new Jogo("Zelda", "Aventura", "Nintendo");

        biblioteca.adicionarJogo1(j1);
        biblioteca.adicionarJogo2(j2);
        biblioteca.adicionarJogo3(j3);

        System.out.println("Biblioteca de Jogos:");
        biblioteca.listarJogos();
    }
}