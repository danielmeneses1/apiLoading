public class Animal {
    protected String nome;

    public void emitirSom(){
        System.out.println("O animal emitiu um som");
    }

    public Animal(String nome) {
        this.nome = nome;
    }
}
