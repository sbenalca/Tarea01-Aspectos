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
public class Principal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Button rojo = new Button();
        Button azul = new Button();
        Button verde = new Button();
        rojo.setText("Rojo");
        verde.setText("Verde");
        azul.setText("Azul");
        cambiarColor(rojo,"-fx-background-color: #a00000",root);
        cambiarColor(verde,"-fx-background-color: #008000",root);
        cambiarColor(azul,"-fx-background-color: #293492",root);
       
        VBox hb=new VBox();
        hb.getChildren().add(rojo);
        hb.getChildren().add(verde);
        hb.getChildren().add(azul);
        root.getChildren().add(hb);
        hb.setSpacing(5);
        hb.setAlignment(Pos.CENTER);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Cambio de color de la ventana");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    public void cambiarColor(Button btn,String color,StackPane root){
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                root.setStyle(color);
            }
        });
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

