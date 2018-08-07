package package1;

public class Hovercraft extends IsLandVehicleClass implements IsLandVehicle, IsSeaVessel {
	// Une classe peut implémenter deux interfaces mais elle ne peut pas hériter de deux classes
	// On rajoute les méthodes "à la main" de la classe IsSeaVesselClass
	
	// Attributs de la classe 
	
	int displacement;

	// Méthodes de la classe 
	
	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	public void enterLand() {
		System.out.println("Je glisse sur terre.");
	}
	
	public void enterSea() {
		System.out.println("Je glisse sur l'eau ! ");
	}
	
	
}
