/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class Debt {
    
    private double debt;
    private double interest;
    
    public Debt(double initialBalance, double initialInterestRate){
        this.debt = initialBalance;
        this.interest = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println(this.debt);
    }
    
    public void waitOneYear(){
        this.debt = this.debt * this.interest;
    }
    
}
