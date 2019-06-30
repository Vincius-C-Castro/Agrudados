/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.agrudados;

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
public class Agrudados_FXMLController implements Initializable {
    
    
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
    private Label resultMedia;
    @FXML
    private Label resultModa;
    @FXML
    private Label resultMediana;
    
            
    @FXML
    private void calculaMedia(ActionEvent event)
    {
        double[] vetor = {Integer.parseInt(celula1.getText()), Integer.parseInt(celula2.getText()), 
                        Integer.parseInt(celula3.getText()), Integer.parseInt(celula4.getText()),
                            Integer.parseInt(celula5.getText()), Integer.parseInt(celula6.getText())};        
        double media = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
        }
        media = media/vetor.length;
        
        resultMedia.setText(Double.toString( media ));       
    }
    
    @FXML
    private void calculaModa(ActionEvent event)
    {
        double[] vet = {Integer.parseInt(celula1.getText()), Integer.parseInt(celula2.getText()), 
                        Integer.parseInt(celula3.getText()), Integer.parseInt(celula4.getText()),
                            Integer.parseInt(celula5.getText()), Integer.parseInt(celula6.getText())};
        
        int[] cont = new int[6];
        int vezes = 0;
        int indice = 0;
        
        for (int i=0; i < 6; i++) {
            for (int j=0;j <6; j++) {
                
                if(vet[i] == vet[j]) {
                    cont[i] = cont[i] + 1;
                }
            }
        }
        
        vezes = cont[0];
        for (int i=0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
            }
        }
        
        resultModa.setText(Double.toString( vet[indice] )); 
        
    }
    
    @FXML
    private void calculaMediana(ActionEvent event)
    {
        double[] vet = {Integer.parseInt(celula1.getText()), Integer.parseInt(celula2.getText()), 
                        Integer.parseInt(celula3.getText()), Integer.parseInt(celula4.getText()),
                            Integer.parseInt(celula5.getText()), Integer.parseInt(celula6.getText())};
                            
        double mediana;
        
        if(vet.length%2 == 0)
        {
            mediana = (vet[vet.length/2] + vet[vet.length/2 -1])/2;
        }
        else
        {
            mediana = vet[vet.length/2 +1];
        }
        resultMediana.setText(Double.toString( mediana ));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
