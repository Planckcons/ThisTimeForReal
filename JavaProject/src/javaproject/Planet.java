/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author ADM
 */
public class Planet {

    Globals globals = new Globals();
    double mass;            // Solar mass
    double pos_x, pos_y, vx, vy;    // Astronomical unit
    
    public Planet(double mass, double pos_x, double pos_y) 
    {
        this.mass = mass;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }
    
    public void pos_change(double time_interval, Planet[] system)
    {
        double fx = 0, fy = 0;
        for(int i = 0; i < system.length; i++)
        {
            fx += globals.GConstant * (1);
        }
        double dx = vx * time_interval;
        double dy = vy * time_interval;
        
        pos_x += dx;
        pos_y += dy;
    }
    
}
