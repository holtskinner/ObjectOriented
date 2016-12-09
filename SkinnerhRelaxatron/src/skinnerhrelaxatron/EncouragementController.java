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
            Fortune fortune = new Fortune();
            String output = fortune.getText();
            outputText.setText(output);

            if (!encouragementArray.contains(output)) {
                encouragementArray.add(output);
            }
        } catch (Exception ex) {
            throw new Exception(ex);
        }
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
