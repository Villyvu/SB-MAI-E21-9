/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action.CreateRectTest;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Villy
 */
public class CreateRectangleTest extends ScenarioTest<GivenRect, WhenRect, ThenRect> {
    
    @Test
    public void creatRectTest(){
        given().empty();
        
        when().rectCreated();
        
        then().newRectCreated();
               
    }

}
