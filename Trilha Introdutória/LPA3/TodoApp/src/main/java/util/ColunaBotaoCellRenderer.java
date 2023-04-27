package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

public class ColunaBotaoCellRenderer extends DefaultTableCellRenderer{

    private String tipoBotao;

    public ColunaBotaoCellRenderer(String tipoBotao) {
        this.tipoBotao = tipoBotao;
    }
    
    public String getTipoBotao() {
        return tipoBotao;
    }

    public void setTipoBotao(String tipoBotao) {
        this.tipoBotao = tipoBotao;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, 
                value, isSelected, hasFocus, row, column); 
        label.setHorizontalAlignment(CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/" + tipoBotao + ".png")));
        
        return label;
    }
}
