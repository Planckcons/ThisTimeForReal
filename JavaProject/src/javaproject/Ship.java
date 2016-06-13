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
public class Ship extends Planet {
    
    public Ship(double mass, double pos_x, double pos_y) 
    {
        super(mass, pos_x, pos_y);
    }
    
    public void mass_change(double dm)
    {
        mass += dm;
    }
}
