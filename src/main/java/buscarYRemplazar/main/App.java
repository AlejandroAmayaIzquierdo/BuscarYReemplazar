package buscarYRemplazar.main;

import dad.BuscarYReemplazar.ByRView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	

	@Override
	public void start(Stage stage) throws Exception {
		
		
		stage.setTitle("BuscarYRemplazar");
		stage.setMinWidth(390);
		stage.setMinHeight(200);
		stage.setScene(new Scene(new ByRView(),640,200));
		stage.show();
		

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
