public class Prueba {
	
	 public static void main(String[] args) {
	        Animal[] animales = new Animal[4];
	        animales[0] = new Canido("Canis lupus familiaris");
	        animales[1] = new Canido("Canis lupus");
	        animales[2] = new Felino("Panthera leo");
	        animales[3] = new Felino("Felis silvestris catus");

	        for (Animal animal : animales) {
	            animal.mostrarInformación();
	            System.out.println();
	        }
	    }

}