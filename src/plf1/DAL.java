/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plf1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author simon
 */
public class DAL {
    static public void save(ArrayList<Car> cars) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("data.txt");
        pw.println("# List of all Cars");
        pw.println("# Version 1.0");
        pw.println("# 16/03/2021");
        pw.println("# x, y, red, green, blue");
                
        for(Car car : cars) {
            pw.println(car.getX());
            pw.println(car.getY());
            pw.println(car.getR());
            pw.println(car.getG());
            pw.println(car.getB());
        }
        pw.close();
    }

    static public ArrayList<Car> open() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        
        ArrayList<Car> cars = new ArrayList<>();
        String[] carValues = br.lines().toArray(String[]::new);
        
        return null; //return cars;
    }
}
