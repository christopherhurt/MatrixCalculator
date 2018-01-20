package main;

import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataSaver {
    
    private static final File SAVE_FILE = new File(System.getProperty("user.dir") + "savedMatrices.matcalc");
    private static final int SAVE_SLOTS = 10;
    
    private Matrix[] savedMatrices;
    
    public DataSaver () {
        savedMatrices = new Matrix[SAVE_SLOTS];
    }
    
    public Dimension[] loadSavedData() throws FileNotFoundException {
        Scanner sc = new Scanner(SAVE_FILE);
        Dimension[] dims = new Dimension[10];
        
        for(int i = 0; i < SAVE_SLOTS; i++){
            String line = sc.nextLine();
            
            if(line.startsWith("0")){
                savedMatrices[i] = null;
                dims[i] = null;
            }else{
                Scanner lineSc = new Scanner(line);
                
                int rows = lineSc.nextInt();
                int columns = lineSc.nextInt();
                float[][] values = new float[rows][columns];
                
                for(int j = 0; j < rows; j++){
                    for(int k = 0; k < columns; k++){
                        values[j][k] = lineSc.nextFloat();
                    }
                }
                
                savedMatrices[i] = new Matrix(values);
                dims[i] = new Dimension(columns, rows);
                
                lineSc.close();
            }
        }
        
        sc.close();
        
        return dims;
    }
    
    public Dimension saveMatrix(MatrixID id, Matrix matrix) throws IOException {
        savedMatrices[id.ordinal()] = matrix;
        serializeAndWriteData();
        return new Dimension(matrix.getWidth(), matrix.getHeight());
    }
    
    public void deleteMatrix(MatrixID id) throws IOException {
        savedMatrices[id.ordinal()] = null;
        serializeAndWriteData();
    }
    
    private void serializeAndWriteData() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(SAVE_FILE));
        
        for(int i = 0; i < SAVE_SLOTS; i++){
            Matrix currMat = savedMatrices[i];
            
            if(currMat == null){
                bw.write(0);
            }else{
                int rows = currMat.getHeight();
                int columns = currMat.getWidth();
                
                bw.write(rows + " ");
                bw.write(columns + " ");
                
                for(int j = 0; j < rows; j++){
                    for(int k = 0; k < columns; k++){
                        bw.write(currMat.getIndividualValue(j, k) + " ");
                    }
                }
            }
            
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
    
    public Matrix getMatrix(MatrixID id) {
        return savedMatrices[id.ordinal()];
    }
    
}
