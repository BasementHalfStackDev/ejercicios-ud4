
public class ejercicio_5 {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 23;
		int C = 69;
		int D = 1;
		
		System.out.println("El valor de las variables A, B, C y D es de: "+A+", "+B+", "+C+" y "+D+" respectivamente.");
		System.out.println();
		
		int temp;
		
		temp = B;
		B = C;
		C = temp;
		
		temp = C;
		C = A;
		A = temp;
		
		temp = A;
		A = D;
		D = temp;
		
		temp = D;
		D = B;
		B = temp;
		
		System.out.println("El valor de las variables A, B, C y D intercambiadas es de: "+A+", "+B+", "+C+" y "+D+" respectivamente.");
		
	}

}
