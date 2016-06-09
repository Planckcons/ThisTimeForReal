/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import org.lwjgl.opengl.Display;

/**
 *
 * @author Arttu
 */
public class GameTime {
    
    // time at last frame
    long lastframe;
    
    // frames per second
    int fps;
    // last fps
    long lastfps;
    
    // time in milliseconds
    public long getTime() 
    {
        return System.nanoTime() / 1000000;
    }
    
    public int getDelta() 
    {
        long time = getTime();
        int delta = (int) (time - lastframe);
        lastframe = time;
            
        return delta;
    }
    
    public void updateFPS()
    {
        if(getTime() - lastfps > 1000)
        {
            Display.setTitle("Project name __ FPS: " + fps);
            fps = 0;
            lastfps += 1000;
        }
        fps++;
    }
}
