/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skinnerhvisualizer;

import static java.lang.Integer.min;
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
    
    private Double width = 0.0;
    private Double height = 0.0;
    
    private Double bandWidth = 0.0;
    
    private ImageView[] catImageViews;
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
        end();
        
        this.numBands = numBands;
        this.vizPane = vizPane;
        this.height = vizPane.getHeight();
        this.width = vizPane.getWidth();
        
        bandWidth = width / numBands;
        
        catImageViews = new ImageView[numBands];
        catImage = new Image(getClass().getResourceAsStream(catImageName));
        
        for(int i = 0; i < numBands; i++) {
            ImageView catImageView = new ImageView();
            catImageView.setImage(catImage);
            catImageView.setFitWidth(bandWidth);
            
            catImageView.setX(bandWidth * i);
            catImageView.setY(i*(catImage.getHeight()/10));
            
            vizPane.getChildren().add(catImageView);
            catImageViews[i] = catImageView;

        }
             
    }
    
    @Override
    public void end(){
        if(catImageViews != null) {
            for (ImageView catImageView : catImageViews) {
                 vizPane.getChildren().remove(catImageView);
             }
            catImageViews = null;
        }
    }
    
    @Override
    public void update(double timestamp, double duration, float[] magnitudes, float[] phases){
        if(catImageViews == null){
            return;
        }
        
        Integer num = min(catImageViews.length, magnitudes.length);
        
        for (int i = 0; i < num; i++) {
            catImageViews[i].setRotate((magnitudes[i]*10 -25));
        }
    }
}

