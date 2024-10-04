package exe03;

public class main {
    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Teste Builder")
                .setCorpo("Exemplo de conteudo")
                .setRodape("Faculdade UMFG")
                .build();
        System.out.println(relatorio);
    }
}
