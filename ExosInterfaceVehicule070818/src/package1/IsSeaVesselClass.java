package package1;

// La classe IsSeaVesselClass h�rite dee classe Vehicle et elle impl�mente l'interface IsSeaVessel

public class IsSeaVesselClass extends Vehicle implements IsSeaVessel {
	
	//Attributs de la classe IsSeaVesselClass
	
	int displacement;

	// M�thodes de la classe 
	
	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
}
