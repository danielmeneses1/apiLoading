package planetas;

public class Python extends Planeta{

    public Python(String nome) {
        super(nome);
        this.Nome = "Python";
        this.translacao = 4;
        this.posicaoX = 9;
        this.posicaoY = 8;
        this.valor = 0;

    }

    public int totalTranslacao(){
        return translacao * valor;
    }

    public void andar(){
        if(posicaoY - totalTranslacao()< 6){
            posicaoY = posicaoY - totalTranslacao();
        } else if (posicaoY - totalTranslacao()>  6 ||posicaoX - totalTranslacao()> 6) {
            posicaoX = posicaoX - (totalTranslacao()-6);
        }
        posicaoX = posicaoX - totalTranslacao();
    }




}
