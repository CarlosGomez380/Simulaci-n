
package edu.eci.cnyt;

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SimulacionTest {
    
    public SimulacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multiplicationMatrix method, of class Simulacion.
     */
    @Test
    public void testMultiplicationMatrix() {
        Matrix matrix= new Matrix(3,3);
        matrix.setMatrix(0,0,0);
        matrix.setMatrix(0,1,1/6);
        matrix.setMatrix(0,2,5/6);
        matrix.setMatrix(1,0,1/3);
        matrix.setMatrix(1,1,1/2);
        matrix.setMatrix(1,2,1/6);
        matrix.setMatrix(2,0,2/3);
        matrix.setMatrix(2,1,1/3);
        matrix.setMatrix(2,2,0);
        
        Matrix answ= new Matrix(3,3);
        matrix.setMatrix(0,0,11/18);
        matrix.setMatrix(0,1,13/36);
        matrix.setMatrix(0,2,1/36);
        matrix.setMatrix(1,0,5/18);
        matrix.setMatrix(1,1,13/36);
        matrix.setMatrix(1,2,13/36);
        matrix.setMatrix(2,0,1/9);
        matrix.setMatrix(2,1,5/18);
        matrix.setMatrix(2,2,11/18);
        
        Matrix matrix1= Simulacion.multiplicationMatrix(matrix,matrix);
        assertEquals(matrix1,answ);
    }

    /**
     * Test of matrixRecursive method, of class Simulacion.
     */
    @Test
    public void testMatrixRecursive() {
        System.out.println("matrixRecursive");
        Matrix matrix1 = null;
        Matrix matrix2 = null;
        int clicks = 0;
        Simulacion instance = new Simulacion();
        Matrix expResult = null;
        Matrix result = instance.matrixRecursive(matrix1, matrix2, clicks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marbles method, of class Simulacion.
     */
    @Test
    public void testMarbles() throws Exception {
        System.out.println("marbles");
        Matrix matrix = null;
        Vector vector = null;
        int clicks = 0;
        Simulacion instance = new Simulacion();
        Vector expResult = null;
        Vector result = instance.marbles(matrix, vector, clicks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of probabilities method, of class Simulacion.
     */
    @Test
    public void testProbabilities() {
        System.out.println("probabilities");
        int slit = 0;
        int target = 0;
        Simulacion instance = new Simulacion();
        double expResult = 0.0;
        double result = instance.probabilities(slit, target);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multislitMatrix method, of class Simulacion.
     */
    @Test
    public void testMultislitMatrix() {
        System.out.println("multislitMatrix");
        int slits = 0;
        int targets = 0;
        Simulacion instance = new Simulacion();
        Matrix expResult = null;
        Matrix result = instance.multislitMatrix(slits, targets);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bullets method, of class Simulacion.
     */
    @Test
    public void testBullets() throws Exception {
        System.out.println("bullets");
        int slits = 0;
        int targets = 0;
        Vector vector = null;
        int clicks = 0;
        Simulacion instance = new Simulacion();
        Vector expResult = null;
        Vector result = instance.bullets(slits, targets, vector, clicks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProbability method, of class Simulacion.
     */
    @Test
    public void testSetProbability() {
        System.out.println("setProbability");
        double probability = 0.0;
        Simulacion instance = new Simulacion();
        instance.setProbability(probability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
