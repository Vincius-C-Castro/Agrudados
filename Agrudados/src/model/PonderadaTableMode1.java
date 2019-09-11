/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willian
 */
public class PonderadaTableMode1  extends AbstractTableModel  {
    
   private List<ElementosPonderada> dados = new ArrayList<>();
   private String[]colunas = {"Variaveis ","Pesos"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
   
   
   
    @Override
    ///quantidade de linha está na tabela
    public int getRowCount() {
        return dados.size();
    }

    @Override
    /// local de quantidade de colunas 
    public int getColumnCount() {
      return colunas.length;
    }

    @Override
    ///  consegue pegar os valores da tabela
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
            case 0:
                   return dados.get(linha).getNumeros();
            case 1:
                   return dados.get(linha).getNotas();
        }
       return null;
       
    }

    @Override
    public void setValueAt(Object Valor, int linha, int coluna) {
        
        switch (coluna){
            case 0:
                    dados.get(linha).setNumeros(Integer.parseInt((String)Valor));
                    break;
            case 1:
                    dados.get(linha).setNotas(Double.parseDouble((String)Valor));
                    break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    
    
    public void addRom(ElementosPonderada p){
    this.dados.add(p);
    this.fireTableDataChanged();
        
    }
    public void removeRow(int linha){
     this.dados.remove(linha);
     this.fireTableRowsDeleted(linha, linha);
    }
    
}
