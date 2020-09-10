package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;

	public void entrar() {

		boolean emailValido = campoEmail.getText().contentEquals("aluno@cod3r.com.br");
		boolean senhaValida = campoSenha.getText().contentEquals("12345678");
		if (emailValido && senhaValida) {
			Notifications.create()
			.position(Pos.BOTTOM_RIGHT)
			.title("Login FXML")
			.graphic(null)
			.text("Login efetuado com Sucesso!")
			.showInformation();
			
		} else {
			Notifications.create()
			.position(Pos.BOTTOM_RIGHT)
			.title("Login FXML")
			.graphic(null)
			.text("Usuário/Senha Inválidos")
			.showError();
		}

	}

}
