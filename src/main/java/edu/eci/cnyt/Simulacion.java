
package edu.eci.cnyt;

public class Simulacion {
    
    public Vector marbles(Matrix matrix, Vector vector, int clicks){
        if(matrix.getRow() == vector.getColumn()){
            Vector answ= new Vector(vector.getColumn());
            for (int i=0; i<matrix.getRow(); i++){
                double value =0;
            
                for (int j=0;j<vector.getColumn();j++){
		    
                    value = (int) matrix.getMatrix(i,j)* vector.getVector(j) + value;
                }
                answ.setVector(i,(int)value );
            }
        return marbles(matrix,answ,clicks-1);
        }else {
            return vector;
        }
    }
    
}
