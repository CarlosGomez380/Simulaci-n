
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
    
    public void setMatrix(int i, int j, double number){
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
   
    
    @Override
    public String toString() {
        String str = "";
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                str = Double.toString(matrix[row][column]) + str;
                if (column == matrix[row].length - 1) {
                    str = str + "\n";
                } else {
                    str = str + " , ";
                }
            }
        }
        return str;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Matrix) {
            if(((Matrix) o).getColumn()!=getColumn() || ((Matrix) o).getRow()!=getRow()){
                return false;
            }
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    Double a; 
                    a = ((Matrix)o).getMatrix(row, column);
                    Double b;
                    b=matrix[row][column];
                    if (!b.equals(a)){
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
}
