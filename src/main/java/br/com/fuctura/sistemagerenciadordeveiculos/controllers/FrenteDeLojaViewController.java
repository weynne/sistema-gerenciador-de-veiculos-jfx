package br.com.fuctura.sistemagerenciadordeveiculos.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.fuctura.sistemagerenciadordeveiculos.Main;
import br.com.fuctura.sistemagerenciadordeveiculos.controllers.utils.Alerts;
import br.com.fuctura.sistemagerenciadordeveiculos.services.VeiculoService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FrenteDeLojaViewController implements Initializable {

	@FXML
	private Button btVeiculo;

	@FXML
	private void onBtVeiculoAction() throws IOException {
		loadView("/view/VeiculoView.fxml",
				"Sistema Gerenciador de Veículos - Veículos");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	private synchronized void loadView(String absoluteName, String title) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();

			Scene scene = Main.getMainScene();

			VBox mainVBox = (VBox) ((ScrollPane) scene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());

			Stage stage = (Stage) Main.getMainScene().getWindow();
			stage.setTitle(title);
			
			VeiculoViewController controller = loader.getController();
			controller.setVeiculoService(new VeiculoService());
			controller.updateTableView();

		} catch (IOException e) {
			Alerts.showAlert("IO EXception", "Erro ao carregar a página", e.getMessage(), AlertType.ERROR);
		}
	}
}
