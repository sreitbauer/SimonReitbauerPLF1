/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plf1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author simon
 */
public class TableModel extends AbstractTableModel {

    private ArrayList<Car> cars;
    private String[] colNames = {"X", "Y", "Rot", "Grün", "Blau"};
    
    TableModel() {
        cars = new ArrayList<>();
    }
    
    @Override
    public int getRowCount() {
        return cars.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return cars.get(rowIndex).getX();
            case 1: return cars.get(rowIndex).getY();
            case 2: return cars.get(rowIndex).getR();
            case 3: return cars.get(rowIndex).getG();
            case 4: return cars.get(rowIndex).getB();
        }
        return "???";
    }
    
    public void addCar(Car c) {
        cars.add(c);
        this.fireTableRowsInserted(cars.size() - 1, cars.size());
    }
    
    public void removeCar(int index) {
        cars.remove(index);
        this.fireTableRowsDeleted(index, index);
    }
    
    public void save() throws FileNotFoundException {
        DAL.save(cars);
    }

    void open() throws FileNotFoundException {
        cars = DAL.open();
    }
    
    ArrayList<Car> getAllCars() {
        return cars;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    
}
