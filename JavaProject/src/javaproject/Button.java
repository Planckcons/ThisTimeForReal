/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import org.lwjgl.input.Mouse;

/**
 *
 * @author ADM
 */
public class Button extends Quad {
    
    public Button(int width, int height, int pos_x, int pos_y, float r, float g, float b) {
        super(width, height, pos_x, pos_y, r, g, b);
    }
    
    public boolean Action()
    {
        if(Mouse.getX() > pos_x && Mouse.getX() < pos_x + width && Mouse.getY() > pos_y && Mouse.getY() < pos_y + height)
        {
            if(Mouse.isButtonDown(0))
            {
                System.out.println("Button pressed!!!");
                return true;
            }
            
        } 
        return false;
    }
    
}
