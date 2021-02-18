package Aula1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Tela extends Application{

    @Override
    public void start(Stage stage){
    	
    	Pane painel = new Pane();
        Scene cena = new Scene(painel, 500,200 );
        
        Label texto1 = new Label("ensira seu numero");
        texto1.relocate(50, 30);
        TextField textonumero = new TextField();
        textonumero.relocate(170, 30);
        
        Label texto2 = new Label("ensira seu nome");
        texto2.relocate(50, 80);
        TextField textonome = new TextField();
        textonome.relocate(170, 80);
        
        Button btnok = new Button("ok");
        btnok.relocate(50, 130);
        
	    Button btncanc = new Button("cancelar");
        btncanc.relocate(100, 130);
        painel.getChildren().addAll(texto1,texto2,textonumero,textonome,btnok, btncanc);
        
		stage.setScene(cena);
		stage.setTitle("tela contato");
		stage.show();
       

    }
    
    public static void main(String[] args) {
    	
        Application.launch(Tela.class, args);
    }
}