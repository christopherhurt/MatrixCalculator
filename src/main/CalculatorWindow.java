package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CalculatorWindow extends JFrame {
    
    private JMenuBar menuBar;
    private JPanel displayPanel;
    private EntryBar entryBar;
    
    private JMenu matricesMenu;
    private JMenu operationsMenu;
    private JMenu helpMenu;
    
    public CalculatorWindow(){
        super("Matrix Calculator");
        setSize(1200, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        matricesMenu =      new MatricesMenu();
        operationsMenu =    new OperationsMenu();
        helpMenu =          new HelpMenu();
        
        menuBar = new JMenuBar();
        
        menuBar.add(matricesMenu);
        menuBar.add(operationsMenu);
        menuBar.add(helpMenu);
        
        displayPanel =  new DisplayPanel();
        entryBar =      new SingleMatrixBar();
        
        add(menuBar,        BorderLayout.NORTH);
        add(displayPanel,   BorderLayout.CENTER);
        add(entryBar,       BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
