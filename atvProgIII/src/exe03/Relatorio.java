package exe03;

public class Relatorio {
    private String titulo;
    private String corpo;
    private String rodape;

    public Relatorio(RelatorioBuilder relatorioBuilder){
        this.titulo = relatorioBuilder.getTitulo();
        this.corpo = relatorioBuilder.getCorpo();
        this.rodape = relatorioBuilder.getRodape();
    }
    public String toString(){
        return titulo + "\n" + corpo + "\n" + rodape;
    }

}
