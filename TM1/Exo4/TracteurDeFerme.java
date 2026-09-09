package Exo4;

public class TracteurDeFerme implements Vehicule {
    private Moteur moteur;
    private Pneus pneus;
    private String marque;
    private double  vitesse;

    @Override
    public double prix() {
        return (pneus.afficherPrix() * 4) + (moteur.afficherPuissance()*2) * vitesse;
    }

    @Override
    public void marche() {
        IO.println("Je marche doucement le matin, pas trop vite l'après-midi !");
    }
}
