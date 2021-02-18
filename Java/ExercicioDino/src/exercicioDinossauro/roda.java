package exercicioDinossauro;

import java.util.Scanner;

public class roda {

	public static void main(String[] args) {
		Dinossauro skeep = new Dinossauro();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			skeep.mostraCaracteristicas();
			System.out.println("(P)ular           (C)orrer               Co(M)er\r\n" + 
					"(A)tirar          Tomar (S)ol          Ficar na S(O)mbra\r\n" +
					"Sai(R) + \n \n");
			String textoMaiusculo = scan.nextLine().toUpperCase(); //deixa tudo em maiusculo
			char letra = textoMaiusculo.charAt(0); //retorna so a primeira letra

			switch (letra) {
			case ('P'):
				skeep.pular();
			break;
			case('C'):
				skeep.correr();
			break;
			case('M'):
				skeep.comer();
			break;
			case('A'):
				skeep.atirar();
			break;
			case('S'):
				skeep.tomarSol();
			break;
			case('O'):
				skeep.ficarNaSombra();
			break;
			case('R'):
				System.exit(0);
			break;
			}

		}
	}

}
