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
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameDisplay gamedisplay = new GameDisplay();
        GameInput gameinput = new GameInput();
        GameTime gametime = new GameTime();
        GameLogic gamelogic = new GameLogic();
        
        boolean[] logicJobs = new boolean[2];
        
        gametime.getDelta();
        gametime.lastfps = gametime.getTime();
        
        gamedisplay.create();
        gamedisplay.init();
        
        while(!Display.isCloseRequested())
        {
            int delta = gametime.getDelta();
            
            gameinput.pollInput();
            
            
            gamelogic.update(logicJobs);
            
            gamedisplay.update(delta);
            gametime.updateFPS();
        }
        
        gamedisplay.destroy();
    }
    
}
