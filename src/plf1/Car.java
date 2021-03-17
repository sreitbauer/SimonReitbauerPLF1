/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plf1;

/**
 *
 * @author simon
 */
public class Car {
    private int m_x, m_y; //Positionen im Koordinatensystem
    private int m_r, m_g, m_b; //rot, grün, blau

    Car(int x, int y, int red, int green, int blue) {
        m_x = x;
        m_y = y;
        m_r = red;
        m_g = green;
        m_b = blue;
    }

    public int getX() { return m_x; }

    public int getY() { return m_y; }

    public int getR() { return m_r; }

    public int getG() { return m_g; }

    public int getB() { return m_b; }
    
    
}
