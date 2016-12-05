package skinnerhrelaxatron;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author HS047694
 */
public class PuppyController extends ViewController {
    
    @FXML
    WebView videoView;
    
    @FXML
    Button backButton;
    
    @FXML
    public void goToIndexPage() {
        ViewController.switchTo("Index");
        PuppyController controller = (PuppyController)getControllerByName("Index");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        videoView.getEngine().load(
            "https://www.youtube.com/embed/mRf3-JkwqfU?autoplay=1"
        );
    }
    
}

