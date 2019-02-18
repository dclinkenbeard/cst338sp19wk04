package Lab;

public abstract class Vacuum implements ItemOne, ItemTwo{
    Boolean on;

    Vacuum(){
        on = false;
    }

    public Boolean isOn() {
        System.out.println("Turning vacuum on.");
        return on;
    }

    @Override
    public void deactivate() {
        if(on){
            System.out.println("turning this vacuum off");
            on = false;
        } else {
            System.out.println("this vacuum is already off");
        }

    }

    @Override
    public void activate() {
        if(on){
            System.out.println("this vacuum is already on");
        } else {
            System.out.println("turning this vacuum on");
            on = true;
        }

    }
}
