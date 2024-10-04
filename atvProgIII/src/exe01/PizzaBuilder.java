package exe01;

public class PizzaBuilder {
    private String massa;
    private Double tamanho;
    private String ingrediente;

    public PizzaBuilder(){
    }
    public Pizza build(){
        return new Pizza(this);
    }

    public String getMassa() {
        return massa;
    }
    public PizzaBuilder setMassa(String massa) {
        this.massa = massa;
        return this;
    }

    public Double getTamanho(){
        return tamanho;
    }
    public PizzaBuilder setTamanho(Double tamanho) {
        this.tamanho = tamanho;
        return this;
    }
    public String getIngrediente() {
        return ingrediente;
    }
    public PizzaBuilder addIngrediente(String ingrediente){
        this.ingrediente = ingrediente;
        return this;
    }
}
