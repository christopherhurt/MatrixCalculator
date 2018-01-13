package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class SingleMatrixBar extends EntryBar {
    
    public SingleMatrixBar(){
        ActionListener listener = new SingleMatrixBarListener();
        
        calculate.addActionListener(listener);
        
        add(matrixSelector, BorderLayout.WEST);
        add(calculate,      BorderLayout.EAST);
    }
    
    private class SingleMatrixBarListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO
        }
        
    }
    
}
