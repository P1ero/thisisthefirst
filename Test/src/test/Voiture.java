package test;

public class Voiture extends Vehicule {
    private double consommation;
    private String couleur;
    public static void main(String[] args) {
        Voiture v = new Voiture();
        v.consommation = 4.5;
        v.couleur = "vert";
        v.setAge(15);
        v.start();
        v.stop();
    }
    @Override
    public void start() {
        System.out.println("Voiture " + getAge() + " " + couleur + " "
         + consommation + " start");
    }
}
