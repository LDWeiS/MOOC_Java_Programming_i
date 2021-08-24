/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class Fitbyte {

    private int restingHeartRate;
    private int age;

    public Fitbyte(int age, int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
        this.age = age;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return ((maximumHeartRate() - restingHeartRate) * percentageOfMaximum) + restingHeartRate;
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }

}
