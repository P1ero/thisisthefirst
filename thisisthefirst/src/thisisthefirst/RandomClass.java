package thisisthefirst;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random r = new Random(3);
        for (int i = 0; i<10; i++){
            System.out.print(r.nextInt(1000) + " ");
        }
        
        System.out.println();
        Random r1 = new Random(4);
        for (int i = 0; i<10; i++){
            System.out.print(r1.nextInt(1000) + " ");
        }
    }
    
    
}
