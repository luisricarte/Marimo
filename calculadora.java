/**
* Laboratório de Programação 2 - Lab 1
*
* @author Mariane Silva de Carvalho - 119210450
*/

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String simbolo = sc.nextLine();
		if (!"+-*/".contains(simbolo) || simbolo.length() > 1) {
			System.out.println("ENTRADA INVALIDA");
		} else {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			if (simbolo.equals("+")) {
				double resultado = num1 + num2;
				System.out.println("RESULTADO: " + resultado);
			} else if (simbolo.equals("-")) {
				double resultado = num1 - num2;
				System.out.println("RESULTADO: " + resultado);
			} else if (simbolo.equals("*")) {
				double resultado = num1 * num2;
				System.out.println("RESULTADO: " + resultado);
			} else if (simbolo.equals("/") && num2 != 0) {
				double resultado = num1 / num2;
				System.out.println("RESULTADO: " + resultado);
			} else if (simbolo.equals("/") && num2 == 0) {
				System.out.println("ERRO");
			}
		}
	}
}
