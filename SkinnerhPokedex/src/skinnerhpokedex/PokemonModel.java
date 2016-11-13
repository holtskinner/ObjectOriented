package skinnerhpokedex;

import java.util.*;
import javafx.scene.image.Image;

public class PokemonModel {
    
    private Integer number;
    private String name;
    private ArrayList<String> type;
    private Image image;

    public PokemonModel(Integer number, String name, ArrayList<String> type, Image image) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.image = image;
    }
}
