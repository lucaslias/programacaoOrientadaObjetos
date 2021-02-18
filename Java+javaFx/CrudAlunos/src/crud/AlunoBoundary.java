package crud;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.LongStringConverter;

public class AlunoBoundary implements EventHandler<ActionEvent>, SubTela {
	
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNascimento = new TextField();

	private Button btnGravar = new Button("Gravar");
	private Button btnPesquisar = new Button("Pesquisar");

	private AlunoControl control = new AlunoControl();
	
	private TableView<Aluno> table = new TableView<>();

		@Override
		public Pane gerarTela() { 
		vincularCampos();
		
        BorderPane panePrincipal = new BorderPane();
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

        panePrincipal.setTop(paneCampos);
        panePrincipal.setCenter(table);
        
        return panePrincipal;
	}
		
	public void vincularCampos() { 
		
		StringConverter<? extends Number> converter = new LongStringConverter();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringConverter<LocalDate> dateConverter = new LocalDateStringConverter(dtf, dtf);
        Bindings.bindBidirectional(txtId.textProperty(), control.getIdProperty(),(StringConverter<Number>)converter);
        Bindings.bindBidirectional(txtNome.textProperty(), control.getNomeProperty());
        Bindings.bindBidirectional(txtRa.textProperty(), control.getRaProperty());
        Bindings.bindBidirectional(txtNascimento.textProperty(), control.getNascimentoProperty(), dateConverter);
        
        TableColumn<Aluno, Long> colId = new TableColumn<>("Id");
        colId.setCellValueFactory( new PropertyValueFactory<Aluno, Long>("id") );
      
        TableColumn<Aluno, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory( new PropertyValueFactory<Aluno, String>("nome") );        
      
        TableColumn<Aluno, String> colRa = new TableColumn<>("Ra:");
        colRa.setCellValueFactory( new PropertyValueFactory<Aluno, String>("Ra") );
      
        TableColumn<Aluno, String> colNascimento = new TableColumn<>("Nascimento");
        colNascimento.setCellValueFactory(
      		(item) -> {
      			return new ReadOnlyStringWrapper( 
      					item.getValue().getNascimento().format(dtf)
      					);
      		}
      		);
      
      table.getColumns().addAll(colId, colNome, colRa, colNascimento);
      table.setItems(control.getLista());
      
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