
public class ejercicio_1 {

	public static void main(String[] args) {
		
		//Agrego variables con los dos numeros.
		
		int n1 = 3;
		double n2 = 5.4;
		
		// Muestro el resultado de las operaciones. Formateando el resultado para que muestre solo dos decimales.
		
		System.out.println("La suma de los numeros " + n1 + " + " + n2 + " es: " + String.format("%.2f",(n1+n2)));
		System.out.println("La resta de los numeros " + n1 + " + " + n2 + " es: " + String.format("%.2f",(n1-n2)));
		System.out.println("La multiplicacion de los numeros " + n1 + " + " + n2 + " es: " + String.format("%.2f",(n1*n2)));
		System.out.println("La division de los numeros " + n1 + " + " + n2 + " es: " + String.format("%.2f",(n1/n2)));
		System.out.println("El modulo de los numeros " + n1 + " + " + n2 + " es: " + String.format("%.2f",(n1%n2)));

	}

}
