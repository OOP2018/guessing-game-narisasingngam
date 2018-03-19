package game;

import java.net.URL;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main extends Application{
	public static void main(String[] args) {
		
		launch(args);

//		int upperBound = Integer.MAX_VALUE;
//		NumberGame game = new NarisaGame(upperBound);
//		GameConsole ui = new GameConsole( );
//		GameSolver u = new GameSolver();
//		int solution = ui.play( game );
//		System.out.println("play() returned "+solution);
//		System.out.println("You guess " + game.getCount()+ " times.");
		
	}

	@Override
	public void start(Stage primaryStage) {
		
		int upperBound = 100;
		NumberGame game = new NarisaGame(upperBound);
		
		try {
			URL url = getClass().getResource("GameUI.fxml");
			if (url == null) {
				System.out.println("Couldn't find file: GameUI.fxml");
				Platform.exit();
			}
			// Load the FXML and get reference to the loader
			FXMLLoader loader = new FXMLLoader(url);
			// Create the UI. This will instantiate the controller object, too.
			Parent root = loader.load();
			// Now we can get the controller object from the FXMLloader.
			// This is interesting -- we don't need to use a cast!
			GuessingGameController controller = loader.getController();
			
			// Dependency Injection:
			// Set the Counter object we want the view to update.
			controller.setGame(game);
			

			// Build and show the scene
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.setTitle("Click Counter");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		
		CounterView view2 = new CounterView(game);
		game.addObserver(view2);
		view2.run();
		
	}
	

		
		
	
}
