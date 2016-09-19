package skinnerhstopwatch;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Holt Skinner
 * Challenge 5 - Stopwatch
 * 9-21-16
 */
public class SkinnerhStopwatch extends Application {
    private String appName = "SkinnerhStopwatch";
    
    private Button startButton;
    private Button stopButton;
    private Button resetButton;
    
    private GridPane rootContainer;
    
    @Override
    public void start(Stage primaryStage) {

        AnalogStopWatch analogStopWatch = new AnalogStopWatch();
        
//        startButton = new Button("Start");
//        stopButton = new Button("Stop");
//        resetButton = new Button("Reset");
//        
//        rootContainer.add(startButton, 1, 5);
//        rootContainer.add(stopButton, 2, 5);
//        rootContainer.add(resetButton, 3, 5);
        
        
        Scene scene = new Scene(analogStopWatch.getRootContainer(), 
                                analogStopWatch.getWidth(), 
                                analogStopWatch.getHeight());
        
        primaryStage.setTitle(appName);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        analogStopWatch.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
