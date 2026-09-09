package Exo7;

public class CamionDeGlaces implements Vehicule {
	private final Vehicule vehicule;
    private String typeGlace;

	public CamionDeGlaces(Vehicule vehicule, String typeGlace) {
		this.vehicule = vehicule;
		this.typeGlace = typeGlace;
	}


	@Override
	public double prix() {
		return vehicule.prix() + quantiteGlacesSelonType() ;
	}

	@Override
	public void marche() {
		vehicule.marche();
		IO.println("et j'apporte le bonheur");
	}
    
    private double quantiteGlacesSelonType() {
        return switch (typeGlace.toLowerCase()) {
            case "premium" -> 100;
            case "standard" -> 50;
            default -> 10;
        };
    }
}
