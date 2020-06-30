package observer.fx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class ColorButton {
	private Button btn;
	private String color;
	private String colorCode;
	private ColorStation st;
	
	
	
	
	public ColorButton(String color,String colorCode,ColorStation st) {
		this.st=st;
		this.btn=new Button();
		this.btn.setText(color);
		this.colorCode=colorCode;
		this.color=color;
		cambiarColor(this);
		
				
		
	}
	
public void cambiarColor(ColorButton btnc){
        
    	btnc.getBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {            	
            	ColorStation.setcolorActual(btnc.getColor());
            	st.getRoot().setStyle(btnc.getColorCode());
            	
            	
                
            }
        });
    
    
    }
	
	public Button getBtn() {
		return this.btn;
	}
	
	public String getColorCode() {
		return this.colorCode;
	}
	
	public String getColor() {
		return this.color;
	}
	
	
	
}
