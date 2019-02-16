package inClass;

public class Burger extends Sandwich {

    Burger(){
        this("beef patty");
    }
    Burger(String filling){
        super(2, filling);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
