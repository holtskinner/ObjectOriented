package skinnerhfortuneteller;

/**
 *
 * @author HS047694
 */
public class Fortune {
    private int id;
    private String text;
    
    public Fortune(int id, String text) {
        this.id = id;
        this.text = text;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getText() {
        return this.text;
    }
}
