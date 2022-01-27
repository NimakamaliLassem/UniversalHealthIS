/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service_types;

import java.util.Scanner;

/**
 *
 * @author Davut Atajanov
 */
public class SpaAndSauna extends Services{
    
    private String preference;
    
    public SpaAndSauna(int daysAttending, String timeDuringDay, String serviceLevel, String preference){
        super(daysAttending, timeDuringDay, serviceLevel);
        //getInput();
        this.preference = preference;
    }
    /*public void getInput(){
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your preference (Relax/Massage/Beauty) : ");
        preference = sc.next();
    }*/
    
    
    @Override
    void calcCost() {
        double Total = 0;
        if(super.timeDuringDay.equalsIgnoreCase("morning"))
            Total+=350;
        else if(super.timeDuringDay.equalsIgnoreCase("afternoon"))
            Total+=400;
        else
            Total+=500;
        
        if(preference.equalsIgnoreCase("massage"))
            Total+=150;
        else if(preference.equalsIgnoreCase("beauty"))
            Total+=250;
        
        if(super.serviceLevel.equalsIgnoreCase("luxury"))
            Total *= 1.5;
        else if(super.serviceLevel.equalsIgnoreCase("grand"))
            Total *= 2;
        
        super.setCost(Total);
    }

    public String getPreference() {
        return preference;
    }
    
    public String toString(){
        return "Spa and Sauna\n"+super.toString()+"\nYou are getting a "+preference+" service\n\n";
    }
    
}
