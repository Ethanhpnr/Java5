package Exo7;

public class CampingCar implements Vehicule {
    private final Vehicule vehicule;
    private final double tailleToilettes;

    public CampingCar(Vehicule vehicule, double tailleToilettes) {
        this.vehicule = vehicule;
        this.tailleToilettes = tailleToilettes;
    }

    @Override
    public double prix() {
        return vehicule.prix() * facteurSelonTaille();
    }

    @Override
    public void marche() {
        vehicule.marche();
        IO.println("et je vais vers des lieux inconnus");
    }

    private double facteurSelonTaille() {
        return 1+ tailleToilettes /10 ;
        };
    }