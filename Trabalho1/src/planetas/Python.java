package planetas;

public class Python extends Planeta implements IPlaneta{

    public Python(String nome) {
        super(nome);
        this.translacao = 4;
        this.posicaoX = 8;
        this.posicaoY = 9;

    }

  public void mover(int momento){
        int unidades = momento * translacao;
        int direcao = 0;
        for (int i = 0; i<unidades; i++){
            if(direcao == 0){
                posicaoX--;
                if(posicaoX ==6 && posicaoY ==9){
                    direcao = 1;}
                }else if (direcao ==1){
                    posicaoY--;
                    if (posicaoX ==6&&posicaoY==6){
                        direcao =2;}
                } else if (direcao ==2) {
                        posicaoX++;}
                        if(posicaoX ==10 && posicaoY ==6){
                            direcao =3;}
                 else if (direcao==3) {
                            posicaoY++;
                            if(posicaoX ==10 && posicaoY ==9){
                                direcao =0;}
                            }
                        }





   }



}







