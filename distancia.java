import java.lang.Math;

class distancia 
	{ 
	public static void main(String[] args) { 
		double xi = 0.0; //inicialización de la variable distancia inicial
		double a = 9.8; //aceleración
		double t = 10.0; //variable tiempo
		double vi = 2.0; //velocidad inicial
		double x = 0.5*a*(Math.pow(t, 2))+vi*t+xi; //fórmula de distacia con respecto al tiempo
		System.out.println ("la distacia recorrida es: "+x); //muestra el resultado de la función


	} 
}