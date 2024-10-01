package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utility {

    public static List<Integer> generaNumeriCasuali (int n){
        List<Integer> numeri = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i< n ; i++){
            numeri.add(random.nextInt(101));
        }
        return numeri; // Restituisce la lista di numeri
    }


}

