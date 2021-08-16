package ui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Operaciones;

public class OperacionesGUI {
	Operaciones op = new Operaciones();
	
	    @FXML
	    private TextField num1;

	    @FXML
	    private TextField num2;

	    @FXML
	    private Label multiplicationResult;

	    @FXML
	    private Label divisionResult;

	    @FXML
	    private Button multiplicationButton;

	    @FXML
	    private Button divisionButton;

	    @FXML
	    void dividir(ActionEvent event) {
	    	String numero1 = num1.getText();
	    	double numerador = Double.parseDouble(numero1);
	    	
	    	String numero2 = num2.getText();
	    	double denominador = Double.parseDouble(numero2);
	    	
	    	double resultado = op.dividir(numerador, denominador);
	    	divisionResult.setText(resultado+"");

	    }

	    @FXML
	    void multiplicar(ActionEvent event) {
	    	String numero1 = num1.getText();
	    	double multiplicando = Double.parseDouble(numero1);
	    	
	    	String numero2 = num2.getText();
	    	double multiplicador = Double.parseDouble(numero2);
	    	
	    	double resultado = op.multiplicar(multiplicando, multiplicador);
	    	multiplicationResult.setText(resultado+"");

	    }

}
