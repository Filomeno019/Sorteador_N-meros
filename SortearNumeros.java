package TudoAQ;

import java.util.Random;
import java.util.Scanner;

public class SortearNumeros {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SortearNumeros s = new SortearNumeros();
		s.sorteador();
	}

	public void sorteador() {

		Random gerador = new Random();

		for (int i = 1; i <= 1; i++) {
			int numeroSorteado = gerador.nextInt(51);

			System.out.println("           J O G O  N � M E R O S  " + "\n--------------------------------------------"
					+ "\nBem vindo ao Game aonde vc dever� adivnnhar o \nO valor de um n�mero aleat�rio entre 1 e 50."
					+ "\n--------------B O A  S O R T E--------------");

			int numeroChutado = 0;

			while (numeroChutado != numeroSorteado) {
				System.out.println("\nDigite seu chute");
				numeroChutado = sc.nextInt();

				if (numeroChutado < numeroSorteado) {
					System.out.println("O chute est� abaixo do valor !!!");
				} else if (numeroChutado > numeroSorteado) {
					System.out.println("Puts, seu chute est� acima do valor  !!!");
				}
			}
			System.out.println("Parab�ns Gafanhoto, voc� acertou !!");
		}

	}
}