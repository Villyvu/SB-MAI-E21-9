/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action.CreateRectTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.jhotdraw.samples.svg.figures.SVGRectFigure;

/**
 *
 * @author Villy
 */
public class WhenRect extends Stage<WhenRect> {
    
   @ExpectedScenarioState
   SVGRectFigure rect;
   
   @ProvidedScenarioState
   double x = 20;
   
   @ProvidedScenarioState
   double y = 20;
           
   @ProvidedScenarioState
   double width = 50;
           
   @ProvidedScenarioState
   double height = 50;

    
   @BeforeStage
   public void before(){
    rect = new SVGRectFigure(x,y,width,height);
   }
   
   WhenRect rectCreated(){
       return this;
   }
}
