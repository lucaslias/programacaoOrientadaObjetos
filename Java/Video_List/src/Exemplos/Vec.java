package Exemplos;

import java.util.Vector;

public class Vec {

	public static void main(String args[]) {

		Vector<Integer> lista = new Vector<Integer>();
		
		Vector<String> lista2 = new Vector<String>();
		
		Vector<Pessoa> lista3 = new Vector<Pessoa>();
		
		lista.add(1);
		lista.add(7);
		lista.add(5);
		
		lista2.add("joao");
		
		Pessoa a = new Pessoa ("mario",17);
		lista3.add(a);
		
		System.out.println(lista.get(2));
		System.out.println(lista2.get(0));

		Pessoa mostra = (lista3.get(0));
		System.out.println(mostra.getNome() + " " + mostra.getIdade());
		
		lista.remove(1);
		System.out.println(lista.get(0) + " " + lista.get(1));
		

	}

}