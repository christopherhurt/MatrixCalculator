package main;

@SuppressWarnings("serial")
public class MatrixCalculatorException extends Exception {
	
	public MatrixCalculatorException(){
		super((String)null);
	}
	
	public MatrixCalculatorException(String message){
		super(message);
	}
	
}
