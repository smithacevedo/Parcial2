public class Canido extends Animal {
    public Canido(String nombreCientífico) {
        super("Sonido: Ladrido", "Alimentos: Carnívoro", "Hábitat: Doméstico", nombreCientífico);
    }

    @Override
    public String getNombreCientífico() {
        return nombreCientífico;
    }

    @Override
    public String getSonido() {
        return "Sonido: Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Alimentos: Carnívoro";
    }

    @Override
    public String getHábitat() {
        return "Hábitat: Doméstico";
    }
}