
public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setCpf("181981");
		p1.setNome("joao");
		p1.setPeso("40");
		
		p1.existe();
		System.out.println("e se chama" + p1.getNome());

		

		
	

	}

}
