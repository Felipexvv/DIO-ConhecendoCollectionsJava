public class Item {
    String nome;
    Double preco;
    int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    } 

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome item: " + nome + " Preço: " + preco + " Quantidade: " + quantidade;
    }

}
