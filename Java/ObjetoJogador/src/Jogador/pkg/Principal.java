package Jogador.pkg;

public class Principal {

    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.nome = "Neymar";
        jogador.posição = "Atacante";
        jogador.número = "10";
        jogador.time = "Barcelona";
        jogador.corCamisa = "Vermelha";
        jogador.chuteira = "Nike";
        System.out.printf("O jogador %s, de posição %s, número %s do time %s, cuja cor da camisa é %s,"
                + "usa chuteira da %s ", jogador.nome, jogador.posição, jogador.número, jogador.time, jogador.corCamisa, jogador.chuteira);
    }
}
