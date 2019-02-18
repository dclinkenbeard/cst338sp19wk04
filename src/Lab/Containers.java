package Lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Containers {
    public static void main(String[] args){
        HashMap<String, Vacuum> vacuums = new HashMap<>();
        Map<String, ItemOne> itemOnes = new HashMap<>();
        List<ItemTwo> itemTwos = new ArrayList<>();

        Hoover h1 = new Hoover();
        Hoover h2 = new Hoover();

        vacuums.put("h1",h1);
        vacuums.put("h2",h2);
        vacuums.put("h3",new Hoover());

        for(String k : vacuums.keySet()){
            itemOnes.put(k, vacuums.get(k));
            vacuums.get(k).activate();
        }

        itemOnes.put("h4", new Hoover());

        for(String k : itemOnes.keySet()){
            System.out.println("Key " + k + " goes with " + itemOnes.get(k));
            itemOnes.get(k).activate();
            itemTwos.add((ItemTwo) itemOnes.get(k));
        }

        itemTwos.add(new Hoover());

        for(ItemTwo t : itemTwos){
            System.out.println(t.getClass());
            t.deactivate();
        }

    }
}
