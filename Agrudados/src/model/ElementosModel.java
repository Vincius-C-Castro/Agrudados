/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Willian
 */
public class ElementosModel extends AbstractTableModel{
    
    private List<elementos> dados = new ArrayList<>();
    private String[] colunas = {"Conjunto X"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override ///quantidade de linha está na tabela
    public int getRowCount() {
        return dados.size();
    }

    @Override  /// local de quantidade de colunas 
    public int getColumnCount() {
        return colunas.length;
    }

    @Override ///  consegue pegar os valores da tabela
    public Object getValueAt(int linha, int coluna) {
     
       switch(coluna){
       
           case 0:
               return dados.get(linha).getNumeros();
       
       } 
        
      return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
       
           case 0:
                dados.get(linha).setNumeros(Double.parseDouble((String)valor));
                break;
       } 
      this.fireTableRowsUpdated(linha, linha);
    }
    
    
    
    public void addrow(elementos e){
    this.dados.add(e);
    this.fireTableDataChanged();
    
    }
    public void removeRow(int linha){
     this.dados.remove(linha);
     this.fireTableRowsDeleted(linha, linha);
    
    }
    public void calculo(){
     
   
        
    }
    
    
}
