package main;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public abstract class EntryBar extends JPanel {
    
    protected JComboBox<String> matrixSelector;
    protected JButton calculate;
    
    public EntryBar(){
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 10, 10, 10));
        
        matrixSelector = initMatrixSelector();
        calculate = new JButton("Calculate");
    }
    
    protected JComboBox<String> initMatrixSelector(){
        return new JComboBox<>(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"});
    }
    
}
