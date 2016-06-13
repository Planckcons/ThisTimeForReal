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
    
    Globals globals = new Globals();
    
    GameInput gameinput = new GameInput();
    boolean running = false;
    
    
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
    
    public void logic_update(boolean[] jobs)
    {
        if(jobs[0])
        {
            if(running)
                running = false;
            else
                running = true;
        }
        
        if(jobs[1])
        {
            
        }
        // and so on
    }
    
    public void display_update(int delta)
    {
        // render here
        // Clear the screen and depth buffer
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        
        Quad quad = new Quad(30, 30, 100, 100, 1, 1, 1);
        quad.draw();
        
        for(Button butt : gameinput.buttons)
        {
            butt.draw();
        }
        
        if(running)
            two_body();
        
        Display.update();
        Display.sync(60); // max fps to 60
    }
    
    public void destroy()
    {
        Display.destroy();
    }
    
    public void two_body()
    {
        Planet earth = new Planet(globals.SolarMass * 3E-6, 0, 0);
        Planet moon = new Planet(globals.SolarMass * 3.7E-8, 0, globals.AstronomicalUnit * 0.002653);
        
        Planet[] system = {earth, moon};
    }
    
}
