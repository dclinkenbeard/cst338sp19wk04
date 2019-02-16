package inClass;

public class Sandwich {
    private Integer slicesOfBread;
    private String filling;

    Sandwich(Integer slicesOfBread, String filling){
        this.slicesOfBread = slicesOfBread;
        this.filling = filling;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This ");
        sb.append(this.getClass().getName());
        sb.append(" has ");
        sb.append(filling);
        sb.append(" between ");
        sb.append(this.slicesOfBread);
        sb.append(" slices of bread");
        return sb.toString();
    }
}
