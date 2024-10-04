package exe01;

public class Pizza {
    private String massa;
    private Double tamanho;
    private String ingrediente;

    public Pizza(PizzaBuilder pizzaBuilder){
        this.massa = pizzaBuilder.getMassa();
        this.tamanho = pizzaBuilder.getTamanho();
        this.ingrediente = pizzaBuilder.getIngrediente();
    }
    public String toString(){
        return "Pizza: Massa = "+massa+", Tamanho(cm): " + tamanho +
                (ingrediente != null? ", Ingredientes = "+ingrediente : "");
    }

}
