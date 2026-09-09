package Exo6;

public class TracteurDeFerme implements Vehicule {
    private Moteur moteur;
    private Pneus pneus;
    private String marque;
    private double  vitesse;

    public TracteurDeFerme(double vitesse, Moteur moteur, Pneus pneus, String marque) {
        this.vitesse = vitesse;
        this.moteur = moteur;
        this.pneus = pneus;
        this.marque = marque;
    }

    @Override
    public double prix() {
        return (pneus.afficherPrix() * 4) + (moteur.afficherPuissance()*2) * vitesse;
    }

    @Override
    public void marche() {
        IO.println("Je marche doucement le matin, pas trop vite l'après-midi !");
    }
}
