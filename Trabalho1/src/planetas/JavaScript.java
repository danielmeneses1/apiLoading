package planetas;

public class JavaScript extends Planeta{
    public JavaScript(String nome) {
        super(nome);
        this.Nome = "JavaScript";
        this.translacao = 3;
        this.posicaoX = 8;
        this.posicaoY = 10;
    }

    public void mover(int momento){
        int unidades = momento * translacao;
        int direcao = 0;
        for (int i = 0; i<unidades; i++){
            if(direcao == 0){
                posicaoX--;
                if(posicaoX ==5 && posicaoY ==10){
                    direcao = 1;}
            }else if (direcao ==1){
                posicaoY--;
                if (posicaoX ==5&&posicaoY==5){
                    direcao =2;}
            } else if (direcao ==2) {
                posicaoX++;}
            if(posicaoX ==11 && posicaoY ==5){
                direcao =3;}
            else if (direcao==3) {
                posicaoY++;
                if(posicaoX ==11 && posicaoY ==10){
                    direcao =0;}
            }
        }
    }
}
