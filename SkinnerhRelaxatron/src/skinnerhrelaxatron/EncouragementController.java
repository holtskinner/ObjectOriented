package skinnerhrelaxatron;

import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import static skinnerhrelaxatron.ViewController.getControllerByName;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HS047694
 */
public class EncouragementController extends ViewController {
    
    String urlString = "http://ec2-35-163-155-173.us-west-2.compute.amazonaws.com/api.php?fortune";
    
    @FXML
    Button backButton;
    
    @FXML
    TextField outputText;
    
    String filename = "wordsOfEncouragement.txt";
 
    ArrayList<String> encouragementArray;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        outputText.setText("Click me.");
        encouragementArray = new ArrayList<>();
    }
    
    @FXML
    private void goToIndexPage() throws Exception {
        ViewController.switchTo("Index");
        ViewController controller = (ViewController)getControllerByName("Index");
        try {
            writeStringArrayToFile(encouragementArray);
        } catch (Exception ex) {
            throw new Exception(ex);
        }
    }
    
    @FXML
    private void handleClick() throws Exception {
        try {
            String output = callURL(urlString);
            outputText.setText(output);
            if (!encouragementArray.contains(output)) {
                encouragementArray.add(output);
            }
        } catch (Exception ex) {
            throw new Exception(ex);
        }   
    }
    
    private static String callURL(String urlString) throws IOException {

            URLConnection urlConn = null; //Assign it to null, just to be safe
            InputStreamReader input = null;
            String output = null;
            BufferedReader bufferedReader = null;
            
            try {
                URL url = new URL(urlString);
                urlConn = url.openConnection();
                if (urlConn != null && urlConn.getInputStream() != null) {

                    input = new InputStreamReader(urlConn.getInputStream());
                    bufferedReader = new BufferedReader(input);
                    output = bufferedReader.readLine();

                    if (output == null) {
                        output = "";
                    }

                    bufferedReader.close();
                }
                
                //I would have put this in a finally, but it can throw an exception as well
                if(input != null) {
                    input.close();
                }
                
            } catch (IOException ex) {
                    System.out.println(ex);
            }

            return output;
	}
    
    private void writeStringArrayToFile(ArrayList<String> array) throws IOException {
        
        try (BufferedWriter outputWriter = new BufferedWriter(new FileWriter(filename))) {
            
            for (String arrayItem : array) {
                outputWriter.write(arrayItem + "\n");
            }
            
            outputWriter.flush();
            
        } catch (Exception ex) {
            throw new IOException(ex);
        }
    }
}
