package package1;

public class IsLandVehicleClass extends Vehicle implements IsLandVehicle {
	
// Extends pour l'héritage entre deux classes et implements pour une classe avec une interface
// La classe IsLandVehicleClass hérite de la classe Vehicle 
// La classe IsLandVehicleClass implémente l'interface IsLandVehicle
	
	//Attribut de la classe
	int numWheels;

	// Méthodes de la classe 

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	
	
}
