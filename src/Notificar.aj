

import observer.fx.PrincipalPrograma;
import observer.fx.ColorStation;



public aspect Notificar {

	
	pointcut cambio(): call(* setStyle*(..));

	after(): cambio(){
		
		
		System.out.println("Se ha cambiado el color de la ventana a:"+ColorStation.getcolorActual());
			
	}
	
	
}
