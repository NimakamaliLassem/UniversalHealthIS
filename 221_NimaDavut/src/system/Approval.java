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
public class Approval {
    private int healthCondition = -1; // health condition index from 1-5
    private String approvedDoctor = "Unassigned";
    
    /*public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your health condition : (1-5)");
        healthCondition = sc.nextInt();
        System.out.println("What is the approved doctor's name : ");
        approvedDoctor = sc.nextLine();
    }*/

    public Approval(int healthCondition, String approvedDoctor) {
        this.healthCondition = healthCondition;
        this.approvedDoctor = approvedDoctor;
    }
    
    public int getHealthCondition() {
        return healthCondition;
    }

    public String getApprovedDoctor() {
        return approvedDoctor;
    }
    
}
