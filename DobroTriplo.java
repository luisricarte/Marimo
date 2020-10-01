/**
* Laboratório de Programação 2 - Lab 1
*
* @author Mariane Silva de Carvalho - 119210450
*/

import java.util.Scanner;

public class DobroTriplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int dobro = x * 2;
		int triplo = x * 3;
		System.out.println("dobro: " + dobro + ", triplo: " + triplo);
	}
}
