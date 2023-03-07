
public class TA04Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);
		
		System.out.println();
		
		B = C;
		System.out.println("B = C = " + B);
		C = A;
		System.out.println("C = A = " + C);
		A = D;
		System.out.println("A = D = " + A);
		D = B;
		System.out.println("A = D = " + D);
		
		System.out.println();
	}

}
