/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.util.Scanner;

/**
 *
 * @author Davut Atajanov
 */
public class Coach extends UniverseHealth{
    //private String coachType;
    private int workDays;
    private String employmentType;
    private boolean workingStatus = true;
    private double salary;
    private String charity;
    Bonuses bonus = new Bonuses();
    
    Scanner sc = new Scanner(System.in);
    
    /*Coach(int id, String nameSurname, String password){
        super(id, nameSurname, password);
        getInput();
    }*/

    public Coach(int id, String nameSurname, String password, String employmentType, String charity, int workDays, boolean insurance, int extraDays) {
        super(id, nameSurname, password);
        this.employmentType = employmentType;
        this.charity = charity;
        this.workDays = workDays;
        bonus.insurance = insurance;
        bonus.extraShiftBonuses = extraDays;
        
        calcSalary();
        
    }
    
    
    /*public void getInput(){
        
        Scanner sc = new Scanner(System.in);
        //System.out.println("When do you wish to work? (1/3/5 or 2/4/6) : ");
        for(int i=0;i<3;i++)
            workDays[i] = sc.nextInt();
        //System.out.println("Full-time or part-time : (part/full)");
        employmentType = sc.next();
        //System.out.println("Do you want to work as a volunteer? (Yes/No)");
        charity = sc.next();
        //System.out.println("Do you have insurance? : (if not we will give for 50% price)");
        String choiceIns = sc.next();
        /*if(choiceIns.equalsIgnoreCase("yes"))
        bonus.setInsurance(true);
        else
            bonus.setInsurance(false);
        
        calcSalary();
        
    }*/
    
    public void calcSalary(){
        double Total = 0;
        if(this.employmentType.equalsIgnoreCase("full"))
            Total = 4000;
        else if (this.employmentType.equalsIgnoreCase("part"))
            Total = 2000;
        
//        int extraDays;
//        System.out.println("How many extra days did you work? ");
//        extraDays = sc.nextInt();
        

        Total += bonus.extraShiftBonuses * 100;
        
        if(!bonus.insurance)
            Total -= 250;
        
        salary = Total;
        serviceType();
    }

    public boolean isWorkingStatus() {
        return workingStatus;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    void serviceType() {
        if(charity.equalsIgnoreCase("yes"))
            salary *= 0.25;
    }
    
    @Override
    public String toString(){
        String workingS;
        if(workingStatus)
        workingS = "Yes";
        else
            workingS = "No";
        
        String newWorkDays;
        if(workDays==1)
            newWorkDays = "Monday, Wednesday, Friday";
        else
            newWorkDays = "Tuesday, Thursday, Saturday";
        
        return /*"Choach type : "+coachType+*/
                "\nWork Shifts : "+newWorkDays+
                "\nEmployment Type : "+employmentType+
                "\nWorking right now or not : "+workingS+
                "\nSalary : "+salary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public String getCharity() {
        return charity;
    }

    public Bonuses getBonus() {
        return bonus;
    }
    
    
}
