package br.com.fuctura.sistemagerenciadordeveiculos.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("onMenuItemSobreAction");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
