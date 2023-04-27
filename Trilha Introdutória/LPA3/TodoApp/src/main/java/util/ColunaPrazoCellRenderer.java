package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import model.Tarefa;

public class ColunaPrazoCellRenderer extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, 
                value, isSelected, hasFocus, row, column);
        
        label.setHorizontalAlignment(CENTER);
        
        TarefaTableModel tarefaModel = (TarefaTableModel) table.getModel();
        Tarefa tarefa = tarefaModel.getTarefas().get(row);
        
        if(tarefa.getPrazo().after(new Date())){
            label.setBackground(Color.GREEN);
        }else{
            label.setBackground(Color.RED);    
        }   
        return label;
    }
}
