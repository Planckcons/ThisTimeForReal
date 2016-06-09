/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;


import java.io.IOException;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;
import org.newdawn.slick.Color;

/**
 *
 * @author Arttu
 */
public class GameDisplay {
    
    int width = 900;
    int height = 600;
    
    public void create()
    {
        try {
        Display.setDisplayMode(new DisplayMode(width, height));
        Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }    
    }
    
    public void init()
    {
        // init OpenGL here
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, 900, 0, 600, 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
    }
    
    public void update(int delta)
    {
        // render here
        
        // Clear the screen and depth buffer
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        
        Quad quad = new Quad(5, 5, 100, 100, 1, 0.9f, 0.9f);
        quad.draw();

        System.out.println(delta);
        
        Display.update();
        Display.sync(60); // max fps to 60
    }
    
    public void destroy()
    {
        Display.destroy();
    }
    
}
