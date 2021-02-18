package dicionario;

import java.util.ArrayList;

public class Dici {
	
	private String palavra;
	private String significado;
	
	public Dici(String palavra, String significado) {	
		this.palavra = palavra;
		this.significado = significado;
	}

	public String getPalavra() {
		return palavra;
	}
	
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public String getSignificado() {
		return significado;
	}
	
	public void setSignificado(String significado) {
		this.significado = significado;
	}
	

	public static Dici buscar(ArrayList<Dici> lista, String palavrabusca) {
		
		for (Dici s : lista) { 
			
			if (s.getPalavra().equals(palavrabusca)){	
				return s;
			}
			
		}
		return null;
		
	}

	
}
