# Tarea01-Aspectos

Como grupo agregamos una nueva funcionalidad a la que llamamos Botónes dinámicos, consistió en agregar un botón adicional que permitía agregar más botones al menú de selección haciendo que este puediese expandir su gama de colores.
Además enlazamos esta funcionalidad con aspectos para notificar cambios ya sean de la creación de un nuevo botón de color o de un cambio en el color de fondo de nuestro panel.

Y finalmente, aplicamos el patrón de diseño Observer, creando la clase ColorStage como el observable, y la clase ColorButton como los objetos observers que reaccionarían a cambios en nuestro ColorStage instanciado en el main. La acción que desencadenaba la notificación de cambios era el agregar un presionar el botón: "Nuevo Color" el cuál hacía que se crearan nuevos objetos de tipo ColorButton y les asignaba un color aleatorio y código hexadecimal correspondiente a dicho color.
