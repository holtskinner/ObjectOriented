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
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        
        ImageView dialImageView = new ImageView();
        ImageView handImageView = new ImageView();
        root.getChildren().addAll(dialImageView, handImageView);
        
        Image dialImage = new Image(getClass().getResourceAsStream("clockface.png"));
        Image handImage = new Image(getClass().getResourceAsStream("hand.png"));
        
        dialImageView.setImage(dialImage);
        handImageView.setImage(handImage);
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("StopWatch");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        double handAngle = 0;
        
        Timeline timeLine = new Timeline( new KeyFrame(Duration.millis(1000), (ActionEvent actionEvent) -> {
            handImageView.setRotate(handImageView.getRotate() + 6);
            //handAngle+=6;
        }));
        
        timeLine.setCycleCount(Animation.INDEFINITE);
        timeLine.play();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
