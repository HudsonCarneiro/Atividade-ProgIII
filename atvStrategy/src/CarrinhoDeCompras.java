import java.util.ArrayList;

public class CarrinhoDeCompras implements DescontoStrategy{
    ArrayList<Produto> listaProdutos = new ArrayList<>();
    public Boolean addProduto(Produto produto){
        return this.listaProdutos.add(produto);
    }

    public Double calcularCompra(){
        Double soma = 0.0;
        for (Produto produto : this.listaProdutos) {
            soma += produto.getPreco();
        }
        return soma;
    }

    @Override
    public void setDescontoStrategy(AbstractDesconto desconto) {
        Double valorDesconto = desconto.getValorDesconto();
        try {
            for (Produto produto : listaProdutos) {
                double precoOriginal = produto.getPreco();
                double precoComDesconto = precoOriginal - (precoOriginal * valorDesconto);
                produto.setPreco(precoComDesconto);
            }
        }catch (NullPointerException ex){
        }

    }

}
