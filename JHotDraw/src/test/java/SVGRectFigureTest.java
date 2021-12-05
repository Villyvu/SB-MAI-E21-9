/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.jhotdraw.samples.svg.figures.SVGRectFigure;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Villy
 */
public class SVGRectFigureTest {
    
    public SVGRectFigureTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCloning(){
         System.out.println("Testing cloning");
         SVGRectFigure original = new SVGRectFigure(50,50,50,100);
         SVGRectFigure clone = original.clone();
         
         System.out.println("Comparing all the values");
         System.out.println(original.getX());
         System.out.println(clone.getX());
         assertEquals("Comparing x values", clone.getX(), original.getX(), 1);
         assertEquals("Comparing y values", clone.getY(), original.getY(), 1);
         assertEquals("Comparing Width values", clone.getWidth(), original.getWidth(), 1);
         assertEquals("Comparing Height values", clone.getHeight(), original.getHeight(), 1);
     } 
}
