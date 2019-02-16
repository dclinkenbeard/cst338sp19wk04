package inClass;

import java.util.HashMap;

public class Deli {
    public static void main(String[] args){
        HashMap<String,Integer> filling = new HashMap<>();
        filling.put("pepper jack", 2);
        filling.put("gouda",2);
        Sandwich grilledCheese = new Sandwich(2,filling);
        System.out.println(grilledCheese);
    }
}
