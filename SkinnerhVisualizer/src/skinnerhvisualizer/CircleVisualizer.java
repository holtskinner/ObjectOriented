package skinnerhvisualizer;

import static java.lang.Integer.min;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Skinnerh
 */
public class CircleVisualizer implements Visualizer {
    
    private final String name = "Skinnerh Circle Visualizer";
    
    private Integer numBands;
    private AnchorPane vizPane;
    
    private Double width = 0.0;
    private Double height = 0.0;
    
    private Double bandWidth = 0.0;
    private Double bandHeight = 0.0;
    private final Double bandHeightPercentage = 0.5;
    
    private Ellipse[] circles;
    
    private double defaultCircleRadius = 10.0;
    
    private Random random;
    private Double hue = 0.0;
    private Double xPosition = 0.0;
    private Double yPosition = 0.0;
    
    @Override
    public String getName(){
        return name;
    }
    
    public CircleVisualizer() {
        
    }
    @Override
    public void start(Integer numBands, AnchorPane vizPane){
        end();
        
        this.numBands = numBands;
        this.vizPane = vizPane;
        height = vizPane.getHeight();
        width = vizPane.getWidth();
        
        Rectangle clip = new Rectangle(width, height);
        clip.setLayoutX(0);
        clip.setLayoutY(0);
        vizPane.setClip(clip);
         
        circles = new Ellipse[numBands];
        
        bandHeight = height * bandHeightPercentage;
        
        random = new Random(System.currentTimeMillis());
        
        
        for(int i = 0; i < numBands; i++) {
            Ellipse circle = new Ellipse(defaultCircleRadius, defaultCircleRadius);
            
            hue = random.nextDouble() * 360.0;
            xPosition = random.nextDouble() * 500;
            yPosition = random.nextDouble() * 400;
            circle.setCenterX(xPosition);
            circle.setCenterY(yPosition);
            
            circle.setFill(Color.hsb(hue, 1.0, 1.0, 1.0));
            
            vizPane.getChildren().add(circle);
            circles[i] = circle;
        }
             
    }
    
    @Override
    public void end(){
        if(circles != null) {
            for (Ellipse circle : circles) {
                 vizPane.getChildren().remove(circle);
             }
            circles = null;
        }
    }
    
    @Override
    public void update(double timestamp, double duration, float[] magnitudes, float[] phases){
        if(circles == null){
            return;
        }
        
        Integer num = min(circles.length, magnitudes.length);
        double radius = 0.0;
        for (int i = 0; i < num; i++) {
            radius = ((60.0 + magnitudes[i])/60.0) * (bandHeight/2) + defaultCircleRadius;
            circles[i].setRadiusX(radius);
            circles[i].setRadiusY(radius);
        }
    }
}
