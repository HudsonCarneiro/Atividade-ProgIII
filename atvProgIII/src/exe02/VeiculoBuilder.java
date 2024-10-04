package exe02;

public class VeiculoBuilder {
    private String tipo;
    private String cor;
    private Integer quantRodas;

    public VeiculoBuilder setTipo(String tipo){
        this.tipo = tipo;
        return this;
    }
    public VeiculoBuilder setCor(String cor){
        this.cor = cor;
        return this;
    }
    public VeiculoBuilder setRodas(Integer quantRodas){
        this.quantRodas = quantRodas;
        return this;
    }
    public Veiculo build(){
        return new Veiculo(this);
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public Integer getQuantRodas() {
        return quantRodas;
    }
}
