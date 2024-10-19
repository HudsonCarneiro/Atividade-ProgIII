public class Produto {
    private String nome;
    private Double preco;
    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Double setPreco(Double preco){
        return this.preco = preco;
    }
    public Double getPreco(){
        return this.preco;
    }
}
