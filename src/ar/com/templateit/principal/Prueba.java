package ar.com.templateit.principal;

//Ejemplo de creacion de un objeto que dentro de una clase se puede poner el metodo main
public class Prueba {
	
	//atributo de la clase
	String mensaje = "Soy un objeto de la clase Prueba...";
	
	
	//este metodo permite ejecutar un programa java
	public static void main(String[] args) {
	
		Prueba objetoPrueba = new Prueba();
		
		//este metodo permite ver en consola un mensaje y valores del objeto
		System.out.println(objetoPrueba.mensaje);
	}

}
