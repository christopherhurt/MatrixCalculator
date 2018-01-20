package main;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class AboutWindow extends JFrame {
    
    private static final String ABOUT_TEXT = "<html><body><center><h1>ABOUT</h1>" +
                                             "This program was written by Chris Hurt and Jarod Raedels using Java. " +
                                             "Visit <a href=\"www.chrishurt.us\">www.chrishurt.us</a> for more information.</center></body></html>";
    
    private static boolean isOpen = false;
    
    private JLabel aboutText;
    
    public AboutWindow() {
        aboutText = new JLabel(ABOUT_TEXT);
        
        setLayout(new BorderLayout());
        add(aboutText, BorderLayout.CENTER);
        
        addWindowListener(new AboutWindowListener());
        
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        isOpen = true;
    }
    
    public static boolean isOpen() {
        return isOpen;
    }
    
    private class AboutWindowListener extends WindowAdapter {
        
        @Override
        public void windowClosing(WindowEvent e) {
            isOpen = false;
        }
        
    }
    
}
