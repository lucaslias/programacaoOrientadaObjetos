package Aula;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CadastroSofisticado extends Application {


	@Override
	public void start(Stage stage) throws Exception {
			
		GridPane painelPrincipal = new GridPane();
		Scene scn = new Scene(painelPrincipal, 600, 400);
		GridPane paneDimen = new GridPane();
		
		painelPrincipal.add(paneDimen, 1, 2);
			
		painelPrincipal.add(new Label("  Nome do produto: "), 0, 0);
		painelPrincipal.add(new Label("  Quantidade: "), 0, 1);
		painelPrincipal.add(new Label("  Dimensoes: "), 0, 2);
		painelPrincipal.add(new Label("  Peso: "), 0, 3);
		painelPrincipal.add(new Label("  Estoque: "), 0, 4);
		
		TextField txtNome = new TextField();
		TextField txtQuantidade = new TextField();
		Slider Peso = new Slider(0, 1, 0.5);
        ChoiceBox<String> Estoque = new ChoiceBox<String>();
        Estoque.getItems().add("central");
        Estoque.getItems().add("filial 1");
        Estoque.getItems().add("filial 2");
        Estoque.getItems().add("filial 3");
		
		painelPrincipal.add(txtNome, 1, 0);
		painelPrincipal.add(txtQuantidade, 1, 1);
		painelPrincipal.add(Peso, 1, 3);
		painelPrincipal.add(Estoque, 1, 4);
		
		TextField txtDimensao1 = new TextField();
		TextField txtDimensao2 = new TextField();
		TextField txtDimensao3 = new TextField();
		
		paneDimen.add(txtDimensao1, 1, 2);
		txtDimensao1.setMaxWidth(60);	
		paneDimen.add(txtDimensao2, 2, 2);
		txtDimensao2.setMaxWidth(60);
		paneDimen.add(txtDimensao3, 3, 2);
		txtDimensao3.setMaxWidth(60);
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(50);
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setPercentWidth(15);
		ColumnConstraints col4 = new ColumnConstraints();
		col4.setPercentWidth(10);
		painelPrincipal.getColumnConstraints().addAll(col1, col2,col3, col4);
		

		FlowPane painel2 = new FlowPane();
		Button btnSave = new Button("ok");
		Button btnPesquisar = new Button("cancelar");
		painel2.getChildren().addAll(btnSave, btnPesquisar);
			
		painelPrincipal.add(painel2, 0, 6);
		
		painelPrincipal.setVgap(10);
		paneDimen.setHgap(10);
		painel2.setHgap(25);
		
		stage.setTitle("Agenda de Contatos");
		stage.setScene(scn);
		stage.show();
		
	}

	public static void main(String[] args) {

		Application.launch(CadastroSofisticado.class, args);

	}


 }