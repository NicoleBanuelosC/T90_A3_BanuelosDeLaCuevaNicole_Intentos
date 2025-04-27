import java.util.Scanner;

public class I1 {
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num1, num2;
	
		System.out.println("Ingresa un primer numero: ");
		num1 = entrada.nextDouble();
		
		System.out.println("Ingresa un segundo numero: ");
		num2 = entrada.nextDouble();
		
		double res = num1 + num2;
		
		System.out.println("El resultado es: " + res);
		
	
		
	}//void main

}//public class
