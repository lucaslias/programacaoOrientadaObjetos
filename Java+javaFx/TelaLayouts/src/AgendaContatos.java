import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class AgendaContatos extends Application {


	@Override
	public void start(Stage stage) throws Exception {
			
		GridPane painel = new GridPane();
		Scene scn = new Scene(painel, 600, 200);
			
		painel.add(new Label("id "), 0, 0);
		painel.add(new Label("nome "), 0, 1);
		painel.add(new Label("telefone "), 0, 2);
		

		TextField txtId = new TextField();
		TextField txtNome = new TextField();
		TextField txtTelefone = new TextField();
		painel.add(txtId, 1, 0);
		painel.add(txtNome, 1, 1);
		painel.add(txtTelefone, 1, 2);

		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(65);
		painel.getColumnConstraints().addAll(col1, col2);
			
		FlowPane painel2 = new FlowPane();
		
		Button btnSave = new Button("ok");
		Button btnPesquisar = new Button("cancelar");
		painel2.getChildren().addAll(btnSave, btnPesquisar);
			
		painel.add(painel2, 0, 3);
		painel.setVgap(10);
			
		stage.setTitle("Agenda de Contatos");
		stage.setScene(scn);
		stage.show();
		
	}



	public static void main(String[] args) {

		Application.launch(AgendaContatos.class, args);

	}


 }