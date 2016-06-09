/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import org.lwjgl.opengl.GL11;

/**
 *
 * @author Arttu
 */
public class Quad {

    int width, height, pos_x, pos_y;
    float r, g, b;
    
    public Quad(int width, int height, int pos_x, int pos_y, float r, float g, float b) {
    
        this.width = width;
        this.height = height;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public void draw()
    {
        // set color of the quad
        GL11.glColor3f(r, g, b);
        
        // draw quad
        GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex2f(pos_x, pos_y);
            GL11.glVertex2f(pos_x + width, pos_y);
            GL11.glVertex2f(pos_x + width, pos_y + height);
            GL11.glVertex2f(pos_x, pos_y + height);
        GL11.glEnd();
    }
}
