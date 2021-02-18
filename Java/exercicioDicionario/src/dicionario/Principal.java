package dicionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Dici> lista = new ArrayList<>();
		
		// Dici teste1 = new Dici ("paralelepipedo", "prisma de seis lados cujas faces s�o paralelogramos; hexaedro cujas faces opostas s�o paralelogramos paralelos");
	    //lista.add(teste1);
		
		lista.add(new Dici ("paralelepipedo", "prisma de seis lados cujas faces s�o paralelogramos; hexaedro cujas faces opostas s�o paralelogramos paralelos"));
		lista.add(new Dici ("otorrinolaringologista", "especialista em otorrinolaringologia"));
		lista.add(new Dici ("musica", "combina��o harmoniosa e expressiva de sons."));
		
	   
	
		
		System.out.printf("Informe a palavra a ser procurada:\n");
		String palavra = ler.next();
		
		if ( Dici.buscar(lista, palavra) != null){
			System.out.println(Dici.buscar(lista, palavra).getPalavra());
			System.out.println(Dici.buscar(lista, palavra).getSignificado());
			
		}
		
		else {
			System.out.println("palavra nao encontrada");
			System.out.printf("Informe o siginicado");
			String significado = ler.next();
			lista.add(new Dici(palavra,significado));

		}
		
		
	}

}