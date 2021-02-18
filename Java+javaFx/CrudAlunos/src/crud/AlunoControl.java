package crud;
import java.time.LocalDate;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AlunoControl {

	private ObservableList<Aluno> lista = FXCollections.observableArrayList();

	private LongProperty id = new SimpleLongProperty();
	private StringProperty nome = new SimpleStringProperty();
	private StringProperty ra = new SimpleStringProperty();
	private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>(LocalDate.now());

	public Aluno getAluno() { 
		Aluno c = new Aluno();
		c.setId(this.id.get());
		c.setNome(this.nome.get());
		c.setRa(this.ra.get());
		c.setNascimento(this.nascimento.get());
		return c;
	}

	public void setContato(Aluno c) { 
		if (c != null) {
			this.id.set(c.getId());
			this.nome.set(c.getNome());
			this.ra.set(c.getRa());
			this.nascimento.set(c.getNascimento());
		}
	}

	public void adicionar() {
		lista.add(getAluno());
	}

	public void pesquisarPorNome() { 
		String txt = this.nome.get();
		for (Aluno c : lista) { 
			if (c.getNome().contains(txt)) { 
				setContato(c);
			}
		}
	}

	public LongProperty getIdProperty() {
		return id;
	}
	public StringProperty getNomeProperty() {
		return nome;
	}
	public StringProperty getRaProperty() {
		return ra;
	}
	public ObjectProperty<LocalDate> getNascimentoProperty() {
		return nascimento;
	}
	
	public ObservableList<Aluno> getLista() { 
		return lista;
	}
	

}