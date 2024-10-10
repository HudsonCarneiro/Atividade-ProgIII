import java.util.HashMap;
import java.util.Map;

class CorFactory {
    private Map<String, Cor> cores = new HashMap<>();

    public Cor getCor(String nome) {
        if (!cores.containsKey(nome)) {
            cores.put(nome, new Cor(nome));
        }
        return cores.get(nome);
    }
}