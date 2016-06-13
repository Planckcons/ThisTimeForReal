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
public class Globals {
   
    double SolarMass = 1.98892E30;              // kg
    double AstronomicalUnit = 1.495978707E11;   // m
    double GConstant = 6.674E-11;               // nope
    
    public boolean[] concat(boolean[] a, boolean[] b) 
    {
        int aLen = a.length;
        int bLen = b.length;
        boolean[] c= new boolean[aLen+bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
}
