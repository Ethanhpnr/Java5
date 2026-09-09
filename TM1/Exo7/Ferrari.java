package Exo7;

public class Ferrari extends VoitureDeSport {
    public Ferrari(double vitesse, Moteur moteur, Pneus pneus) {
        super(vitesse, moteur, pneus, "Ferrari");
    }

    @Override
    public void marche() {
        super.marche();
        IO.println("Et je suis rouge!");
    }
}
