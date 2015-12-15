/*
Exemple d'héritage
Vehicule est la classe mère ou super-classe
(Bateau hérite de Vehicule)
 */

package test;

public class Vehicule {
    private int age;

    public void start() {
        System.out.println("Véhicule " + age + " start");
    }
    
    public void stop() {
        System.out.println("Véhicule " + age + " stop");
    }
   
    public int getAge() {
    return age;
}
    
    public void setAge(int age){
        this.age=age;
    }
    
    
}
