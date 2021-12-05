/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action.CreateRectTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.samples.svg.figures.SVGRectFigure;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Villy
 */
public class ThenRect extends Stage<ThenRect> {
    
    @ExpectedScenarioState
    SVGRectFigure rect;
    
    
    ThenRect newRectCreated(){
        assertEquals("X values is being compared", rect.getX(), 20, 1);
        assertEquals("Y values is being compared", rect.getY(), 20, 1);
        assertEquals("the width values is being compared", rect.getWidth(), 50, 1);
        assertEquals("the height values is being compared", rect.getHeight(), 50, 1);
        assertTrue("Rectangle figure", rect instanceof SVGRectFigure);
        return this;
    }
}
