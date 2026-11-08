/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.time.LocalDate;

/**
 *
 * @author hp-user
 */
public class ContracterEmployee extends Employee { 
    private int hourlyRate ;
    private int hoursWorked;
    public ContracterEmployee(String id, String name, LocalDate joinDate, int hourlyRate, int hoursWorked) {
        super(id, name,hourlyRate*hoursWorked , joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
      @Override
    public double calculateNetSalary() {
        return baseSalary - calculateTax();
    }

    @Override
    public double calculateTax() {
        return baseSalary * TAX_RATE;
    }

    @Override
    public double calculateBonus(double performanceScore) {
        if (performanceScore > 4.0) {
            return 500.0;
        }
        return 0.0;
    }
    
   
    
}
