package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GuessingGameController {

	@FXML
	TextField textfield;
	@FXML
	Button button1;
	@FXML
	Label label;
	private NumberGame game;
	
	public void setGame(NumberGame game){
		this.game = game;
	}

	@FXML
	public void guessNumber(ActionEvent event) {
		label.setVisible(true);
		
		String text = textfield.getText().trim();
		int num = Integer.parseInt(text);
		
		if(game.guess(num)){
			label.setText(game.getMessage());
		}else{
			label.setText(game.getMessage());
		}
		
		textfield.clear();
	}
	
	
	
	

}
