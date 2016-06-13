/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import org.lwjgl.input.*;
import org.lwjgl.input.Keyboard;


/**
 *
 * @author Arttu
 */
public class GameInput {
    
    Button test = new Button(30, 30, 140, 140, 1, 1, 1);
    
    Button[] buttons = {test};
    
    public boolean[] buttonCheck()
    {
        boolean[] active = new boolean[buttons.length];
        
        for(int i = 0; i < buttons.length; i++)
        {
            active[i] = buttons[i].Action();
        }
        return active;
    }
    
    public boolean[] pollInput()
    {
        boolean[] input = new boolean[10];
        
        int x = Mouse.getX();
        int y = Mouse.getY();
        
        while (Mouse.next())
        {
            if(Mouse.isButtonDown(0))
            {
                System.out.println("Mouse right down __ X: " + x + " Y: " + y);
                input[0] = true;
            }
        }
        
        while (Keyboard.next())
        {
            if (Keyboard.getEventKeyState()) 
            {
                if(Keyboard.getEventKey() == Keyboard.KEY_A) 
                {
                    System.out.println("A pressed!!!");
                    input[1] = true;
                }
                if(Keyboard.getEventKey() == Keyboard.KEY_DOWN)
                {
                    System.out.println("Down key pressed!!!");
                    input[2] = true;
                }
                if(Keyboard.getEventKey() == Keyboard.KEY_UP)
                {
                    System.out.println("Up key pressed!!!");
                    input[3] = true;
                }
                // more keys
            }
            else 
            {
                if(Keyboard.getEventKey() == Keyboard.KEY_A)
                {
                    System.out.println("A released!!!");
                }
                if(Keyboard.getEventKey() == Keyboard.KEY_DOWN)
                {
                    System.out.println("Down key released!!!");
                }
                if(Keyboard.getEventKey() == Keyboard.KEY_UP)
                {
                    System.out.println("Up key released!!!");
                }
                // more keys
            }
        }
        return input;
    }
}
