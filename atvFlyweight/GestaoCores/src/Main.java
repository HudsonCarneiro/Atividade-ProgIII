public class Main {
    public static void main(String[] args) {
        FormaManager manager = new FormaManager();


        manager.addForma("Azul", "20,20", 30);
        manager.addForma("Verde", "10,10", 60);
        manager.addForma("Rosa", "0,0", 120);
        manager.addForma("Violeta", "42,42", 25);
        manager.addForma("Marrom", "52,52", 45);

        manager.apresentar();
    }
}