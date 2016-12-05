package skinnerhrelaxatron;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

// Superclass of all viewcontrollers
// Allows Chrome elements (Menu, file open, etc) to stay consistant
// Also allows for simplification & modularization of subclasses

public abstract class ViewController implements Initializable {
    
    public static Scene scene;
    public static final HashMap<String, ViewController> controllers = new HashMap<>();
    
    private Parent root;  
    
    public void setRoot(Parent root) {
        this.root = root;
    }
    
    public Parent getRoot() {
        return root;
    }

    public static ViewController add(String name) {
        ViewController controller;
        
        controller = controllers.get(name);
        
        if (controller == null) {
            try {
                FXMLLoader loader = new FXMLLoader(ViewController.class.getResource(name + ".fxml"));
                Parent root = (Parent)loader.load();
                controller = (ViewController)loader.getController();
                controller.setRoot(root);
                controllers.put(name, controller);
            } catch (Exception ex) {
                System.out.println("Error loading " + name + ".fxml\n" + ex);
                controller = null;
            }
        }
        
        return controller;
    }
    
    public static void switchTo(String name) {
        ViewController controller = controllers.get(name);
        
        if (controller == null) {
            controller = add(name);
        }
        
        if (controller != null) {
            if (scene != null) {
                scene.setRoot(controller.getRoot());
            }
        }
    }
    
    public static ViewController getControllerByName(String name) {
        return controllers.get(name);
    }
    
    @FXML
    private void displayAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Relaxatron");
        alert.setContentText("CS 3330 Final Project developed by Holt Skinner. Inspired by my stressful experience of trying to throw together 3 Final Projects at once in Fall 2016.");
        alert.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
