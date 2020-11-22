package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.Alerts;
import util.Constraints;

public class ViewController  implements Initializable{

	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btSum;

	@FXML
	public void nBtSumClick() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());

			double sum = number1 + number2;

			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 8);
		Constraints.setTextFieldMaxLength(txtNumber2, 8);
		//Constraints.setTextFieldInteger(txtNumber1);
		//Constraints.setTextFieldInteger(txtNumber2);
	}

}
