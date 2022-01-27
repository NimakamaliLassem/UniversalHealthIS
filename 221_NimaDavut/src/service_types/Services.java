/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service_types;

/**
 *
 * @author Davut Atajanov
 */
public abstract class Services{
    
       protected int daysAttending;
       protected String timeDuringDay;
       protected String serviceLevel;
       protected double cost;
       //protected String preference;

    Services(int daysAttending, String timeDuringDay, String serviceLevel) {
        this.daysAttending = daysAttending;
        this.timeDuringDay = timeDuringDay;
        this.serviceLevel = serviceLevel;
    }
       
    abstract void calcCost();

    public int getDaysAttending() {
        return daysAttending;
    }

    public String getTimeDuringDay() {
        return timeDuringDay;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public double getCost(){
        return cost;
    }
    
    public String toString(){
        String newWorkDays;
        if(daysAttending==1)
            newWorkDays = "\nMonday, Wednesday, Friday";
        else
            newWorkDays = "\nTuesday, Thursday, Saturday";
        
        return "You attend on these days : "+newWorkDays+
                "\nYou come in the "+timeDuringDay+"s"+
                "\nYou receive "+serviceLevel+" service";
                
    }
}
