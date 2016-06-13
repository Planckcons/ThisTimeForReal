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
        Globals globals = new Globals();
        
        gametime.getDelta();
        gametime.lastfps = gametime.getTime();
        
        gamedisplay.create();
        gamedisplay.init();
        
        
        boolean[] input;
        
        while(!Display.isCloseRequested())
        {
            int delta = gametime.getDelta();
            
            boolean[] pollinput = gameinput.pollInput();
            boolean[] buttoninput = {};
            if(pollinput[0])
            {
                buttoninput = gameinput.buttonCheck();
            }
            input = globals.concat(pollinput, buttoninput);
            
            gamedisplay.logic_update(input);
            gamedisplay.display_update(delta);
            gametime.updateFPS();
        }
        
        gamedisplay.destroy();
    }
    
}
