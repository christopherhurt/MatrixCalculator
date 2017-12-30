package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class DoubleMatrixBar extends EntryBar {
    
    private JComboBox<String> secondMatrixSelector;
    
    public DoubleMatrixBar(){
        secondMatrixSelector = initMatrixSelector();
        
        ActionListener listener = new DoubleMatrixBarListener();
        
        calculate.addActionListener(listener);
        
        add(matrixSelector, BorderLayout.WEST);
        add(secondMatrixSelector, BorderLayout.WEST);
        add(calculate, BorderLayout.EAST);
    }
    
    private class DoubleMatrixBarListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO
        }
        
    }
    
}
