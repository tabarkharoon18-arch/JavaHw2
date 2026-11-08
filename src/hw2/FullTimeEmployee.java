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
class FullTimeEmployee extends Employee {
  private double allowance; 

    public FullTimeEmployee(String id, String name, double baseSalary, LocalDate joinDate, double allowance) {
        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;
    }

    @Override
    public double calculateNetSalary() {
        
        return (baseSalary + allowance) - calculateTax();
    }

    @Override
    public double calculateTax() {
        return (baseSalary + allowance) * TAX_RATE;
    }

    @Override
    public double calculateBonus(double performanceScore) {
        if (performanceScore >= 1.0 && performanceScore <= 5.0) {
            
            return (baseSalary * 0.10) * performanceScore;
        }
        return 0.0;
    }  
}
