package package1;

public class IsLandVehicleClass extends Vehicle implements IsLandVehicle {
// Extends pour l'h�ritage entre deux classes et implements pour une classe avec une interface
// La classe IsLandVesselClass h�rite de la classe Vehicle 
// La classe IsLandVesselClass impl�mente l'interface IsLandVessel
	
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
