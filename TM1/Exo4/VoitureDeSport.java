package Exo4;

public class VoitureDeSport implements Vehicule {
    private Moteur moteur;
    private Pneus pneus;
    private String marque;
    private double  vitesse;

    @Override
    public double prix() {
        return (pneus.afficherPrix() * 4) + moteur.afficherPuissance() * (vitesse * 2);
    }

    @Override
    public void marche() {
        IO.print("KATCHAAAAAAAW ! ");
    }

}
