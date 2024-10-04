package exe01;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder().setMassa("Tradicional")
                .setMassa("Tradicional")
                .setTamanho(30.0)
                .addIngrediente("Calabresa")
                .build();
        System.out.println(pizza);
    }
}
