package Exo7;

public class GoogleCar {
	private final Vehicule vehicule;

	public GoogleCar(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public void marche() {
		vehicule.marche();
		IO.println("Et je prends des photos.");
	}
}
