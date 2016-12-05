package skinnerhrelaxatron;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author HS047694
 */
public class IndexController extends ViewController{
    
    @FXML
    Button puppiesButton;
    
    @FXML
    Button rainButton;
    
    @FXML
    public void goToPuppiesPage() {
        ViewController.switchTo("Puppy");
 
        PuppyController controller = (PuppyController)getControllerByName("Puppy");
        if (controller != null) {
            
        }
    }
}
