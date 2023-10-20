public class Felino extends Animal {
    public Felino(String nombreCientífico) {
        super("Sonido: Rugido", "Alimentos: Carnívoro", "Hábitat: Praderas", nombreCientífico);
    }

    @Override
    public String getNombreCientífico() {
        return nombreCientífico;
    }

    @Override
    public String getSonido() {
        return "Sonido: Rugido";
    }

    @Override
    public String getAlimentos() {
        return "Alimentos: Carnívoro";
    }

    @Override
    public String getHábitat() {
        return "Hábitat: Praderas";
    }
}