package planetas;

public abstract class Planeta {
    protected String Nome;
    protected int translacao;
    protected int posicaoX;
    protected int posicaoY;
    protected int tempo;

    public void exibirPosicao(){
        System.out.println("Posicao de "+ this.getClass().getSimpleName()+": x: "+ posicaoX + " y: "+ posicaoY);
    }

    public Planeta(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public int getTranslacao() {
        return translacao;
    }

    public void setTranslacao(int translacao) {
        this.translacao = translacao;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
