package package1;

public class IsLandVehicleClass extends Vehicle implements IsLandVehicle {
	
// Extends pour l'h�ritage entre deux classes et implements pour une classe avec une interface
// La classe IsLandVehicleClass h�rite de la classe Vehicle 
// La classe IsLandVehicleClass impl�mente l'interface IsLandVehicle
	
	//Attribut de la classe
	int numWheels;

	// M�thodes de la classe 

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	
	
}
