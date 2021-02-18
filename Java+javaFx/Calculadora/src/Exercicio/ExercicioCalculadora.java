package Exercicio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExercicioCalculadora extends Application {
	
	public void start(Stage stage) { 
		String[] nomes = {"  1  ", "  2  ", "  3  ", "  +  ", "  4  ", "  5  ", "  6  ", "   -  ",
				"  7  ", "  8  ", "  9  ", "   *  ","   .  ", "  0  ", "  =  ", "   /  "};
		
		BorderPane panePrincipal = new BorderPane();
		GridPane paneBotoes = new GridPane();
		Scene scn = new Scene(panePrincipal, 155, 130);
		panePrincipal.setCenter(paneBotoes);
		
		paneBotoes.setVgap(1);
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		paneBotoes.getColumnConstraints().addAll(col1, col1, col1, col1);
		
		FlowPane paneDisplay = new FlowPane();
		panePrincipal.setTop(paneDisplay);	
		
		for (int i = 0; i < 16; i++) { 
			Button btn = new Button( nomes[i] );
			int lin = i / 4;
			int col = i % 4;
			paneBotoes.add(btn, col, lin);
		}
		
		TextField txtDisplay = new TextField();
		txtDisplay.setMaxWidth(125);
		Button btnCE = new Button("CE");
		paneDisplay.getChildren().addAll(txtDisplay, btnCE);
		
		stage.setScene(scn);
		stage.setTitle("Calculadora");
		stage.show();		
	}
	
	public static void main(String[] args) {
		Application.launch(ExercicioCalculadora.class, args);
	}

}


