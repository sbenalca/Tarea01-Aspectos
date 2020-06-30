package observer.fx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ColorStation {
	private StackPane root;
    
	private Button rojo;
	private Button azul;
	private Button verde;
	private String colorActual;
    
    public ColorStation(){
    	this.root = new StackPane();
        
    	this.rojo = new Button();
        this.azul = new Button();
        this.verde = new Button();
        
        
    	
    	this.rojo.setText("Rojo");
        this.verde.setText("Verde");
        this.azul.setText("Azul");
        
        cambiarColor(this.rojo,"-fx-background-color: #a00000");
        cambiarColor(this.verde,"-fx-background-color: #008000");
        cambiarColor(this.azul,"-fx-background-color: #293492");
    }
    
    public void cambiarColor(Button btn,String color){
        
    	btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            	colorActual = btn.getText();
            	root.setStyle(color);
                
            }
        });
    
    
    }

    public StackPane getRoot() {
    	return this.root;
    }
    
    public Button getRojo() {
    	return this.rojo;
    }
    
    public Button getVerde() {
    	return this.verde;
    }
    
    public Button getAzul() {
    	return this.azul;
    }
    
    public String getcolorActual() {
    	return this.colorActual;
    }
    
    public void setcolorActual(String colorActual) {
    	this.colorActual=colorActual;
    }
    
   
}
