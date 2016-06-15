package de.hhu.propra16;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.*;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
	
	@FXML
	Button btlabel;
	
	@FXML
	Label text;
	
	@FXML
	Button btblau;
	
	
	@FXML
	protected void dateiladen(ActionEvent event) {
		FileChooser dialog = new FileChooser();
		File file = dialog.showOpenDialog(new Stage());
		
		text.setText(file.getName());
		
		
	}
	
	@FXML
	protected void changecolor(ActionEvent event) {
		
		FiveButtons.farbe();
		
	}
	
	
	
	
}
