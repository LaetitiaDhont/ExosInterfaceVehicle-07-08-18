package package1;

public class ApplicationVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cr�ation d'une instance de la class Jeep 
		
		Jeep myJeep = new Jeep();
		
		// SETTERS des attributs
		
		myJeep.setMaxPassengers(6);
		myJeep.setMaxSpeed(200);
		myJeep.setName("LA Ghislaine");
		myJeep.setNumWheels(4);
		
	
		// GETTERS les valeurs
		
		System.out.println("Ma jeep s'appelle " + myJeep.getName() + " elle peut transporter jusqu'� " + myJeep.getMaxPassengers() + " passagers, rouler jusqu'� " + myJeep.getMaxSpeed() + "km/h et poss�de " + myJeep.getNumWheels() + " roues ");
		
		
		// Cr�ation d'une instance de la class Hovercraft
		
		Hovercraft myHovercraft = new Hovercraft();
		
		// SETTERS des attributs 
		
		myHovercraft.setDisplacement(20);
		myHovercraft.setMaxPassengers(30);
		myHovercraft.setMaxSpeed(120);
		myHovercraft.setName("LE Next Level");
		myHovercraft.setNumWheels(60);
		
		System.out.println("Mon hovercraft s'appelle " + myHovercraft.getName() + "il roule � " + myHovercraft.getMaxSpeed() + "il  peut transporter jusqu'� " + myHovercraft.getMaxPassengers() + "il p�se " + myHovercraft.getDisplacement() + "tonnes");
		
	}

}
