package atv;

public class BibliotecaJogos {

    private Jogo jogo1;
    private Jogo jogo2;
    private Jogo jogo3;

    public void adicionarJogo1(Jogo jogo) {
        jogo1 = jogo;
    }

    public void adicionarJogo2(Jogo jogo) {
        jogo2 = jogo;
    }

    public void adicionarJogo3(Jogo jogo) {
        jogo3 = jogo;
    }

    public void listarJogos() {
        if (jogo1 != null) {
            jogo1.mostrar();
            System.out.println("--------");
        }

        if (jogo2 != null) {
            jogo2.mostrar();
            System.out.println("--------");
        }

        if (jogo3 != null) {
            jogo3.mostrar();
            System.out.println("--------");
        }
    }
}
