
public class Piloto extends Pessoa {
	
	private String breve;
	private String anos_prof;
	
	public String getBreve() {
		return breve;
	}


	public void setBreve(String breve) {
		this.breve = breve;
	}


	public String getAnos_prof() {
		return anos_prof;
	}


	public void setAnos_prof(String anos_prof) {
		this.anos_prof = anos_prof;
	}


	public void voar() {
		
		System.out.println("esse piloto pode voar");
		
	}

}
