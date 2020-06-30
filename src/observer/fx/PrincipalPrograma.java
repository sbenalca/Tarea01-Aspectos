package observer.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Darinka
 */
public class PrincipalPrograma extends Application {
	public static ColorStation station;
    @Override
    public void start(Stage primaryStage) {
        
    	station = new ColorStation();  
        
       
        VBox hb=new VBox();
        hb.getChildren().add(station.getRojo());
        hb.getChildren().add(station.getVerde());
        hb.getChildren().add(station.getAzul());
        station.getRoot().getChildren().add(hb);
        hb.setSpacing(5);
        hb.setAlignment(Pos.CENTER);
        
        
        Scene scene = new Scene(station.getRoot(), 300, 250);
        
        primaryStage.setTitle("Cambio de color de la ventana");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

