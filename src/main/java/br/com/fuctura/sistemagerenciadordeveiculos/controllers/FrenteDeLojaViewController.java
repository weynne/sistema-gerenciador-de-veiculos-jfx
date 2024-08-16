package br.com.fuctura.sistemagerenciadordeveiculos.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FrenteDeLojaViewController implements Initializable {

	@FXML
	private Button btVeiculo;

	@FXML
	private void onBtVeiculoAction() throws IOException {
		System.out.println("onBtVeiculoAction");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}
}
