package package1;

// La classe Jeep h�rite de la classe IsLandVehicleClass et elle impl�mente l'interface IsLandVehicle

public class Jeep extends IsLandVehicleClass implements IsLandVehicle {
	
// C'est extends avant implements et pas l'inverse ! 
// Fl�che en pointill�s dans Star UML signifie implements

	// M�thode de la classe 
	
	public void soundHorn() {
		System.out.println("COIN COIN !!");
	}
}
