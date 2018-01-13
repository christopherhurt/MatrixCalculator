package main;

public class Matrix {
    
    private float[][] matrix;
    
    public Matrix(float[][] newMatrix)
    {
        matrix = newMatrix;
    }
    
    public int getLength()
    {
        return matrix.length;
    }
    
    public int getWidth()
    {
        return matrix[0].length;
    }
    
    public void setValues(float[][] newMatrix)
    {
        matrix = newMatrix;
    }
    
    public float[][] getValues()
    {
        return copyValues(matrix);
    }
    
    public void setIndividualValue(int y, int x, float value)
    {
        matrix[y][x] = value;
    }
    
    public float getIndividualValue(int y, int x)
    {
        return matrix[y][x];
    }
    
    private float[][] copyValues(float[][] matrix)
    {
        float[][] newMatrix = new float[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        return newMatrix;
    }


}
