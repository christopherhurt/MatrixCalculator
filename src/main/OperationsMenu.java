package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class OperationsMenu extends JMenu {
	
	private JMenu 		singleMatrixMenu;
	private JMenu		multipleMatricesMenu;
	private JMenu 		vectorsMenu;
	private JMenuItem 	transformation;
	
	private JMenuItem determinant;
	private JMenuItem inverse;
	private JMenuItem luFactorization;
	private JMenuItem diagonalization;
	private JMenuItem ref;
	private JMenuItem rref;
	private JMenuItem scalarMultiplication;
	private JMenuItem eigenvalues;
	private JMenuItem transpose;
	private JMenuItem vectorSpaces;
	private JMenuItem standardBasis;
	
	private JMenuItem add;
	private JMenuItem subtract;
	private JMenuItem multiply;
	
	private JMenuItem crossProduct;
	private JMenuItem dotProduct;
	private JMenuItem piecewiseMultiplication;
	
	public OperationsMenu(){
		super("Operations");
		
		transformation = new JMenuItem("Transformation");
		
		determinant = 			new JMenuItem("Determinant");
		inverse = 				new JMenuItem("Inverse");
		luFactorization = 		new JMenuItem("LU Factorization");
		diagonalization = 		new JMenuItem("Diagonalization");
		ref = 					new JMenuItem("REF");
		rref = 					new JMenuItem("RREF");
		scalarMultiplication = 	new JMenuItem("Scalar Multiplication");
		eigenvalues = 			new JMenuItem("Eigenvalues/Eigenvectors");
		transpose = 			new JMenuItem("Transpose");
		vectorSpaces = 			new JMenuItem("Null, Column, Row Spaces");
		standardBasis = 		new JMenuItem("Standard Basis");
		
		add = 		new JMenuItem("Add");
		subtract = 	new JMenuItem("Subtract");
		multiply = 	new JMenuItem("Multiply");
		
		crossProduct = 				new JMenuItem("Cross Product");
		dotProduct = 				new JMenuItem("Dot Product");
		piecewiseMultiplication = 	new JMenuItem("Piecewise Multiplication");
		
		ActionListener listener = new OperationsMenuListener();
		
		transformation.addActionListener(listener);
		
		determinant.addActionListener(listener);
		inverse.addActionListener(listener);
		luFactorization.addActionListener(listener);
		diagonalization.addActionListener(listener);
		ref.addActionListener(listener);
		rref.addActionListener(listener);
		scalarMultiplication.addActionListener(listener);
		eigenvalues.addActionListener(listener);
		transpose.addActionListener(listener);
		vectorSpaces.addActionListener(listener);
		standardBasis.addActionListener(listener);
		
		add.addActionListener(listener);
		subtract.addActionListener(listener);
		multiply.addActionListener(listener);
		
		crossProduct.addActionListener(listener);
		dotProduct.addActionListener(listener);
		piecewiseMultiplication.addActionListener(listener);
		
		singleMatrixMenu = 		new JMenu("Single Matrix");
		multipleMatricesMenu = 	new JMenu("Multiple Matrices");
		vectorsMenu = 			new JMenu("Vectors");
		
		singleMatrixMenu.add(determinant);
		singleMatrixMenu.add(inverse);
		singleMatrixMenu.add(luFactorization);
		singleMatrixMenu.add(diagonalization);
		singleMatrixMenu.add(ref);
		singleMatrixMenu.add(rref);
		singleMatrixMenu.add(scalarMultiplication);
		singleMatrixMenu.add(eigenvalues);
		singleMatrixMenu.add(transpose);
		singleMatrixMenu.add(vectorSpaces);
		singleMatrixMenu.add(standardBasis);
		
		multipleMatricesMenu.add(add);
		multipleMatricesMenu.add(subtract);
		multipleMatricesMenu.add(multiply);
		
		vectorsMenu.add(crossProduct);
		vectorsMenu.add(dotProduct);
		vectorsMenu.add(piecewiseMultiplication);
		
		add(singleMatrixMenu);
		add(multipleMatricesMenu);
		add(vectorsMenu);
		add(transformation);
	}
	
	private class OperationsMenuListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO
		}
		
	}
	
}
