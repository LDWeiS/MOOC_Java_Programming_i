/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class PaymentCard {

    private double openingBalance;

    public PaymentCard(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.openingBalance + " euros";
    }

    public void eatAffordably() {
        if (this.openingBalance >= 2.6) {
            this.openingBalance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (this.openingBalance >= 4.6) {
            this.openingBalance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        if (amount + this.openingBalance >= 150) {
            this.openingBalance = 150;
        } else if (amount >= 0) {
            this.openingBalance += amount;
        }
    }
}
