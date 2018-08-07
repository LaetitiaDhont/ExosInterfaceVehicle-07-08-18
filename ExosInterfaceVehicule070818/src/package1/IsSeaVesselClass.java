package package1;

// La classe IsSeaVesselClass hérite dee classe Vehicle et elle implémente l'interface IsSeaVessel

public class IsSeaVesselClass extends Vehicle implements IsSeaVessel {
	
	//Attributs de la classe IsSeaVesselClass
	
	int displacement;

	// Méthodes de la classe 
	
	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
}
