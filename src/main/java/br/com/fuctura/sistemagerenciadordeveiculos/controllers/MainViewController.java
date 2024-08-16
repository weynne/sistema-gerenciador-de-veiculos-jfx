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
import javafx.stage.Stage;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemVeiculoFrenteDeLoja;

	@FXML
	private MenuItem menuItemVeiculoManutencaoNoCadastro;

	@FXML
	private MenuItem menuItemLojaFrenteDeLoja;

	@FXML
	private MenuItem menuItemLojaManutencaoNoCadastro;

	@FXML
	private MenuItem menuItemVendedorFrenteDeLoja;

	@FXML
	private MenuItem menuItemVendedorManutencaoNoCadastro;

	@FXML
	private MenuItem menuItemClienteFrenteDeLoja;

	@FXML
	private MenuItem menuItemClienteManutencaoNoCadastro;

	@FXML
	private MenuItem menuItemVendasFrenteDeLoja;

	@FXML
	private MenuItem menuItemVendasManutencaoNoCadastro;

	@FXML
	private MenuItem menuItemSair;

	@FXML
	private MenuItem menuItemSobre;

	@FXML
	public void onMenuItemVeiculoFrenteDeLojaAction() {
		loadView("/view/VeiculoFrenteDeLojaView.fxml", "Sistema Gerenciador de Veículos - Frente de Loja");
	}

	@FXML
	public void onMenuItemVeiculoManutencaoNoCadastroAction() {
		loadView("/view/VeiculoManutencaoNoCadastroView.fxml", "Sistema Gerenciador de Veículos - Manutenção no Cadastro");
	}

	@FXML
	public void onMenuItemLojaFrenteDeLojaAction() {
		System.out.println("onMenuItemLojaFrenteDeLojaAction");
	}

	@FXML
	public void onMenuItemLojaManutencaoNoCadastroAction() {
		System.out.println("onMenuItemLojaManutencaoNoCadastroAction");
	}

	@FXML
	public void onMenuItemVendedorFrenteDeLojaAction() {
		System.out.println("onMenuItemVendedorFrenteDeLojaAction");
	}

	@FXML
	public void onMenuItemVendedorManutencaoNoCadastroAction() {
		System.out.println("onMenuItemVendedorManutencaoNoCadastroAction");
	}

	@FXML
	public void onMenuItemClienteFrenteDeLojaAction() {
		System.out.println("onMenuItemClienteFrenteDeLojaAction");
	}

	@FXML
	public void onMenuItemClienteManutencaoNoCadastroAction() {
		System.out.println("onMenuItemClienteManutencaoNoCadastroAction");
	}

	@FXML
	public void onMenuItemVendasFrenteDeLojaAction() {
		System.out.println("onMenuItemVendasFrenteDeLojaAction");
	}

	@FXML
	public void onMenuItemVendasManutencaoNoCadastroAction() {
		System.out.println("onMenuItemVendasManutencaoNoCadastroAction");
	}

	@FXML
	public void onMenuItemSairAction() {
		Stage stage = (Stage) Main.getMainScene().getWindow();
		stage.close();
	}

	@FXML
	public void onMenuItemSobreAction() {
		loadView("/view/SobreView.fxml", "Sistema Gerenciador de Veículos - Sobre");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	private synchronized void loadView(String absoluteName, String title) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());

			Stage stage = (Stage) Main.getMainScene().getWindow();
			stage.setTitle(title);

		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Erro ao carregar a página", e.getMessage(), AlertType.ERROR);
		}
	}

}
