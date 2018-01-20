package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class HelpMenu extends JMenu {
	
	private JMenuItem about;
	
	public HelpMenu(){
		super("Help");
		
		about = new JMenuItem("About");
		
		ActionListener listener = new HelpMenuListener();
		
		about.addActionListener(listener);
		
		add(about);
	}
	
	private class HelpMenuListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
		    
		    if(src.equals(about)) {
		        if(!AboutWindow.isOpen()){
		            new AboutWindow();
		        }
		    }
		    
		    // TODO
		}
		
	}
	
}
