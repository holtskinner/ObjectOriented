package skinnerhstopwatch;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.RootPaneContainer;

/**
 *
 * @author Holt Skinner
 * Challenge 5 - Stopwatch
 * 9-21-16
 */
public class SkinnerhStopwatch extends Application {
    private final String appName = "SkinnerhStopwatch";
    
    private Button startButton;
    private Button stopButton;
    private Button resetButton;
    
    public GridPane rootContainer;
    
    @Override
    public void start(Stage primaryStage) {
        
        rootContainer = new GridPane();
        rootContainer.setAlignment(Pos.CENTER);
        rootContainer.setVgap(10);
        rootContainer.setHgap(10);

        AnalogStopWatch analogStopWatch = new AnalogStopWatch();
        
        GridPane buttonContainer = new GridPane();
        
        startButton = new Button("Start");
        stopButton = new Button("Stop");
        resetButton = new Button("Reset");
        
        startButton.setOnAction((ActionEvent event) -> {
            analogStopWatch.start();
        });
        
        stopButton.setOnAction((ActionEvent event) -> {
            analogStopWatch.stop();
        });
        
        resetButton.setOnAction((ActionEvent event) -> {
            analogStopWatch.reset();
        });
        
        buttonContainer.setAlignment(Pos.CENTER);
        buttonContainer.setVgap(10);
        buttonContainer.setHgap(10);
        
        buttonContainer.add(startButton, 0, 0);
        buttonContainer.add(stopButton, 1, 0);
        buttonContainer.add(resetButton, 2, 0);
        
        rootContainer.add(analogStopWatch.getRootContainer(), 0, 0);
        rootContainer.add(buttonContainer, 0, 1);
        
        Scene scene = new Scene(rootContainer, 
                                rootContainer.getWidth(), 
                                rootContainer.getHeight());
        
        primaryStage.setTitle(appName);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
