package crud;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Principal extends Application implements EventHandler<ActionEvent>, GerenciadorComandos {
	
	private MenuBar mnuBar = new MenuBar();
	
		private Menu mnuSistema = new Menu("alunos");
			private MenuItem mnuAluno = new MenuItem("Cadastro de aluno");
			private MenuItem mnuSair = new MenuItem("Sair");
			
		private Menu mnuAjuda = new Menu("Ajuda");
			private MenuItem mnuCreditos = new MenuItem("Créditos");
	
	private BorderPane panePrincipal = new BorderPane();
	
	private AlunoBoundary alunoBoundary = new AlunoBoundary();
	private CreditosBoundary creditosBoundary = new CreditosBoundary();

	public void start(Stage stage) { 
		
		mnuSistema.getItems().addAll(mnuAluno, mnuSair);
		mnuAjuda.getItems().addAll(mnuCreditos);
		
		mnuAluno.setOnAction(this);
		mnuSair.setOnAction(this);
		mnuCreditos.setOnAction(this);
		
		mnuBar.getMenus().addAll(mnuSistema, mnuAjuda); 
		
		Scene scn = new Scene(panePrincipal, 640, 480);
		
		panePrincipal.setTop(mnuBar);
		
		panePrincipal.setCenter(alunoBoundary.gerarTela());
		
		
		stage.setScene(scn);
		stage.setTitle("Sistema Integrado");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(Principal.class, args);
	}

	@Override
	public void handle(ActionEvent e) {
		if (e.getTarget() == mnuSair) { 
			executarComando("sair");
		} else if (e.getTarget() == mnuAluno) { 
			executarComando("aluno");
		} else if (e.getTarget() == mnuCreditos) { 
			executarComando("creditos");
			System.out.println("foi");
		} 
		
	}

	@Override
	public void executarComando(String comando) {
		if ("sair".equals(comando)) { 
			System.exit(0);
		} else if ("aluno".equals(comando)) { 
			panePrincipal.setCenter(alunoBoundary.gerarTela());
		} else if ("creditos".equals(comando)) { 
			panePrincipal.setCenter(creditosBoundary.gerarTela());			
		}
	}
}
