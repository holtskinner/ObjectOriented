package skinnerhrelaxatron;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import static skinnerhrelaxatron.ViewController.getControllerByName;

/**
 * FXML Controller class
 *
 * @author HS047694
 */
public class EncouragementController extends ViewController {
    
    @FXML
    Button backButton;
    
    @FXML
    public void goToIndexPage() {
        ViewController.switchTo("Index");
        ViewController controller = (ViewController)getControllerByName("Index");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
