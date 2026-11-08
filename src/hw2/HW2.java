/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author hp-user
 */
public class HW2 {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("E001", "Ahmed Ali", 6000.0, LocalDate.of(2021, 3, 15), 1200.0));
        employees.add(new ContracterEmployee("E002", "Sara Mohamed" , LocalDate.of(2023, 1, 10), 45, 160));
        employees.add(new FullTimeEmployee("E003", "Khaled Omar", 5000.0, LocalDate.of(2019, 7, 20), 1000.0));
        employees.add(new ContracterEmployee("E004", "Fatma Naser", LocalDate.of(2022, 11, 5), 60, 150));

        System.out.println("=== Original Employee List ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

       
        Collections.sort(employees);
        System.out.println("\n=== Sorted by Net Salary (Descending via Comparable) ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

      
        employees.sort(Comparator.comparing(Employee::getJoinDate));
        System.out.println("\n=== Sorted by Join Date / Seniority (Ascending via Comparator) ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

       
        double totalTaxes = 0.0;
        double totalBonuses = 0.0;
        double samplePerformanceScore = 4.5; 

        for (Employee e : employees) {
            totalTaxes += e.calculateTax();     
            totalBonuses += e.calculateBonus(samplePerformanceScore);
        }

        System.out.println("\n=== Financial Summary ===");
        System.out.printf("Total Taxes Collected: %.2f $\n", totalTaxes);
        System.out.printf("Total Bonuses Distributed: %.2f $\n", totalBonuses);
    }
    
    
}
