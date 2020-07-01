package observer.fx;

import java.util.Arrays;
import java.util.*;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
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
	public static String colorNuevoBoton;
	ArrayList<String> colores = new ArrayList<String>(Arrays.asList("#ffffbf","#ffa29c","#005d63","#8e402a ","#7f69a5"));
	ArrayList<String> nombrecolores= new ArrayList<String>(Arrays.asList("Amarillo","Rosa","Turquesa","Café","Lirio"));
    
	
	@Override
    public void start(Stage primaryStage) {
    	
        
    	station = new ColorStation();         
       
        VBox hb=new VBox();
        VBox hb2=new VBox();        
        
        
        
        Scene scene = new Scene(station.getRoot(), 500, 500);
        
        primaryStage.setTitle("Cambio de color de la ventana");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }   
    
    public void cambiarColorNuevo(Button bt,VBox hb) {
    	
    	bt.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            	nuevoBoton(bt,hb);
            }
        });
    }
    
    public void nuevoBoton(Button bt,VBox hb) {
    	String color = nombrecolores.get(nombrecolores.size()-1);
    	String colorCode = colores.get(colores.size()-1);
    	colorNuevoBoton=color;
    	
    	ColorButton nuevof=new ColorButton(color,"-fx-background-color: "+colorCode,station);
    	hb.getChildren().add(nuevof.getBtn());
    	nombrecolores.remove(nombrecolores.size()-1);
    	colores.remove(colores.size()-1);
    	
    	if (nombrecolores.size()==0) {
    		bt.setDisable(true);
    	}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

