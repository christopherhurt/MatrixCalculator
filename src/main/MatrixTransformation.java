package main;

public class MatrixTransformation {
  
	public static Matrix rotationMatrixX(float theta) {
		float[][] values = new float[4][4];
		
		float cosTheta = (float)Math.cos(Math.toRadians(theta));
		float sinTheta = (float)Math.sin(Math.toRadians(theta));
				
		values[0][0] = 1;
		values[1][1] = cosTheta;
		values[1][2] = -sinTheta;
		values[2][1] = sinTheta;
		values[2][2] = cosTheta;
		values[3][3] = 1;
		
		return new Matrix(values);
	}
	
	public static Matrix rotationMatrixY(float theta) {
		float[][] values = new float[4][4];
		
		float cosTheta = (float)Math.cos(Math.toRadians(theta));
		float sinTheta = (float)Math.sin(Math.toRadians(theta));
		
		values[0][0] = cosTheta;
		values[0][2] = sinTheta;
		values[1][1] = 1;
		values[2][0] = -sinTheta;
		values[2][2] = cosTheta;
		values[3][3] = 1;
		
		return new Matrix(values);
	}
	
	public static Matrix rotationMatrixZ(float theta) {
		float[][] values = new float[4][4];
		
		float cosTheta = (float)Math.cos(Math.toRadians(theta));
		float sinTheta = (float)Math.sin(Math.toRadians(theta));
		
		values[0][0] = cosTheta;
		values[0][1] = -sinTheta;
		values[1][0] = sinTheta;
		values[1][1] = cosTheta;
		values[2][2] = 1;
		values[3][3] = 1;
		
		return new Matrix(values);
	}
	
	public static Matrix translationMatrix(float dX, float dY, float dZ){
		float[][] values = new float[4][4];
		
		values[0][0] = 1;
		values[1][1] = 1;
		values[2][2] = 1;
		values[3][3] = 1;
		
		values[0][3] = dX;
		values[1][3] = dY;
		values[2][3] = dZ;
		
		return new Matrix(values);
	}
	
	public static Matrix scaleMatrix(float scaleX, float scaleY, float scaleZ){
		float[][] values = new float[4][4];
		
		values[0][0] = scaleX;
		values[1][1] = scaleY;
		values[2][2] = scaleZ;
		values[3][3] = 1;
		
		return new Matrix(values);
	}
	
}
