package skinnerhrelaxatron;

import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import static skinnerhrelaxatron.ViewController.getControllerByName;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/**
 * FXML Controller class
 *
 * @author HS047694
 */
public class EncouragementController extends ViewController {
    
    @FXML
    Button backButton;
    
    @FXML
    Text outputText;
    
    @FXML
    public void goToIndexPage() {
        ViewController.switchTo("Index");
        ViewController controller = (ViewController)getControllerByName("Index");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        outputText.setText("Message could not be found.");
        outputText.setText(callURL("http://ec2-35-163-155-173.us-west-2.compute.amazonaws.com/api.php?fortune"));
    }
    
    public static String callURL(String myURL) {
        
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream());
				BufferedReader bufferedReader = new BufferedReader(in);
				int cp;
				while ((cp = bufferedReader.read()) != -1) {
                                    sb.append((char) cp);
				}
				bufferedReader.close();
			}
                    //I would have put this in a finally, but it can throw an exception as well
                    if(in != null) {
                        in.close();
                    }
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+ myURL, e);
		}
 
		return sb.toString();
	}
    
}
