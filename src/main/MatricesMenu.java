package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MatricesMenu extends JMenu {
	
	private static final String EMPTY_TEXT = "Empty";
	
	private JMenu newMenu;
	private JMenu editMenu;
	
	private JMenuItem newA;
	private JMenuItem newB;
	private JMenuItem newC;
	private JMenuItem newD;
	private JMenuItem newE;
	private JMenuItem newF;
	private JMenuItem newG;
	private JMenuItem newH;
	private JMenuItem newI;
	private JMenuItem newJ;
	
	private JMenuItem editA;
	private JMenuItem editB;
	private JMenuItem editC;
	private JMenuItem editD;
	private JMenuItem editE;
	private JMenuItem editF;
	private JMenuItem editG;
	private JMenuItem editH;
	private JMenuItem editI;
	private JMenuItem editJ;
	
	public MatricesMenu(){
		newA = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		newB = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/B.png"));
		newC = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/C.png"));
		newD = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		newE = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		newF = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		newG = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		newH = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		newI = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		newJ = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		
		editA = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		editB = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/B.png"));
		editC = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/C.png"));
		editD = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		editE = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		editF = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		editG = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		editH = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		editI = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		editJ = new JMenuItem(EMPTY_TEXT, new ImageIcon("res/A.png"));
		
		ActionListener listener = new MatricesMenuListener();
		
		newA.addActionListener(listener);
		newB.addActionListener(listener);
		newC.addActionListener(listener);
		newD.addActionListener(listener);
		newE.addActionListener(listener);
		newF.addActionListener(listener);
		newG.addActionListener(listener);
		newH.addActionListener(listener);
		newI.addActionListener(listener);
		newJ.addActionListener(listener);
		
		editA.addActionListener(listener);
		editB.addActionListener(listener);
		editC.addActionListener(listener);
		editD.addActionListener(listener);
		editE.addActionListener(listener);
		editF.addActionListener(listener);
		editG.addActionListener(listener);
		editH.addActionListener(listener);
		editI.addActionListener(listener);
		editJ.addActionListener(listener);
		
		newMenu.add(newA);
		newMenu.add(newB);
		newMenu.add(newC);
		newMenu.add(newD);
		newMenu.add(newE);
		newMenu.add(newF);
		newMenu.add(newG);
		newMenu.add(newH);
		newMenu.add(newI);
		newMenu.add(newJ);
		
		editMenu.add(editA);
		editMenu.add(editB);
		editMenu.add(editC);
		editMenu.add(editD);
		editMenu.add(editE);
		editMenu.add(editF);
		editMenu.add(editG);
		editMenu.add(editH);
		editMenu.add(editI);
		editMenu.add(editJ);
	}
	
	private class MatricesMenuListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e){
			// TODO
		}
		
	}
	
}
