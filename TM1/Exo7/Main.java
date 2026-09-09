package Exo7;

public class Main {
    public static void main(String[] args) {
        Vehicule vs = new VoitureDeSport(100, new Moteur(200), new Pneus(100), "Porsche");
        Vehicule f = new Ferrari(300, new Moteur(400), new Pneus(200));
        Vehicule tf = new TracteurDeFerme(30, new Moteur(100), new Pneus(50), "John Deere");

        IO.println("Prix de la voiture de sport : " + vs.prix());
        vs.marche();
        IO.println("Prix de la Ferrari : " + f.prix());
        f.marche();
        IO.println("Prix du tracteur de ferme : " + tf.prix());
        tf.marche();

        IO.println("-------------------------------------------------------");

        Vehicule voiture = new VoitureDeSport(100, new Moteur(200), new Pneus(100), "Porsche");

        Vehicule campingCar = new CampingCar(voiture, 2.0);

        Vehicule camiondeglaces = new CamionDeGlaces(campingCar, "standard");

        Vehicule camiondeglaces2 = new CampingCar(new CamionDeGlaces(voiture, "petites"), 0);


        IO.println("Prix du camion de glaces : " + camiondeglaces.prix());
        camiondeglaces.marche();

        IO.println("Prix du camion de glaces 2 : " + camiondeglaces2.prix());
        camiondeglaces2.marche();



    }
}
