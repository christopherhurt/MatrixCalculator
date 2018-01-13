package main;

public class MatrixOperations {
    
    public MatrixOperations()
    {
        
    }
    
    public static Matrix addition(Matrix matrix1, Matrix matrix2) throws InvalidMatrixSizeException
    {
        if (matrix1.getLength() == matrix2.getLength() && matrix1.getWidth() == matrix2.getWidth())
        {
            float[][] newM = new float[matrix1.getLength()][matrix1.getWidth()];
            Matrix newMatrix = new Matrix(newM);
            for (int i = 0; i < matrix1.getLength(); i++)
            {
                for (int j = 0; j < matrix1.getWidth(); j++)
                {
                    newMatrix.setIndividualValue(i, j, matrix1.getIndividualValue(i, j) + matrix2.getIndividualValue(i, j));
                }
            }
            return newMatrix;
        }
        else
        {
            throw new InvalidMatrixSizeException("Matrices not the same size");
        }
    }
    
    public static Matrix subtraction(Matrix matrix1, Matrix matrix2) throws InvalidMatrixSizeException
    {
        if (matrix1.getLength() == matrix2.getLength() && matrix1.getWidth() == matrix2.getWidth())
        {
            float[][] newM = new float[matrix1.getLength()][matrix1.getWidth()];
            Matrix newMatrix = new Matrix(newM);
            for (int i = 0; i < matrix1.getLength(); i++)
            {
                for (int j = 0; j < matrix1.getWidth(); j++)
                {
                    newMatrix.setIndividualValue(i, j, matrix1.getIndividualValue(i, j) - matrix2.getIndividualValue(i, j));
                }
            }
            return newMatrix;
        }
        else
        {
            throw new InvalidMatrixSizeException("Matrices not the same size");
        }
    }
    
    public static Matrix multiplication(Matrix matrix1, Matrix matrix2) throws InvalidMatrixSizeException
    {
        if (matrix1.getWidth() == matrix2.getLength())
        {
            float[][] newM = new float[matrix1.getLength()][matrix2.getWidth()];
            Matrix newMatrix = new Matrix(newM);
            for (int i = 0; i < newMatrix.getLength(); i++)
            {
                for (int j = 0; j < newMatrix.getWidth(); j++)
                {
                    float sum = 0;
                    for (int k = 0; k < matrix2.getLength(); k++)
                    {
                        sum = sum + matrix1.getIndividualValue(i,  k) * matrix2.getIndividualValue(k,  j);
                    }
                    newMatrix.setIndividualValue(i, j, sum);
                }
            }
            return newMatrix;
        }
        else
        {
            throw new InvalidMatrixSizeException("Matrices can't be multiplied");
        }
    }
    
    public static Matrix piecewiseMultiplication(Matrix matrix1, Matrix matrix2) throws InvalidMatrixSizeException
    {
        if (matrix1.getLength() == matrix2.getLength() && matrix1.getWidth() == matrix2.getWidth())
        {
            float[][] newM = new float[matrix1.getLength()][matrix1.getWidth()];
            Matrix newMatrix = new Matrix(newM);
            for (int i = 0; i < matrix1.getLength(); i++)
            {
                for (int j = 0; j < matrix1.getWidth(); j++)
                {
                    newMatrix.setIndividualValue(i, j, matrix1.getIndividualValue(i, j) * matrix2.getIndividualValue(i, j));
                }
            }
            return newMatrix;
        }
        else
        {
            throw new InvalidMatrixSizeException("Matrices not the same size");
        }
    }
    
    public static float dotProduct(Matrix matrix1, Matrix matrix2) throws InvalidMatrixSizeException
    {
        if (matrix1.getWidth() == 1 && matrix2.getWidth() == 1 && matrix1.getLength() == matrix2.getLength())
        {
            float sum = 0;
            for (int i = 0; i < matrix1.getLength(); i++)
            {
                sum = sum + matrix1.getIndividualValue(i, 0) * matrix2.getIndividualValue(i, 0);
            }
            return sum;
        }
        else if (matrix1.getLength() != matrix2.getLength())
        {
            throw new InvalidMatrixSizeException("Vectors not the same size");
        }
        else
        {
            throw new InvalidMatrixSizeException("One or both inputs are not vectors");
        }
    }
    
    public static Matrix crossProduct(Matrix matrix1, Matrix matrix2) throws InvalidMatrixSizeException
    {
        if (matrix1.getWidth() == 1 && matrix2.getWidth() == 1 && matrix1.getLength() == 3 && matrix2.getLength() == 3)
        {
            float[][] newM = new float[3][1];
            Matrix newMatrix = new Matrix(newM);
            newMatrix.setIndividualValue(0, 0, matrix1.getIndividualValue(1, 0) * matrix2.getIndividualValue(2, 0) 
                - matrix1.getIndividualValue(2, 0) * matrix2.getIndividualValue(1, 0));
            
            newMatrix.setIndividualValue(1, 0, matrix1.getIndividualValue(2, 0) * matrix2.getIndividualValue(0, 0) 
                - matrix1.getIndividualValue(0, 0) * matrix2.getIndividualValue(2, 0));
            
            newMatrix.setIndividualValue(2, 0, matrix1.getIndividualValue(0, 0) * matrix2.getIndividualValue(1, 0) 
                - matrix1.getIndividualValue(1, 0) * matrix2.getIndividualValue(0, 0));
            return newMatrix;
        }
        else
        {
            throw new InvalidMatrixSizeException("One or both inputs are not 3-dimensional vectors");
        }
    }
    
    public static Matrix projection(Matrix matrix1, Matrix matrix2) throws InvalidMatrixSizeException
    {
        if (matrix1.getWidth() == 1 && matrix2.getWidth() == 1 && matrix1.getLength() == 3 && matrix2.getLength() == 3)
        {
            float scaleFactor = dotProduct(matrix1, matrix2) / MatrixTransformation.norm(matrix2);
            return multiplyByScalar(matrix2, scaleFactor);
        }
        else
        {
            throw new InvalidMatrixSizeException("One or both inputs are not 3-dimensional vectors");
        }
    }
    
    public static Matrix multiplyByScalar(Matrix matrix, float scaleFactor)
    {
        float[][] newM = new float[matrix.getLength()][matrix.getWidth()];
        Matrix newMatrix = new Matrix(newM);
        for (int i = 0; i < matrix.getLength(); i++)
        {
            for (int j = 0; j < matrix.getWidth(); j++)
            {
                newMatrix.setIndividualValue(i, j, matrix.getIndividualValue(i, j) * scaleFactor);
            }
        }
        return newMatrix;
    }

}
