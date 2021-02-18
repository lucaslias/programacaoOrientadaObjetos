
public class Passageiro extends Pessoa {
	
	private String passaporte;
	
	
	public String getPassaporte() {
		return passaporte;
	}


	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}


	public void embarque() {
		
		System.out.println("esse passageiro embarcou");
		
	}
	
}
