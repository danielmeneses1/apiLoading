package planetas;

public class PHP extends Planeta{
    public PHP(String nome) {
        super(nome);
        this.Nome = "Php";
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
                if (posicaoX == 4 && posicaoY == 11) {
                    direcao = 1;
                }
            } else if (direcao == 1) {
                posicaoY--;
                if (posicaoX == 4 && posicaoY == 4) {
                    direcao = 2;
                }
            } else if (direcao == 2) {
                posicaoX++;
            }
            if (posicaoX == 12 && posicaoY == 4) {
                direcao = 3;
            } else if (direcao == 3) {
                posicaoY++;
                if (posicaoX == 12 && posicaoY == 11) {
                    direcao = 0;
                }
            }

}}}
