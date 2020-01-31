package Ocjene.Controller;

import Ocjene.Model.Baza;
import Ocjene.Model.OcjeneModel;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    @FXML
    TableView OcjeneTab;
    @FXML
    TableColumn DatumCol;
    @FXML
    TableColumn ProfesorCol;
    @FXML
    TableColumn PredmetCol;
    @FXML
    TableColumn OcjenaCol;
    public void initialize(URL url, ResourceBundle rb ){
        ObservableList<OcjeneModel> data = OcjeneModel.listaOcjena();
        DatumCol.setCellValueFactory(new PropertyValueFactory<OcjeneModel, String>("Datum"));
        ProfesorCol.setCellValueFactory(new PropertyValueFactory<OcjeneModel, String>("Profesor"));
        PredmetCol.setCellValueFactory(new PropertyValueFactory<OcjeneModel, String>("Predmet"));
        OcjenaCol.setCellValueFactory(new PropertyValueFactory<OcjeneModel, String>("Ocjena"));
        OcjeneTab.setItems(data);
    }


}
