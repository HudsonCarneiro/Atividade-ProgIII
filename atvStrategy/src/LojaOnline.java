public class LojaOnline {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        Produto prod01 = new Produto("TENIS", 120.50);
        Produto prod02 = new Produto("PCT MEIA", 30.80);
        Produto prod03 = new Produto("SANDALIA", 58.49);
        Produto prod04 = new Produto("CHINELO", 44.98);

        carrinhoDeCompras.addProduto(prod01);
        carrinhoDeCompras.addProduto(prod02);
        carrinhoDeCompras.addProduto(prod03);
        carrinhoDeCompras.addProduto(prod04);

        carrinhoDeCompras.setDescontoStrategy(new DescontoClienteNovo());
        System.out.printf("Valor total para cliente novo: R$" + carrinhoDeCompras.calcularCompra()+"\n");

        carrinhoDeCompras.setDescontoStrategy(new DescontoClienteRegular());
        System.out.printf("Valor total para cliente regular: R$" + carrinhoDeCompras.calcularCompra()+"\n");

        carrinhoDeCompras.setDescontoStrategy(new DescontoClienteVIP());
        System.out.printf("Valor total para cliente VIP: R$" + carrinhoDeCompras.calcularCompra());

    }
}
