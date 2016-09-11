package skinnerhnotifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 *
 *@author   skinnerh
 *          Holt Skinner
 *          CS3330
            Challenge 4 - Notifier
*/
public class SkinnerhNotifier extends Application {
    
    public String appName = "Notifier";
    public int sceneWidth = 400;
    public int sceneHeight = 250;
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        root.setAlignment(Pos.CENTER);
        
        TextField textField = new TextField();
        root.add(textField, 0, 0);
        
        Button notifyButton = new Button("Notify");
        root.add(notifyButton, 1, 0);
        
        notifyButton.setOnAction((ActionEvent event) -> {
            textField.setText("You have been notified!");
        });
        
        Button clearButton = new Button("Clear");
        root.add(clearButton, 1, 1);
        
        clearButton.setOnAction((ActionEvent event) -> {
            textField.clear();
        });
       
        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        
        primaryStage.setTitle(appName);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
