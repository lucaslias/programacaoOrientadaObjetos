package exercicioDinossauro;

public class Dinossauro {
	private int energia = 0;
	private int velocidade = 0;
	private int temperatura = 0;
	private String humor = "feliz";
	
	public void pular() {
		System.out.println("O DINOSSAURO PULOU");
		this.energia--;
		this.humor="feliz";
	}
	
	public void correr() {
		System.out.println("O DINOSSAURO CORREU");
		this.energia--;
		this.humor="feliz";
	}
	
	public void comer() {
		System.out.println("O DINOSSAURO COMEU");
		this.energia++;
		this.humor="feliz";
	}	
	
	public void atirar() {
		System.out.println("O DINOSSAURO ATIROU");
		this.energia--;
		this.humor="feliz";
	}
	
	public void tomarSol() {
		System.out.println("O DINOSSAURO TOMOU SOL");
		this.temperatura++;
		this.humor="feliz";
		this.velocidade++;
		this.energia--;
	}
	
	public void ficarNaSombra() {
		this.temperatura--;
		this.energia++;
		this.humor="triste";
	}
	
	public void mostraCaracteristicas() {
		System.out.println("ENERGIA: "+this.energia);
		System.out.println("VELOCIDADE: "+this.velocidade);
		System.out.println("TEMPERATURA: "+this.temperatura);
		System.out.println("HUMOR: "+this.humor);
	}
}
