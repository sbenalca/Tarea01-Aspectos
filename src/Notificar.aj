import java.security.Principal;


public aspect Notificar {

	
	pointcut cambio(): call(* cambiar*(..));

	after(): cambio(){
		
		
		System.out.println("Se ha cambiado el color de la ventana");
		
	}
	
	
	
}
