public class Vehicule {
    private int puissance;
    private String marque;
    private double  vitesse;

    public double prix(){
        return vitesse * (double)puissance;
    }

    public void marche(){
        IO.println("Je marche !");
    }

    public static void main() {
        Vehicule v = new Vehicule();
        v.puissance = 100;
        v.marque = "Dacia";
        v.vitesse = 50.6;
        IO.println(v.prix());
        v.marche();
    }
}
