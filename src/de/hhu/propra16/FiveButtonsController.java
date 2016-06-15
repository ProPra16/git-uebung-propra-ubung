package de.hhu.propra16;

<<<<<<< HEAD
import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.*;
=======
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
>>>>>>> 53ec5e32f31d295d9ad4dd3a7cf596a10780e66e

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
	
<<<<<<< HEAD
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
	
	
	
	
=======
	public Button Alarm() {

		BorderPane border = new BorderPane();
		Button Alarm = new Button("Alarm");
		Alarm.setOnAction(event -> { 
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Fehler");
			alert.setContentText("Too Many Buttons");
			alert.showAndWait();
		});
	
	}
>>>>>>> 53ec5e32f31d295d9ad4dd3a7cf596a10780e66e
}
