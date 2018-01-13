package main;

@SuppressWarnings("serial")
public class MatrixCalculatorException extends Exception {
	
	private static final String DEFAULT_MESSAGE = "An exception has occurred within the Matrix Calculator program.";
	
	public MatrixCalculatorException(){
		super(DEFAULT_MESSAGE);
	}
	
	public MatrixCalculatorException(String message){
		super(message);
	}
	
}
