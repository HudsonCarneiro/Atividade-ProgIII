package exe02;

public class main {
    public static void main(String[] args) {
        Veiculo veiculo = new VeiculoBuilder()
                .setTipo("CARRO")
                .setCor("PRETO")
                .setRodas(4)
                .build();
        System.out.println(veiculo);
    }
}
