/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitario.pkgint.pkg2;

import static java.awt.Color.blue;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;


/**
 *
 * @author Asus
 */
public class FXMLTableroController implements Initializable {
    
    @FXML
    private Button btn13;
    @FXML
    private Button btn14;
    @FXML
    private Button btn15;
    @FXML
    private Button btn23;
    @FXML
    private Button btn24;
    @FXML
    private Button btn25;
    @FXML
    private Button btn31;
    @FXML
    private Button btn32;
    @FXML
    private Button btn33;
    @FXML
    private Button btn34;
    @FXML
    private Button btn35;
    @FXML
    private Button btn36;
    @FXML
    private Button btn37;
    @FXML
    private Button btn41;
    @FXML
    private Button btn42;
    @FXML
    private Button btn43;
    @FXML
    private Button btn44;
    @FXML
    private Button btn45;
    @FXML
    private Button btn46;
    @FXML
    private Button btn47;
    @FXML
    private Button btn51;
    @FXML
    private Button btn52;
    @FXML
    private Button btn53;
    @FXML
    private Button btn54;
    @FXML
    private Button btn55;
    @FXML
    private Button btn56;
    @FXML
    private Button btn57;
    @FXML
    private Button btn63;
    @FXML
    private Button btn64;
    @FXML
    private Button btn65;
    @FXML
    private Button btn73;
    @FXML
    private Button btn74;
    @FXML
    private Button btn75;
    @FXML
    private TextArea textoSol;
    @FXML
    private ComboBox selecModo;
    @FXML
    private Button Acción;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selecModo.getItems().addAll("Clásico", "Personalizado");
    }    
    public void click(){
        btn15.setStyle("-fx-background-image: url('file:/C:/Users/Asus/Desktop/Kraken/Solitario2/src/solitario/pkgint/IMG/CFondo.png');");
    }
    
}
