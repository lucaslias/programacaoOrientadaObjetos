package exercicio;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.LongStringConverter;

public class AlunoBoundary extends Application implements EventHandler<ActionEvent>{
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNascimento = new TextField();

	private Button btnGravar = new Button("Gravar");
	private Button btnPesquisar = new Button("Pesquisar");

	private AlunoControl control = new AlunoControl();

	@Override
	public void start(Stage stage) { 
		vincularCampos();
        BorderPane panePrincipal = new BorderPane();
        Scene scn = new Scene(panePrincipal, 600, 300);

        GridPane paneCampos = new GridPane();

        paneCampos.add(new Label("ID"), 0, 0);
        paneCampos.add(txtId, 1, 0);
        
        paneCampos.add(new Label("RA"), 0, 1);
        paneCampos.add(txtRa, 1, 1);
        
        paneCampos.add(new Label("Nome"), 0, 2);
        paneCampos.add(txtNome, 1, 2);
           
        paneCampos.add(new Label("Nascimento"), 0, 3);
        paneCampos.add(txtNascimento, 1, 3);
        
        paneCampos.add(btnGravar, 0, 4);
        paneCampos.add(btnPesquisar, 1, 4);

        btnGravar.setOnAction(this);
        btnPesquisar.setOnAction(this);

        panePrincipal.setCenter(paneCampos);

        stage.setScene(scn);
        stage.setTitle("Gest�o de Aluno");
        stage.show();
	}

	public void vincularCampos() { 
		StringConverter<? extends Number> converter = new LongStringConverter();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringConverter<LocalDate> dateConverter = new LocalDateStringConverter(dtf, dtf);
        Bindings.bindBidirectional(txtId.textProperty(), control.getIdProperty(),(StringConverter<Number>)converter);
        Bindings.bindBidirectional(txtNome.textProperty(), control.getNomeProperty());
        Bindings.bindBidirectional(txtRa.textProperty(), control.getRaProperty());
        Bindings.bindBidirectional(txtNascimento.textProperty(), control.getNascimentoProperty(), dateConverter);
	}

	public static void main(String[] args) {
		Application.launch(AlunoBoundary.class, args);
	}

	@Override
	public void handle(ActionEvent e) {
		if (btnGravar == e.getTarget()) { 
			control.adicionar();
		} else if (btnPesquisar == e.getTarget()){ 
			control.pesquisarPorNome();
		}

	}


}