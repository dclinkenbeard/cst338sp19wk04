package inClass;

import java.util.HashMap;

public class Sandwich {
    private Integer slicesOfBread;
    private HashMap<String, Integer> filling = new HashMap<>();

    Sandwich(Integer slicesOfBread, HashMap<String, Integer> filling){
        this.slicesOfBread = slicesOfBread;
        this.filling = filling;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if(slicesOfBread > 1){
            sb.append("bread\n");
        }
        for(String key : filling.keySet()){
            for (int i = filling.get(key); i > 0; i--){
                sb.append(key);
                sb.append("\n");
            }
        }

        sb.append("bread");

        return sb.toString();
    }
}
