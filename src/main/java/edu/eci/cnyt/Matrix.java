
package edu.eci.cnyt;


public class Matrix {
    private int row;
    private int column;
    private boolean [][] matrixBool;
    private double [][] matrix;
    
    /*
     * matrix numbers object constructor.
     *
     * @param real row Number of rows.
     * @param imag column Number of columns.
     */
    public Matrix(int row, int column){
        this.row = row;
        this.column = column;
        matrixBool= new boolean[row][column];
        matrix = new double[row][column];
    }
    
    public void matrixBool(){
        for(int i=0;i<row; i++ ){
            for (int j=0; j<column;j++){
                if (matrixBool[i][j]== true){
                    matrix[i][j]=1;
                }else{
                    matrix[i][j]=0;
                }
            }
        }
    }
    
    public void setMatrix(int i, int j, int number){
        matrix[i][j]=number;
    }
    
    public double getMatrix(int i, int j){
        return matrix[i][j];
    }
    
    public int getRow(){
        return row;
    }
    
    public int getColumn(){
        return column;
    }
   
    
}
