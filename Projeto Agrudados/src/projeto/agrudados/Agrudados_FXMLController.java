/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.agrudados;

import estatistica.Media;
import estatistica.Moda;
import estatistica.Mediana;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


/**
 *
 * @author viny-
 */
public class Agrudados_FXMLController implements Initializable{
    
    private double valores[] = new double[6];

    @FXML
    private Label resultMedia;
    @FXML
    private Label resultModa;
    @FXML
    private Label resultMediana;
    
    @FXML
    private TextField celula1;
    @FXML
    private TextField celula2;
    @FXML
    private TextField celula3;
    @FXML
    private TextField celula4;
    @FXML
    private TextField celula5;
    @FXML
    private TextField celula6;
            
    @FXML
    private void calculaMedia(ActionEvent event)
    {
              
        Media media = new Media();
        atualizaVetor();
        resultMedia.setText(Double.toString(media.calculaMedia(valores)));   
        
    }
    
    @FXML
    private void calculaModa(ActionEvent event)
    {
 
        Moda moda = new Moda();
        atualizaVetor();
        
        
        int indice = moda.calculaModa(valores);
        
        if(indice == -1)
        {
            
            resultModa.setText("Conjunto Amodal");
            
        }else{
            
            resultModa.setText(Double.toString(valores[indice] ));
            
        }
        
    }
    
    @FXML
    private void calculaMediana(ActionEvent event)
    {
                     
        Mediana mediana = new Mediana();
        atualizaVetor();
        
        resultMediana.setText(Double.toString( mediana.calculaMediana(valores) ));
    }
    
    public void atualizaVetor()
    {
        double vetor[] = {Double.parseDouble(celula1.getText()), Double.parseDouble(celula2.getText()), 
                        Double.parseDouble(celula3.getText()), Double.parseDouble(celula4.getText()),
                            Double.parseDouble(celula5.getText()), Double.parseDouble(celula6.getText())};
        
        this.valores = vetor;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
