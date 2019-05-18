/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caro;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Hieu
 */
public class Cell extends Rectangle {
   public Cell(double width, double height){
        super(width, height, Color.BLUE);
    }
   public Cell(double width, double height, Paint paint){
        super(width, height, paint);
    }
}
