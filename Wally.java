/**
* Laboratório de Programação 2 - Lab 1
*
* @author Mariane Silva de Carvalho - 119210450
*/

import java.util.Scanner;

public class Wally{
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                while (true) {

		String NomeIni = sc.nextLine();
		if (NomeIni.equals("wally")) {
			break;
		}

                String[] nomes = NomeIni.split(" ");

                String novoNome = "";

                for (String nome : nomes) {
                        if (nome.length() == 5) {
                        novoNome = nome;
                        }
                }

                if (novoNome != "") {
                        System.out.println(novoNome);
                } else {
                        System.out.println("?");
                }  
                }
        }
}
