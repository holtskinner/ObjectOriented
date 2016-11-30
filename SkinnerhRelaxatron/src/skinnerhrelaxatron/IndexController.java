package skinnerhrelaxatron;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author HS047694
 */
public class IndexController extends ViewController  {
    
    @FXML
    ListView listOfPages;
    
    ArrayList<String> pages;
    
    @FXML
    private void loadListView() {
        pages = new ArrayList<>();
        
        pages.set(0, "Cat Videos");
        pages.set(1, "Soothing Music");
        pages.set(2, "Rain Drops");
        pages.set(3, "Puppies");
        
        listOfPages.setItems((ObservableList) pages);
        
    }

}
