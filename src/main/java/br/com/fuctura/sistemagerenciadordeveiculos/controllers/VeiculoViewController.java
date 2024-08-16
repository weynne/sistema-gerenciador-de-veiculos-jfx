package br.com.fuctura.sistemagerenciadordeveiculos.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.fuctura.sistemagerenciadordeveiculos.Main;
import br.com.fuctura.sistemagerenciadordeveiculos.entities.Veiculo;
import br.com.fuctura.sistemagerenciadordeveiculos.services.VeiculoService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VeiculoViewController implements Initializable {

	private VeiculoService service;

	@FXML
	private TableView<Veiculo> tableViewVeiculo;

	@FXML
	private TableColumn<Veiculo, Long> tableColumnId;

	@FXML
	private TableColumn<Veiculo, String> tableColumnPlaca;

	@FXML
	private TableColumn<Veiculo, String> tableColumnModelo;

	@FXML
	private TableColumn<Veiculo, Integer> tableColumnAno;

	@FXML
	private TableColumn<Veiculo, Double> tableColumnValor;

	@FXML
	private Button btNovo;

	private ObservableList<Veiculo> obsList;

	@FXML
	public void onBtNovoAction() {
		System.out.println("onBtNovoAction");
	}

	public void setVeiculoService(VeiculoService service) {
		this.service = service;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
		tableColumnModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
		tableColumnAno.setCellValueFactory(new PropertyValueFactory<>("ano"));
		tableColumnValor.setCellValueFactory(new PropertyValueFactory<>("valor"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewVeiculo.prefHeightProperty().bind(stage.heightProperty());
	}

	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("O service está nulo");
		}
		List<Veiculo> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewVeiculo.setItems(obsList);
	}

}
