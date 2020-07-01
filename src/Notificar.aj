

import observer.fx.PrincipalPrograma;
import observer.fx.ColorStation;



public aspect Notificar {

	
	pointcut cambio(): call(* setStyle*(..));

	after(): cambio(){
		
		
		System.out.println("Se ha cambiado el color de la ventana a:"+ColorStation.getcolorActual());
			
	}

	pointcut nuevo(): call(* nuevoBoton*(..));

	after(): nuevo(){
		
		
		System.out.println("Se ha agregado un nuevo boton de color: "+PrincipalPrograma.colorNuevoBoton);
			
	}
	
	
}
