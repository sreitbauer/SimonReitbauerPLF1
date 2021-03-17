/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plf1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author simon
 */
public class Canvas extends JPanel {   
    
    Color col;
    
    public void setColor(Color c) {
        col = c;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(0, 0, 255));
        
        int temp_x = 150, temp_y = 150;
        
        //Car body
        Rectangle2D.Float carBody = new Rectangle2D.Float(temp_x, temp_y + 20, 80, 20);
        
        //Car Head
        Ellipse2D.Float carHead = new Ellipse2D.Float(temp_x + 30, temp_y, 20, 20);
        
        //Car
        Ellipse2D.Float left = new Ellipse2D.Float(temp_x + 10, temp_y + 40, 20, 20);
        Ellipse2D.Float right = new Ellipse2D.Float(temp_x + 50, temp_y + 40, 20, 20);
        
        g2d.fill(carBody);
        g2d.fill(carHead);
        g2d.fill(left);
        g2d.fill(right);
    }
    
}
