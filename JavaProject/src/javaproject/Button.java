/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import org.lwjgl.input.Mouse;

/**
 *
 * @author Arttu
 */
public class Button {

    int width, height, pos_x, pos_y;

    public Button(int width, int height, int pos_x, int pos_y) {
    
        this.width = width;
        this.height = height;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }
    
    public boolean Action()
    {
        if(Mouse.getX() > pos_x && Mouse.getX() < pos_x + width && Mouse.getY() > pos_y && Mouse.getY() < pos_y + height)
        {
            if(Mouse.isButtonDown(0))
            {
                return true;
            }
        } 
        return false;
    }
    
}
