package planetas;

public abstract class Planeta {
    protected String Nome;
    protected int translacao;
    protected int posicaoX;
    protected int posicaoY;
    protected int valor;

    protected int totalTranslacao(){
        return translacao * valor;
    };

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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
