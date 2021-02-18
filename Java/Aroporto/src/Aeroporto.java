
public class Aeroporto extends Aeronave {
	
	String nome;
	String cidade;
	String pais;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void qualidade() {
		
		System.out.println("esse aeroporto eh massa");
		
	}

}
