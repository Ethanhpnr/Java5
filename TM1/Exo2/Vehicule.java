package Exo2;
public class Vehicule {
    private Moteur moteur;
    private Pneus pneus;
    private String marque;
    private double  vitesse;

    public double prix(){
        return pneus.afficherPrix() * 4 + moteur.afficherPuissance() * vitesse;
    }

    public void marche(){
        IO.println("Je marche !");
    }

    public static void main() {
        Vehicule v = new Vehicule();
        v.moteur = new Moteur(100);
        v.pneus = new Pneus(50);
        v.marque = "Dacia";
        v.vitesse = 50.6;
        IO.println(v.prix());
        v.marche();
    }
}

