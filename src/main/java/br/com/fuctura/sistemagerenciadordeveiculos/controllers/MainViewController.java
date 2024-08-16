package br.com.fuctura.sistemagerenciadordeveiculos.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.fuctura.sistemagerenciadordeveiculos.Main;
import br.com.fuctura.sistemagerenciadordeveiculos.controllers.utils.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemFrenteDeLoja;

	@FXML
	private MenuItem menuItemManutencaoNoCadastro;

	@FXML
	private MenuItem menuItemSair;

	@FXML
	private MenuItem menuItemSobre;

	@FXML
	public void onMenuItemFrenteDeLojaAction() {
		System.out.println("onMenuItemFrenteDeLojaAction");
	}

	@FXML
	public void onMenuItemManutencaoNoCadastroAction() {
		System.out.println("onMenuItemManutencaoNoCadastroAction");
	}

	@FXML
	public void onMenuItemSairAction() {
		System.out.println("onMenuItemSairAction");
	}

	@FXML
	public void onMenuItemSobreAction() {
		loadView("/gui/Sobre.fxml");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());

		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Erro ao carregar a página", e.getMessage(), AlertType.ERROR);
		}
	}

}
