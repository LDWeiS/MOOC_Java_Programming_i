/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Woi
 */
public class TeamData {
    
    private String nHome;
    private String nVisit;
    private int pHome;
    private int pVisit;
    
    public TeamData(String home, String visit, int pHome, int pVisit) {
        this.nHome = home;
        this.nVisit = visit;
        this.pHome = pHome;
        this.pVisit = pVisit;
    }
    
    public String getNHome(){
        return this.nHome;
    }
    
    public String getNVisit(){
        return this.nVisit;
    }
    
    public int getPHome(){
        return this.pHome;
    }
    
    public int getPVisit(){
        return this.pVisit;
    }

}
