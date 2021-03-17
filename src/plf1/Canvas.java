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
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author simon
 */
public class Canvas extends JPanel {   
    
    ArrayList<Car> cars;
    
    public void setCars(ArrayList<Car> c) {
        cars = c;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        if(cars.size() > -1) {
           for(Car car : cars) {
            g2d.setColor(new Color(car.getR(),car.getG(), car.getB()));
            Rectangle2D.Float carBody = new Rectangle2D.Float(car.getX(), car.getY() + 20, 80, 20);
        
            //Car Head
            Ellipse2D.Float carHead = new Ellipse2D.Float(car.getX() + 30, car.getY(), 20, 20);
        
            //Car
            Ellipse2D.Float left = new Ellipse2D.Float(car.getX() + 10, car.getY() + 40, 20, 20);
            Ellipse2D.Float right = new Ellipse2D.Float(car.getX() + 50, car.getY() + 40, 20, 20);
        
            g2d.fill(carBody);
            g2d.fill(carHead);
            g2d.fill(left);
            g2d.fill(right);
            } 
        }  
    }
}
