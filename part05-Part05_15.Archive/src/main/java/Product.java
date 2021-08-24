/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class Product {

    private String iD;
    private String name;

    public Product(String iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    public String getID() {
        return this.iD;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Product compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Product)) {
            return false;
        }

        Product comparedItem = (Product) compared;

        return this.iD.equals(comparedItem.getID());
    }

    public String toString() {
        return this.iD + ": " + this.name;
    }

}
