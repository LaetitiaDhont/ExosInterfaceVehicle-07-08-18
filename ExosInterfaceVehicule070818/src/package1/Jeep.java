package package1;

// La classe Jeep hérite de la classe IsLandVehicleClass et elle implémente l'interface IsLandVehicle

public class Jeep extends IsLandVehicleClass implements IsLandVehicle {
	
// C'est extends avant implements et pas l'inverse ! 
// Flêche en pointillés dans Star UML signifie implements

	// Méthode de la classe 
	
	public void soundHorn() {
		System.out.println("COIN COIN !!");
	}
}
