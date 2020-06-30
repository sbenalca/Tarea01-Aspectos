package observer.fx;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ColorStation {
	private StackPane root;	
	private static String colorActual;
	private ArrayList<ColorButton> botones;
	
	
	
    
    public ColorStation(){
    	this.root = new StackPane();
    	this.botones=new ArrayList<ColorButton>();
        
    	
    	this.botones.add(new ColorButton("Rojo","-fx-background-color: #a00000",this));
    	this.botones.add(new ColorButton("Verde","-fx-background-color: #008000",this));
    	this.botones.add(new ColorButton("Azul","-fx-background-color: #293492",this));
    	
           	
    	
    }
    


    public StackPane getRoot() {
    	return this.root;
    }
    
       
    public static String getcolorActual() {
    	return ColorStation.colorActual;
    }
    
    public static void setcolorActual(String colorActual) {
    	ColorStation.colorActual=colorActual;
    }
    
    public ArrayList<ColorButton> getBotones(){
    	return this.botones;
    }
    
   
}
