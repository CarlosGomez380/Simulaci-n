
package edu.eci.cnyt;

public class Simulacion {
    double probability;
    
    public Simulacion(){
        super();
    }
    
    /**
     * Make subtraction of two complex Matrices.
     * 
     * @param matrix1 First matrix to multiplicate.
     * @param matrix2 Second matrix to multiplicate.
     * @return Answer of the multiplication of matrix1 and matrix2.
     */
    public Matrix multiplicationMatrix(Matrix matrix1,Matrix matrix2){
        Matrix answ= new Matrix(matrix1.getRow(),matrix2.getColumn());
        for (int i=0; i<matrix1.getRow(); i++){
            for (int j=0;j<matrix2.getColumn();j++){
		answ.setMatrix(i,j,0);
                double value =0;
                for (int k=0; k< matrix2.getRow();k++){
                    value = matrix1.getMatrix(i,k)* matrix2.getMatrix(k,j) + value;
                }
                answ.setMatrix(i,j,value);
            }
        }
        return answ;
    }
    
    public Matrix matrixRecursive(Matrix matrix1,Matrix matrix2, int clicks){
        if(clicks==1){
            return matrix1;
        }else{
            Matrix matrix3= multiplicationMatrix(matrix1,matrix2);
            return matrixRecursive(matrix3,matrix2,clicks-1);
        }
    }

    public Vector marbles(Matrix matrix, Vector vector, int clicks) throws MatrixException{
        if(matrix.getRow() == vector.getColumn() && clicks>0){
            Vector answ= new Vector(vector.getColumn());
            Matrix matrix1=matrixRecursive(matrix,matrix,clicks);
            for (int i=0; i<matrix1.getRow(); i++){
                double value =0;
                for (int j=0;j<vector.getColumn();j++){
                    value = (int) matrix1.getMatrix(i,j)* vector.getVector(j) + value;
                }
                answ.setVector(i,(int)value );
            }
            return answ;
        }else{
            throw new MatrixException("The matrix abd vector have different dimesions");
        }
    }
    
    public double probabilities(int slit, int target){
        return probability;
    }
    
    public Matrix multislitMatrix(int slits, int targets){
        Matrix matrix=new Matrix(slits+targets,slits+targets);
        for (int i=0; i<slits; i++){
            for (int j=0;j<targets; j++){
                matrix.setMatrix(j,i, probabilities(i,j));
            }
        }
        return matrix;
    }
    
    public Vector bullets(int slits, int targets, Vector vector, int clicks) throws MatrixException{
        Matrix matrix= multislitMatrix(slits,targets);
        if(matrix.getRow() == vector.getColumn()){
            return marbles(matrix,vector,clicks);
        }else{
            throw new MatrixException("The matrix abd vector have different dimesions");
        }
    }
    
    public void setProbability(double probability){
        this.probability=probability;
    }
}
    
    

    

