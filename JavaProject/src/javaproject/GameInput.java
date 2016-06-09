/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import org.lwjgl.input.*;
import org.lwjgl.input.Keyboard;

import java.awt.event.KeyEvent;

/**
 *
 * @author Arttu
 */
public class GameInput {
     
    public boolean[] buttonCheck(Button[] buttons)
    {
        boolean[] active = new boolean[buttons.length];
        
        for(int i = 0; i < buttons.length; i++)
        {
            active[i] = buttons[i].Action();
        }
        return active;
    }
    
    public void pollInput()
    {
        int x = Mouse.getX();
        int y = Mouse.getY();
        
        if(Mouse.isButtonDown(0))
        {
            System.out.println("Mouse down __ X: " + x + " Y: " + y);
        }
        
        while (Keyboard.next())
        {
            if (Keyboard.getEventKeyState()) 
            {
                if(Keyboard.getEventKey() == Keyboard.KEY_A) 
                {
                    System.out.println("A pressed!!!");
                }
                // more keys
            }
            else 
            {
                if(Keyboard.getEventKey() == Keyboard.KEY_A)
                {
                    System.out.println("A released!!!");
                }
                // more keys
            }
        }
        
    }
}
