package Exo4;

public class Ferrari extends VoitureDeSport {
    @Override
    public void marche() {
        super.marche();
        IO.println("Et je suis rouge!");
    }
}
