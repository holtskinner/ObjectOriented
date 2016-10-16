/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skinnerhvisualizer;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author holtskinner
 */
public class CatVisualizer implements Visualizer{
    
    private final String name = "Skinnerh Cat Visualizer";
    
    private Integer numBands;
    private AnchorPane vizPane;
    
    private ImageView[] catImageView;
    private Image catImage;
    private final String catImageName = "SkinnerhCatImage.jpeg";
    
    @Override
    public String getName(){
        return name;
    }
    
    public CatVisualizer() {
        
    }
    @Override //Create Initial UI
    public void start(Integer numBands, AnchorPane vizPane){
        
    }
    
    @Override
    public void end(){
        
    }
    
    @Override
    public void update(double timestamp, double duration, float[] magnitudes, float[] phases){
        
    }
}

