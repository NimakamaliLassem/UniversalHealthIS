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
public class YogaAndStretching extends Services{
    
    private String preference;
    
    public YogaAndStretching(int daysAttending, String timeDuringDay, String serviceLevel, String preference){
        super(daysAttending, timeDuringDay, serviceLevel);
        //getInput();
        this.preference = preference;
    }
    /*public void getInput(){
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your preference (Yoga/Stretching/Pilates) : ");
        preference = sc.next();
    }*/
    
    
    @Override
    void calcCost() {
        double Total = 0;
        if(super.timeDuringDay.equalsIgnoreCase("morning"))
            Total+=75;
        else if(super.timeDuringDay.equalsIgnoreCase("afternoon"))
            Total+=100;
        else
            Total+=125;
        
        if(preference.equalsIgnoreCase("yoga"))
            Total+=20;
        else if(preference.equalsIgnoreCase("pilates"))
            Total+=25;
        
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
        return "Yoga and Stretching\n"+super.toString()+"\nYou are doing a "+preference+" stretching\n\n";
    }
}
