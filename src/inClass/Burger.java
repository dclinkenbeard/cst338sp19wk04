package inClass;

import java.util.HashMap;
import java.util.Map;

public class Burger extends Sandwich {
    Burger(){
        this("Beef Patty");
    }

    Burger(String filling){
        super(2, filling);
    }
}
