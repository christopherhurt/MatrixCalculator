package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ScalarMatrixBar extends EntryBar {
    
    private JTextField scalarEntryField;
    
    public ScalarMatrixBar(){
        int scalarEntryFieldSize = 8;
        scalarEntryField = new JTextField(scalarEntryFieldSize);
        
        ActionListener listener = new ScalarMatrixBarListener();
        
        calculate.addActionListener(listener);
        
        add(scalarEntryField,   BorderLayout.WEST);
        add(matrixSelector,     BorderLayout.WEST);
        add(calculate,          BorderLayout.EAST);
    }
    
    private class ScalarMatrixBarListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO
        }
        
    }
    
}
