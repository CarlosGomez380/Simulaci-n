package edu.eci.cnyt;


public class Vector {
    private int column;
    private double [] vector;
    
    /*
     * vector of numbers object constructor.
     
     * @param imag column Number of columns.
     */
    public Vector( int column){
        this.column = column;
        vector = new double [column];
    }
    
    public void setVector(int j, int number){
        vector[j]=number;
    }
    
    public double getVector(int j){
        return vector[j];
    }
    
    public int getColumn(){
        return column;
    }
}
