package planetas;

public class PHP extends Planeta implements IPlaneta{
    public PHP(String nome) {
        super(nome);
        this.translacao = 2;
        this.posicaoX = 8;
        this.posicaoY = 12;
    }

    public void mover(int momento) {
        int unidades = momento * translacao;
        int direcao = 0;
        for (int i = 0; i < unidades; i++) {
            if (direcao == 0) {
                posicaoX--;
                if (posicaoX == 3 && posicaoY == 12) {
                    direcao = 1;
                }
            } else if (direcao == 1) {
                posicaoY--;
                if (posicaoX == 3 && posicaoY == 3) {
                    direcao = 2;
                }
            } else if (direcao == 2) {
                posicaoX++;
            }
            if (posicaoX == 13 && posicaoY == 3) {
                direcao = 3;
            } else if (direcao == 3) {
                posicaoY++;
                if (posicaoX == 13 && posicaoY == 12) {
                    direcao = 0;
                }
            }

}}


}
