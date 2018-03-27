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
import java.util.ArrayList;
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
    
    private Button[][] btns = new Button [8][8];
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
        btns[1][3] = btn13; btns[1][4] = btn14; btns[1][5] = btn15; btns[2][3] = btn23; btns[2][4] = btn24;
        btns[2][5] = btn25; btns[3][1] = btn31; btns[3][2] = btn32; btns[3][3] = btn33; btns[3][4] = btn34; 
        btns[3][5] = btn35; btns[3][6] = btn36; btns[3][7] = btn37; btns[4][1] = btn41; btns[4][2] = btn42; 
        btns[4][3] = btn43; btns[4][4] = btn44; btns[4][5] = btn45; btns[4][6] = btn46; btns[4][7] = btn47; 
        btns[5][1] = btn51; btns[5][2] = btn52; btns[5][3] = btn53; btns[5][4] = btn54; btns[5][5] = btn55; 
        btns[5][6] = btn56; btns[5][7] = btn57; btns[6][3] = btn63; btns[6][4] = btn64; btns[6][5] = btn65; 
        btns[7][3] = btn73; btns[7][4] = btn74; btns[7][5] = btn75;
        
        
        
    }
    public void selec(){
        String x="Clásico";
        if(selecModo.getValue().toString().equals(x)){
            for(int i=1;i<=7;i++){
                for(int j=1;j<=7;j++){
                    if((i<3 && j<3) || (i<3 && j>5) || (i>5 && j<3) || (i>5 && j>5)){
                        btns[i][j]=null;
                    }else{
                        btns[i][j].setStyle("-fx-background-image: url('file:src/solitario/pkgint/IMG/CFondo.png')");
                    }
                }
            }
            btns[4][4].setStyle("-fx-background-image: url('file:src/solitario/pkgint/IMG/SFondo.png')");
            //btns[4][4]=null;
        }else{
            for(int i=1;i<=7;i++){
                for(int j=1;j<=7;j++){
                    if((i<3 && j<3) || (i<3 && j>5) || (i>5 && j<3) || (i>5 && j>5)){
                        btns[i][j]=null;
                    }else{
                        btns[i][j].setStyle("-fx-background-image: url('file:src/solitario/pkgint/IMG/SFondo.png')");
                    }
                }
            }
        }
    }
    public void click(){
        /*String x="Clásico";
        if(selecModo.getValue().toString().equals(x)){//Se activa con la opción de juego Clásica
            System.out.println("Sisas, si da");
        }else{//Debe tener el código para la solución en personalizado
            System.out.println("Sisas");
            Acción.setOnAction(this::intento);//ésto es una prueba para ver si puedo cambiar la acción que cumple este boton para una idea que tengo, no mover! -_-
        }
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if((i<3 && j<3) || (i<3 && j>5) || (i>5 && j<3) || (i>5 && j>5)){
                    btns[i][j]=null;
                }else{
                    btns[i][j].setStyle("-fx-background-image: url('file:/C:/Users/Asus/Desktop/Kraken/Solitario2/src/solitario/pkgint/IMG/SFondo.png');");
                }
            }
        }*/
    }
    public void intento(ActionEvent event){
        System.out.println("Que sisas mi pez");
    }
    
}
