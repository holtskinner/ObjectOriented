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
    public void goToPuppiesPage() throws Exception {
        try {
           ViewController.switchTo("Puppy");
           ViewController controller = (ViewController)getControllerByName("Puppy");
        } catch (Exception ex) {
            System.out.println("Could not load Controller");
        }
    }
    
    @FXML
    public void goToRainDropsPage() throws Exception {
        try {
            ViewController.switchTo("RainDrops");
            ViewController controller = (ViewController)getControllerByName("RainDrops");
        } catch (Exception ex) {
            System.out.println("Could not load Controller");

        }

    }
}
