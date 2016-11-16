package skinnerhpokedex;

import java.util.*;
import javafx.scene.image.Image;

public class Pokemon {
    
    private int number;
    private String name;
    private ArrayList<String> type;
    private Image image;

    public Pokemon(int number, String name, ArrayList<String> type, Image image) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.image = image;
    }
}
