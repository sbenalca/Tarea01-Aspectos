

import observer.fx.PrincipalPrograma;
import observer.fx.ColorStation;



public aspect Notificar {

	
	pointcut cambio(): call(* setStyle*(..));

	after(): cambio(){
		
		ColorStation estacion=PrincipalPrograma.station;
		System.out.println("Se ha cambiado el color de la ventana a:"+estacion.getcolorActual());
			
	}
	
	
}
