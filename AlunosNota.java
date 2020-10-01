/**
* Laboratório de Programação 2 - Lab 1
*
* @author Mariane Silva de Carvalho - 119210450
*/

import java.util.Scanner;
import java.util.ArrayList;

public class AlunosNota {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> notas  = new ArrayList<Integer>();

		while (true) {

			String NomeNota = sc.nextLine();
			if (NomeNota.equals("-")) {
				break;
			}

			String[] dados = NomeNota.split(" ");
			notas.add(Integer.parseInt(dados[1]));

		}

		int maior = 0;
		int menor = 1000;
		int soma = 0;
		int acima = 0;
		int abaixo = 0;
		for (int nota : notas) {
			if (nota > maior) {
				maior = nota;
			}
			if (nota < menor) {
				menor = nota;
			}
			soma += nota;
			if (nota >= 700) {
				acima += 1;
			}
			if (nota < 700) {
				abaixo += 1;
			}
		}
		int media = soma / notas.size();

		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("media: " + media);
		System.out.println("acima: " + acima);
		System.out.println("abaixo: "+ abaixo);
	}
}
