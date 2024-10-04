package exe02;

public class Veiculo {
    private String tipo;
    private String cor;
    private Integer quantRodas;

    public Veiculo(VeiculoBuilder veiculoBuilder){
        this.tipo = veiculoBuilder.getTipo();
        this.cor = veiculoBuilder.getCor();
        this.quantRodas = veiculoBuilder.getQuantRodas();
    }
    public String toString(){
        return "Veículo: Tipo = "+tipo+", Cor = " + cor +
                ", Quantidade de rodas = " + quantRodas;
    }
}
