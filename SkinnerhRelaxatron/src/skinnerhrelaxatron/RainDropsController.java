package skinnerhrelaxatron;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;
import javafx.util.Duration;
import static skinnerhrelaxatron.ViewController.getControllerByName;

/**
 * FXML Controller class
 *
 * @author HS047694
 */
public class RainDropsController extends ViewController {

    @FXML
    Button backButton;
    
    @FXML
    MediaView mediaView;
    
    @FXML
    ImageView rainImageView;
    
    public MediaPlayer mediaPlayer;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Media media = new Media(this.getClass().getResource("rain.mp3").toExternalForm());
        
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaView.setMediaPlayer(mediaPlayer);

        //Causes audio to repeat indefinitely
         mediaPlayer.setOnEndOfMedia(() -> {
             mediaPlayer.seek(Duration.ZERO);
        });
    }  

    @FXML
    public void goToIndexPage() {
        mediaPlayer.stop();
        ViewController.switchTo("Index");
        ViewController controller = (ViewController)getControllerByName("Index");
    }
    
}
