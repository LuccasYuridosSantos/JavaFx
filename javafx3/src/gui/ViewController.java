package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import util.Alerts;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	@FXML 
	public void onBtTestAction () {
		Alerts.showAlert("Alert title", null, "Hello", AlertType.ERROR);
	}
	
}
