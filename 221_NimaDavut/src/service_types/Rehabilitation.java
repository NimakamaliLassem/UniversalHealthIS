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
public class Rehabilitation extends Services{
    
    private String preference;
    
    public Rehabilitation(int daysAttending, String timeDuringDay, String serviceLevel, String preference){
        super(daysAttending, timeDuringDay, serviceLevel);
        //getInput();
        this.preference = preference;
    }
    /*public void getInput(){
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your preference (Mental/Physical/PostInjury/PostSurgery) : ");
        preference = sc.next();
    }*/
    
    
    @Override
    void calcCost() {
        double Total = 0;
        if(super.timeDuringDay.equalsIgnoreCase("morning"))
            Total+=200;
        else if(super.timeDuringDay.equalsIgnoreCase("afternoon"))
            Total+=250;
        else
            Total+=350;
        
        if(preference.equalsIgnoreCase("physical"))
            Total+=50;
        else if(preference.equalsIgnoreCase("Postsurgery"))
            Total+=100;
        else if(preference.equalsIgnoreCase("postinjury"))
            Total+=150;
        
        if(super.serviceLevel.equalsIgnoreCase("luxury"))
            Total *= 1.5;
        else if(super.serviceLevel.equalsIgnoreCase("grand"))
            Total *= 2;
        
        super.setCost(Total);
    }

    public String getPreference() {
        return preference;
    }
    
    @Override
   public String toString(){
        return "Rehablitiation\n"+super.toString()+"You have a "+preference+" rehabilitation\n\n";
    }
}
