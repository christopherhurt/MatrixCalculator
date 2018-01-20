package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CreateMatrixSizeWindow extends JFrame {
    
    private JPanel block1;
    private JPanel block2;
    private JPanel block3;
    private JPanel block4;
    
    private JLabel header;
    private JLabel rowsPrompt;
    private JLabel columnsPrompt;
    
    private JTextField rowsEntry;
    private JTextField columnsEntry;
    
    private JButton createButton;
    
    public CreateMatrixSizeWindow(String id) {
        block1 = new JPanel();
        block2 = new JPanel();
        block3 = new JPanel();
        block4 = new JPanel();
        
        header = new JLabel("Enter number of rows and columns for matrix " + id);
        block1.add(header);
        
        rowsPrompt = new JLabel("Rows:    ");
        rowsEntry = new JTextField(100);
        block2.add(rowsPrompt);
        block2.add(rowsEntry);
        
        columnsPrompt = new JLabel("Columns: ");
        columnsEntry = new JTextField(100);
        block3.add(columnsPrompt);
        block3.add(columnsEntry);
        
        createButton = new JButton("Create");
        createButton.addActionListener(new CreateMatrixSizeWindowListener());
        block4.add(createButton);
        
        setLayout(new GridLayout(4, 1));
        add(block1);
        add(block2);
        add(block3);
        add(block4);
        
        setSize(200, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private class CreateMatrixSizeWindowListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO
        }
        
    }
    
}
