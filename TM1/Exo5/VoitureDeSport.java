package Exo5;

public class VoitureDeSport implements Vehicule {
    private Moteur moteur;
    private Pneus pneus;
    private String marque;
    private double  vitesse;

    public VoitureDeSport(double vitesse, Moteur moteur, Pneus pneus, String marque) {
        this.vitesse = vitesse;
        this.moteur = moteur;
        this.pneus = pneus;
        this.marque = marque;
    }

    @Override
    public double prix() {
        return (pneus.afficherPrix() * 4) + moteur.afficherPuissance() * (vitesse * 2);
    }

    @Override
    public void marche() {
        IO.println("KATCHAAAAAAAW ! ");
    }

}
