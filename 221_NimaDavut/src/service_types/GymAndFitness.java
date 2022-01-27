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
public class GymAndFitness extends Services{
    
    private String preference;
    
    public GymAndFitness(int daysAttending, String timeDuringDay, String serviceLevel, String preference){
        super(daysAttending, timeDuringDay, serviceLevel);
        //getInput();
        this.preference = preference;
    }
    /*public void getInput(){
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your preference (Cardio/Strength/Mass) : ");
        preference = sc.next();
    }*/
    
    
    @Override
    void calcCost() {
        double Total = 0;
        if(super.timeDuringDay.equalsIgnoreCase("morning"))
            Total+=100;
        else if(super.timeDuringDay.equalsIgnoreCase("afternoon"))
            Total+=125;
        else
            Total+=150;
        
        if(preference.equalsIgnoreCase("mass"))
            Total+=15;
        else if(preference.equalsIgnoreCase("strength"))
            Total+=20;
        
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
        return "Gym And Fitness\n" + super.toString() + "\nYou are doing "+ preference + " workout\n\n";
    }
}
