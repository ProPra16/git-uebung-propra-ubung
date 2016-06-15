package de.hhu.propra16;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
	
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
}
